import Visual.CharacterChooser;
import Visual.CharacterCreationWindow;
import Tournament.TournamentIndividual;
import Tournament.TournamentTeam;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import Player.Player;

public class StreetFighter {
    private static JTextArea logArea;
    private static final List<Player> selectedPlayers = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Street Fighter - Torneio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Escolha seu personagem e entre no torneio!");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton ninjaButton = new JButton("Ninja");
        ninjaButton.setPreferredSize(new Dimension(120, 50));
        ninjaButton.addActionListener(e -> {
            Player ninja = CharacterChooser.chooseCharacter("Ninja", logArea, selectedPlayers);
            if (ninja != null) {
                selectedPlayers.add(ninja);
            }
        });

        JButton guerreiroButton = new JButton("Guerreiro");
        guerreiroButton.setPreferredSize(new Dimension(120, 50));
        guerreiroButton.addActionListener(e -> {
            Player guerreiro = CharacterChooser.chooseCharacter("Guerreiro", logArea, selectedPlayers);
            if (guerreiro != null) {
                selectedPlayers.add(guerreiro);
            }
        });

        JButton startTournamentButton = new JButton("Iniciar Torneio");
        startTournamentButton.setPreferredSize(new Dimension(150, 50));
        startTournamentButton.addActionListener(e -> startTournament());

        JButton createCharacterButton = new JButton("Criar Personagem");
        createCharacterButton.setPreferredSize(new Dimension(150, 50));
        createCharacterButton.addActionListener(e -> new CharacterCreationWindow(logArea));

        buttonPanel.add(ninjaButton);
        buttonPanel.add(guerreiroButton);
        buttonPanel.add(startTournamentButton);
        buttonPanel.add(createCharacterButton);

        logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(logArea);

        frame.add(buttonPanel, BorderLayout.WEST);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static void startTournament() {
        if (selectedPlayers.isEmpty()) {
            logArea.setText("Nenhum jogador selecionado para o torneio.\n");
            return;
        }

        try {
            if (selectedPlayers.size() == 2) {
                logArea.setText("Iniciando torneio individual com 2 jogadores.\n");
                TournamentIndividual tournament = new TournamentIndividual("Torneio Individual", "Medalha de Ouro", 3);

                try {
                    tournament.addParticipant(selectedPlayers.get(0)); // Adiciona o único participante
                } catch (Exception e) {
                    logArea.append("Erro ao adicionar participante: " + e.getMessage() + "\n");
                    return;
                }

                tournament.startTournament(); // Inicia o torneio individual
                tournament.declareWinner();
            } else {
                logArea.setText("Iniciando torneio em equipe com " + selectedPlayers.size() + " jogadores.\n");
                TournamentTeam tournament = new TournamentTeam("Torneio em Equipe", "Trofeu", selectedPlayers.size());

                for (Player player : selectedPlayers) {
                    try {
                        tournament.addParticipant(player); // Adiciona cada participante
                    } catch (Exception e) {
                        logArea.append("Erro ao adicionar participante: " + player.getName() + " - " + e.getMessage() + "\n");
                        return;
                    }
                }

                tournament.startTournament(); // Inicia o torneio em equipe
                tournament.declareWinner();
            }
        } catch (IllegalArgumentException e) {
            logArea.append("Erro: Argumento inválido - " + e.getMessage() + "\n");
        } catch (NullPointerException e) {
            logArea.append("Erro: Tentativa de usar um objeto nulo - " + e.getMessage() + "\n");
        } catch (Exception e) {
            logArea.append("Erro ao iniciar o torneio: " + e.getMessage() + "\n");
        }
    }

}
