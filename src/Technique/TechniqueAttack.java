package Technique;

import Character.Character;
import java.util.Random;

public class TechniqueAttack extends Technique  {
    private int critChance;
    private double critMultiplier = 2.0;

    public TechniqueAttack(String name, int power, int energyCost, int cooldown) {
        super(name, power, energyCost, "Tecnica.Ataque", cooldown, "Dano");
        this.critChance = critChance;
    }

    @Override
    public void applyEffect(Character target) {
        super.applyEffect(target);

        Random rand = new Random();
        int randomValue = rand.nextInt(100) + 1;

        int finalDamage = getPower();

         if (randomValue <= critChance){
             System.out.println(getName() +" BOAA Acertou um Crìtico!! ");
             finalDamage *= critMultiplier;

         }

         System.out.println(getName() + " causou " + getPower() + " de dano!");
         target.takeDamage(finalDamage);
    }

    @Override
    public String toString() {
        return String.format("Técnica: %s\nTipo: %s\nPotência: %d\nCusto de Energia: %d\nCooldown: %d turnos\nDescrição: %s\nChance de Crítico: %d%%",
                getName(), getType(), getPower(), getEnergyCost(), getCooldown(), getDescription(), critChance);
    }
}