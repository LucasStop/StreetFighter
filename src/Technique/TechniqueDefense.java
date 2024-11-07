package Technique;

import Character.Character;

public class TechniqueDefense extends Technique {
    private int defeseBoost;

    public TechniqueDefense(String name, int power, int energyCost, String type, int cooldown, String description) {
        super(name, power, energyCost, type, cooldown, description);
    }

    public int getDefeseBoost() {
        return defeseBoost;
    }

    @Override
    public void applyEffect(Character target) {
        System.out.println(getName() + " ativou uma defesa!");
    }
}
