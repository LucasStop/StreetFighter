package Technique;

import Character.Character;

public class TechniqueHealing extends Technique {
    public TechniqueHealing(String name, int power, int energyCost, int cooldown) {
        super(name, power, energyCost, "Tecnica.TecnicaCura", cooldown, "Recuperação");
    }

    @Override
    public void applyEffect(Character target) {
        super.applyEffect(target);
        System.out.println(getName() + " curou " + getPower() + " de vida!");
    }
}