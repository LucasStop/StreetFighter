package Technique;

import Character.Character;

public class TechniqueDefense extends Technique {
    private int defeseBoost;

    public TechniqueDefense(String name, int power, int energyCost, String type, int cooldown, String description) {
        super(name, 0, power, energyCost"Defesa", type, cooldown, description);
        this.defenseBoost = defenseBoost;

    }
    package Technique;

import Character.Character;

    public class TechniqueAttack extends Technique  {
        private int critChance;
        private double critMultiplier = 2.0;

        public TechniqueAttack(String name, int power, int energyCost, int cooldown) {
            super(name, power, energyCost, "Tecnica.Ataque", cooldown, "Dano");
            this.critChance = critChance;

        }

        public int getDefenseBoost() {
            return defenseBoost;
        }

        public void setDefenseBoost(int defenseBoost) {
            this.defenseBoost = defenseBoost;
        }

        @Override
        public void applyEffect(int effect) {
            super.applyEffect();

        }

    public void displayinfo() {
        System.out.println("Defense Information");
        System.out.println("Name:" + this.name +);
        System.out.println("Power:" + this.power);
        System.out.println("EnergyCost:" + this.energyCost);
        System.out.println("Type" + this.type);
        System.out.println("Cooldown" + this.cooldown);
        System.out.println("Description" + this.description);
        System.out.println("DefenseBoost" + this.defenseBoost);
    }
}