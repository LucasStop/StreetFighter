package Technique;

import Character.Character;

public class TechniqueHealing extends Technique {
    public TechniqueHealing(String name, int power, int energyCost, int cooldown) {
        super(name, power, energyCost, "Tecnica.TecnicaCura", cooldown, "Recuperação");
    }

    private int healthPoints;

    public TechniqueHealing(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damage)
        this.healthPoints -=damage;
    if(this.healthPoints< 0)

    {
        this.healthPoints = 0;
    }
    System.out.println("vida restante;"+this.healthPoints);
}
public int getTechniqueHealingPoints() {
}

    @Override
    public void applyEffect(Character target) {
        super.applyEffect(target);
        System.out.println(getName() + " curou " + getPower() + " de vida!");
    }
}