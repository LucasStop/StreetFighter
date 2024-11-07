package Interface;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("Sistema de Torneios");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton btnCreateChampionship = new JButton("Criar Novo Torneio");
        JButton btnAddParticipant = new JButton("Adicionar Participante");
        JButton btnStartRounds = new JButton("Iniciar Rodadas");

        btnCreateChampionship.addActionListener(e -> new TournamentMenu());
        btnAddParticipant.addActionListener(e -> new AddParticipantMenu());
        btnStartRounds.addActionListener(e -> new RoundsMenu());

        panel.add(btnCreateChampionship);
        panel.add(btnAddParticipant);
        panel.add(btnStartRounds);

        setVisible(true);
    }
}
