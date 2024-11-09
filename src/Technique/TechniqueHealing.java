package Technique;

import Character.Character;

public class TechniqueHealing extends Technique {
    public TechniqueHealing(String name, int power, int energyCost, int cooldown) {
        super(name, power, energyCost, "Tecnica.TecnicaCura", cooldown, "Recuperação");

    }
    public void displayinfo() {
        System.out.println("Healing Information");
        System.out.println("Name:" + this.name +);
        System.out.println("Power:" + this.power);
        System.out.println("EnergyCost:" + this.energyCost);
        System.out.println("Type" + this.type);
        System.out.println("Cooldown" + this.cooldown);
        System.out.println("Description" + this.description);
    }
}