import javax.swing.*;
import java.awt.*;

import Player.PlayerNinja;
import Player.PlayerWarrior;

public class StreetFighter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Seleção de Personagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());
        JLabel titleLabel = new JLabel("Escolha seu personagem:");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        PlayerNinja ninja = new PlayerNinja("Ninja", 25, 60, 85, 100, 1, 90);
        PlayerWarrior guerreiro = new PlayerWarrior("Guerreiro", 30, 80, 40, 120, 1, 50, 70);

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new FlowLayout());

        JLabel infoLabel = new JLabel("Clique em um personagem para ver detalhes.");
        infoLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        infoPanel.add(infoLabel);

        JButton ninjaButton = new JButton("Ninja");
        ninjaButton.setPreferredSize(new Dimension(120, 50));
        ninjaButton.addActionListener(e -> {
            infoLabel.setText("<html><b>Nome:</b> " + ninja.getName() + "<br>" +
                    "<b>Nível:</b> " + ninja.getLevel() + "<br>" +
                    "<b>Força:</b> " + ninja.getStrength() + "<br>" +
                    "<b>Velocidade:</b> " + ninja.getSpeed() + "<br>" +
                    "<b>Vida:</b> " + ninja.getLife() + "<br>" +
                    "<b>Agilidade:</b> " + ninja.getAgility() + "</html>");
        });

        JButton guerreiroButton = new JButton("Guerreiro");
        guerreiroButton.setPreferredSize(new Dimension(120, 50));
        guerreiroButton.addActionListener(e -> {
            infoLabel.setText("<html><b>Nome:</b> " + guerreiro.getName() + "<br>" +
                    "<b>Nível:</b> " + guerreiro.getLevel() + "<br>" +
                    "<b>Força:</b> " + guerreiro.getStrength() + "<br>" +
                    "<b>Velocidade:</b> " + guerreiro.getSpeed() + "<br>" +
                    "<b>Vida:</b> " + guerreiro.getLife() + "<br>" +
                    "<b>Armadura:</b> " + guerreiro.getArmor() + "<br>" +
                    "<b>Energia:</b> " + guerreiro.getStamina() + "</html>");
        });

        buttonPanel.add(ninjaButton);
        buttonPanel.add(guerreiroButton);

        frame.add(buttonPanel, BorderLayout.WEST);
        frame.add(infoPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
