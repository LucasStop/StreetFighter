package Technique;

import Player.Player;

public class TechniqueAttack extends Technique {
    private int critChance;
    private double critMultiplier = 2.0;

    public TechniqueAttack(String name, int power, int energyCost, int cooldown, int critChance) {
        super(name, power, energyCost, "Ataque", cooldown, "Dano");
        this.critChance = critChance;
    }

    @Override
    public void applyEffect(int effect) {
        super.applyEffect(effect);
    }

    public void displayInfo() {
        System.out.println("Attack Information");
        System.out.println("Name: " + getName());
        System.out.println("Power: " + getPower());
        System.out.println("EnergyCost: " + getEnergyCost());
        System.out.println("Type: " + getType());
        System.out.println("Cooldown: " + getCooldown());
        System.out.println("Description: " + getDescription());
    }
}
