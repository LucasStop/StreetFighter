package Player;

public class PlayerWarrior extends Player {
    private int armor;
    private int stamina;

    public PlayerWarrior(String name, int age, int strength, int speed, int life, int level, int armor, int stamina) {
        super(name, age, strength, speed, life, level);
        this.armor = armor;
        this.stamina = stamina;
    }

    public int getArmor() {

        return armor;
    }

    public void setArmor(int armor) {

        this.armor = armor;
    }

    public  int getStamina(){
        return stamina;
    }
    public void setStamina(int stamina){
        this.stamina = stamina;
    }

    public void specialattack(){
        int staminaCost = 10;

        if (stamina>=staminaCost){
            int damage = 10;
            target.applydamage(damage);
            stamina -= staminaCost;
        }
    }
    @Override
    public void applyDamage(int damage) {
        super.applyDamage(damage - armor);
    }

    @Override
    public void heal(int heal) {
        super.heal(heal + armor);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        armor += 5;
    }
    @Override
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Stamina " + this.stamina);
    }
}
