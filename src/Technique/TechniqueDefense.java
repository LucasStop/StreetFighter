package Technique;

import Character.Character;

public class TechniqueDefense extends Technique {
    private int defeseBoost;

    public TechniqueDefense(String name, int power, int energyCost, String type, int cooldown, String description) {
        super(name, 0, power, energyCost"Defesa", type, cooldown, description);
        this.defenseBoost = defenseBoost;

    }
    public void displayinfo() {
        System.out.println("Defense Information");
        System.out.println("Name:" + this.name +);
        System.out.println("Power:" + this.power);
        System.out.println("EnergyCost:" + this.energyCost);
        System.out.println("Type" + this.type);
        System.out.println("Cooldown" + this.cooldown);
        System.out.println("Description" + this.description);
    }
}