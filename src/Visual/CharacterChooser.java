package Visual;

import Player.*;

import java.util.List;
import javax.swing.*;
import java.awt.*;

public class CharacterChooser {
    public static void chooseCharacter(String type, JTextArea logArea) {
        List<Player> players = CSVManager.loadCharactersFromCSV(type);

        if (players.isEmpty()) {
            logArea.setText("Nenhum personagem do tipo " + type + " encontrado.\n");
            return;
        }

        JFrame chooseFrame = new JFrame("Escolher Personagem");
        chooseFrame.setSize(400, 300);
        chooseFrame.setLayout(new BorderLayout());

        DefaultListModel<String> model = new DefaultListModel<>();
        players.forEach(player -> model.addElement(player.getName()));

        JList<String> playerList = new JList<>(model);
        playerList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton selectButton = new JButton("Selecionar");
        selectButton.addActionListener(e -> {
            int index = playerList.getSelectedIndex();
            if (index >= 0) {
                Player selectedPlayer = players.get(index);
                displayPlayerInfo(selectedPlayer, logArea);
                chooseFrame.dispose();
            } else {
                logArea.setText("Por favor, selecione um personagem.\n");
            }
        });

        chooseFrame.add(new JScrollPane(playerList), BorderLayout.CENTER);
        chooseFrame.add(selectButton, BorderLayout.SOUTH);

        chooseFrame.setVisible(true);
    }

    private static void displayPlayerInfo(Player player, JTextArea logArea) {
        StringBuilder info = new StringBuilder();
        info.append("Nome: ").append(player.getName()).append("\n");
        info.append("Nível: ").append(player.getLevel()).append("\n");
        info.append("Força: ").append(player.getStrength()).append("\n");
        info.append("Velocidade: ").append(player.getSpeed()).append("\n");
        info.append("Vida: ").append(player.getLife()).append("\n");
        info.append("Técnicas: ").append(player.getTechniques().size()).append(" técnicas\n");

        logArea.setText(info.toString());
    }
}
