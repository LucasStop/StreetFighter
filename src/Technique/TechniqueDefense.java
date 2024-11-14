package Technique;

import Player.Player;

public class TechniqueDefense extends Technique {
    private int defenseBoost;

    public TechniqueDefense(String name, int power, int energyCost, int cooldown, String description, int defenseBoost) {
        super(name, power, energyCost, "Defesa", cooldown, description);
        this.defenseBoost = defenseBoost;
    }

    public int getDefenseBoost() {
        return defenseBoost;
    }

    public void setDefenseBoost(int defenseBoost) {
        this.defenseBoost = defenseBoost;
    }

    @Override
    public void applyEffect(int effect) {
        super.applyEffect(effect);
    }

    public void displayInfo() {
        System.out.println("Defense Information");
        System.out.println("Name: " + getName());
        System.out.println("Power: " + getPower());
        System.out.println("EnergyCost: " + getEnergyCost());
        System.out.println("Type: " + getType());
        System.out.println("Cooldown: " + getCooldown());
        System.out.println("Description: " + getDescription());
        System.out.println("DefenseBoost: " + getDefenseBoost());
    }
}
