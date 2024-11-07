package Interface;

import Tournament.TournamentIndividual;

import Character.Character;

import javax.swing.*;
import java.awt.*;

public class RoundsMenu extends JFrame {
    private TournamentIndividual tournament;

    public RoundsMenu() {
        setTitle("Iniciar Rodadas");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        getContentPane().add(panel);

        JTextArea txtArea = new JTextArea();
        txtArea.setEditable(false);
        panel.add(new JScrollPane(txtArea), BorderLayout.CENTER);

        JButton btnStart = new JButton("Iniciar Rodadas");

        btnStart.addActionListener(e -> {
            txtArea.setText("Iniciando rodadas para o tournament " + tournament.getName() + "\n");
            for (int i = 0; i < tournament.getParticipants().size() - 1; i++) {
                Character character1 = tournament.getParticipants().get(i);
                Character character2 = tournament.getParticipants().get(i + 1);
                Character winner = tournament.startRound(p1, p2);
                txtArea.append("Rodada " + (i + 1) + ": " + p1.getName() + " vs " + p2.getName() + "\n");
                txtArea.append("Vencedor: " + winner.getName() + "\n");
            }

            txtArea.append("Vencedor do tournament: " + tournament.getParticipants().get(0).getName());
        });

        panel.add(btnStart, BorderLayout.SOUTH);

        setVisible(true);
    }
}
