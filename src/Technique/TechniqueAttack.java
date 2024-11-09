package Technique;

import Character.Character;

public class TechniqueAttack extends Technique  {
    private int critChance;
    private double critMultiplier = 2.0;

    public TechniqueAttack(String name, int power, int energyCost, int cooldown) {
        super(name, power, energyCost, "Tecnica.Ataque", cooldown, "Dano");
        this.critChance = critChance;

    }
    public void displayinfo(){
        System.out.println("Attack Information");
        System.out.println("Name:" + this.name +);
        System.out.println("Power:" + this.power);
        System.out.println("EnergyCost:" + this.energyCost);
        System.out.println("Type" + this.type);
        System.out.println("Cooldown" + this.cooldown);
        System.out.println("Description" + this.description);
    }
}