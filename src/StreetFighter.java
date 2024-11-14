import javax.swing.*;
import java.awt.*;
import Visual.CharacterChooser;
import Visual.CharacterCreationWindow;

public class StreetFighter {
    private static JTextArea logArea;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Street Fighter - Torneio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Escolha seu personagem e entre no torneio!");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton ninjaButton = new JButton("Ninja");
        ninjaButton.setPreferredSize(new Dimension(120, 50));
        ninjaButton.addActionListener(e -> CharacterChooser.chooseCharacter("Ninja", logArea));

        JButton guerreiroButton = new JButton("Guerreiro");
        guerreiroButton.setPreferredSize(new Dimension(120, 50));
        guerreiroButton.addActionListener(e -> CharacterChooser.chooseCharacter("Guerreiro", logArea));

        JButton startTournamentButton = new JButton("Iniciar Torneio");
        startTournamentButton.setPreferredSize(new Dimension(150, 50));
        startTournamentButton.addActionListener(e -> logArea.setText("Implementar lógica para iniciar o torneio com os personagens selecionados.\n"));

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
}
