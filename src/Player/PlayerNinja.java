package Player;

public class PlayerNinja extends Player {
    private int agility;

    public PlayerNinja(String name, int age, int strength, int speed, int life, int level, int agility) {
        super(name, age, strength, speed, life, level);
        this.agility = agility;
    }

    public int getAgility() {

        return agility;
    }

    public void setAgility(int agility) {

        this.agility = agility;
    }
    public boolean dodge() {
        int dodgeChance = agility;
        int randomValue = (int) (Math.random() * 100) + 1;
        return randomValue <= dodgeChance;
    }


    @Override
    public void applyDamage(int damage) {

        super.applyDamage(damage - agility);
    }

    @Override
    public void heal(int heal) {

        super.heal(heal + agility);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        agility += 5;
    }
    @Override
    public void displayStatus(){
        super.displayStatus();
        System.out.println("agility " + this.agility);
    }
}

