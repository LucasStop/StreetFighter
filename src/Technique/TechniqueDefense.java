package Technique;

import Player.Player;

public class TechniqueDefense extends Technique {
    private int defeseBoost;

    public TechniqueDefense(String name, int power, int energyCost, String type, int cooldown, String description) {
        super(name, power, energyCost, type, cooldown, description);
    }

    public int getDefeseBoost() {
        return defeseBoost;
    }

    @Override
    public void applyEffect(Player target) {
        System.out.println(getName() + " ativou uma defesa!");
    }
}
