package Visual;

import Visual.CSVManager;

import javax.swing.*;
import java.awt.*;
import Player.*;

public class CharacterCreationWindow extends JFrame {
    public CharacterCreationWindow(JTextArea logArea) {
        setTitle("Criar Novo Personagem");
        setSize(400, 400);
        setLayout(new GridLayout(8, 2));

        JLabel typeLabel = new JLabel("Tipo:");
        JComboBox<String> typeComboBox = new JComboBox<>(new String[]{"Ninja", "Guerreiro"});

        JLabel nameLabel = new JLabel("Nome:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Idade:");
        JTextField ageField = new JTextField();

        JLabel strengthLabel = new JLabel("Força:");
        JTextField strengthField = new JTextField();

        JLabel speedLabel = new JLabel("Velocidade:");
        JTextField speedField = new JTextField();

        JLabel lifeLabel = new JLabel("Vida:");
        JTextField lifeField = new JTextField();

        JButton saveButton = new JButton("Salvar Personagem");
        saveButton.addActionListener(e -> {
            String type = (String) typeComboBox.getSelectedItem();
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            int strength = Integer.parseInt(strengthField.getText());
            int speed = Integer.parseInt(speedField.getText());
            int life = Integer.parseInt(lifeField.getText());

            Player newPlayer;
            if ("Ninja".equals(type)) {
                newPlayer = new PlayerNinja(name, age, strength, speed, life, 1, 90);
            } else {
                newPlayer = new PlayerWarrior(name, age, strength, speed, life, 1, 50, 70);
            }

            CSVManager.saveCharacterToCSV(newPlayer, type);
            logArea.append("Personagem " + name + " criado e salvo!\n");

            dispose();
        });

        add(typeLabel);
        add(typeComboBox);
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(strengthLabel);
        add(strengthField);
        add(speedLabel);
        add(speedField);
        add(lifeLabel);
        add(lifeField);
        add(saveButton);

        setVisible(true);
    }
}
