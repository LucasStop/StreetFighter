package Technique;

import Player.Player;

public class TechniqueHealing extends Technique {
    private int healingPower;

    public TechniqueHealing(String name, int power, int energyCost, int cooldown, int healingPower) {
        super(name, power, energyCost, "Cura", cooldown, "Recuperação");
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    @Override
    public void applyEffect(int effect) {
        super.applyEffect(effect);
    }

    public void displayInfo() {
        System.out.println("Healing Information");
        System.out.println("Name: " + getName());
        System.out.println("Power: " + getPower());
        System.out.println("EnergyCost: " + getEnergyCost());
        System.out.println("Type: " + getType());
        System.out.println("Cooldown: " + getCooldown());
        System.out.println("Description: " + getDescription());
        System.out.println("Healing Power: " + getHealingPower());
    }
}
