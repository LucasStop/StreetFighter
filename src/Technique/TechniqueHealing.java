package Technique;

import Player.Player;

public class TechniqueHealing extends Technique {
    public TechniqueHealing(String name, int power, int energyCost, int cooldown) {
        super(name, power, energyCost, "Tecnica.TecnicaCura", cooldown, "Recuperação");
    }

    @Override
    public void applyEffect(Player target) {
        super.applyEffect(target);
        System.out.println(getName() + " curou " + getPower() + " de vida!");
    }
}