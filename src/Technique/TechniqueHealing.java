package Technique;

import Character.Character;

public class TechniqueHealing extends Technique {
    public TechniqueHealing(String name, int power, int energyCost, int cooldown) {
        super(name, power, energyCost, "Tecnica.TecnicaCura", cooldown, "Recuperação");

    }
    package Technique;

import Character.Character;

    public class TechniqueAttack extends Technique {
        private int critChance;
        private double critMultiplier = 2.0;
    }
        public TechniqueAttack(String name, int power, int energyCost, int cooldown) {
            super(name, power, energyCost, "Tecnica.Ataque", cooldown, "Dano");
            this.critChance = critChance;

        }

        public int getHealingPower() {
            return healingPower;
        }

        public void setHealingPower(int healingPower) {
            this.healingPower = healingPower;
        }

        @Override
        public void applyEffect(int effect) {
            super.applyEffect();

        }

    public void displayinfo() {
        System.out.println("Healing Information");
        System.out.println("Name:" + this.name +);
        System.out.println("Power:" + this.power);
        System.out.println("EnergyCost:" + this.energyCost);
        System.out.println("Type" + this.type);
        System.out.println("Cooldown" + this.cooldown);
        System.out.println("Description" + this.description);
        System.out.println("Healing Power: " + this.healingPower);
    }
}