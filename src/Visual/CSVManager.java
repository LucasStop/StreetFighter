package Visual;

import Player.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVManager {
    private static final String CSV_FILE = "characters.csv";

    public static void saveCharacterToCSV(Player player, String type) {
        try (FileWriter writer = new FileWriter(CSV_FILE, true)) {
            writer.append(type).append(",");
            writer.append(player.getName()).append(",");
            writer.append(String.valueOf(player.getAge())).append(",");
            writer.append(String.valueOf(player.getStrength())).append(",");
            writer.append(String.valueOf(player.getSpeed())).append(",");
            writer.append(String.valueOf(player.getLife())).append(",");
            writer.append(String.valueOf(player.getLevel())).append("\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar personagem no arquivo CSV.");
        }
    }

    public static List<Player> loadCharactersFromCSV(String type) {
        List<Player> players = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length < 7) continue;

                String characterType = fields[0];
                if (!characterType.equals(type)) continue;

                String name = fields[1];
                int age = Integer.parseInt(fields[2]);
                int strength = Integer.parseInt(fields[3]);
                int speed = Integer.parseInt(fields[4]);
                int life = Integer.parseInt(fields[5]);
                int level = Integer.parseInt(fields[6]);

                Player player;
                if ("Ninja".equals(characterType)) {
                    player = new PlayerNinja(name, age, strength, speed, life, level, 90);
                } else {
                    player = new PlayerWarrior(name, age, strength, speed, life, level, 50, 70);
                }

                players.add(player);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar personagens do arquivo CSV.");
        }

        return players;
    }
}
