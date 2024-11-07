package Technique;

import Character.Character;

public class TechniqueDefense extends Technique {
    private int defeseBoost;

    public TechniqueDefense(String name, int power, int energyCost, String type, int cooldown, String description) {
        super(name, 0, power, energyCost"Defesa", type, cooldown, description);
        this.defenseBoost = defenseBoost;
    }

    public int getDefeseBoost() {
        return defenseBoost;
    }
        return defenseBoost;
}
    public void setDefenseBoost(int defenseBoost) {
        this.defenseBoost = defenseBoost;

        @Override
        public void applyEffect (Character target){
            System.out.println(getName() + " ativou uma defesa!");

            int newDefese = target.getDefense() + defenseBoost;
            target.setDefense(newDefense);

            System.out.println(target.getName() + "teve sua defesa aumentada em" + efenseBoost + "!");
        }
        if (getHealingPower() > 0) {
            int healingAmount = helingPower;

            int newlife = target.getlife() + healingAmount;

            target.sentlife(newlige);
            target.heal(getHealingPower());// Método que cura o personagem com o healingPower
            System.out.println(target.getName() + " foi curado em " + getHealingPower() + " pontos!");
            System.out.println(target.getName() + " Agora tem" + target.getlife() + " de vida.");
            
        }
    }
        @Override
        public String toString() {
            return String.format("Técnica: %s\nTipo: %s\nPotência: %d\nCusto de Energia: %d\nCooldown: %d turnos\nDescrição: %s\nBônus de Defesa: %d",
                    getName(), getType(), getPower(), getEnergyCost(), getCooldown(), getDescription(), defenseBoost);

    }
}
