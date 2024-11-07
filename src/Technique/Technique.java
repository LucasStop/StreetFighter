package Technique;

import Character.Character;
import java.util.Random;

public class Technique {
    private String name;
    private int power;
    private int energyCost;
    private String type;
    private int cooldown;
    private String description;

    public Technique(String name, int power, int energyCost, String type, int cooldown, String description) {
        this.name = name;
        this.power = power;
        this.energyCost = energyCost;
        this.type = type;
        this.cooldown = cooldown;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getEnergyCost() {
        return energyCost;
    }
    public void setEnergyCost(int energyCost){
            this.energyCost = energyCost;
        }
    public String getType() {
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getCooldown() {
        return cooldown;
    }
    public void setCooldown(int cooldown){
                this.cooldown = cooldown;
            }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getHealingPower(){
        return healingPower;
    }
    public void SetHealingPower(int healingPower){
        this.healingPower = healingPower;
    }

    public void applyEffect(Character target) {
        System.out.println(getName() + " ativou uma técnica!");
    }

    public abstract void applyEffect(Character target);

@Override
public String toString() {
        return String.format("Técnica: %s\nTipo: %s\nPotência: %d\nCusto de Energia: %d\nCooldown: %d turnos\nDescrição: %s",
                name, type, power, energyCost, cooldown, description);
    }
}
