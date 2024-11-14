package Technique;

import Player.Player;

public class TechniqueAttack extends Technique  {
    public TechniqueAttack(String name, int power, int energyCost, int cooldown) {
        super(name, power, energyCost, "Tecnica.Ataque", cooldown, "Dano");
    }

    @Override
    public void applyEffect(Player target) {
        super.applyEffect(target);
        System.out.println(getName() + " causou " + getPower() + " de dano!");
    }
}