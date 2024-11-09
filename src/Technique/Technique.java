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
    public String getName(){
        return this.name;

    }
    public void setName(String name){
        this.name = name;

    }
    public int getPower(){
        return this.power;

    }
    public void setPower(int power){
        this.power = power;

    }
    public int getEnergyCost(){
        return this.energyCost;

    }
    public void setenergyCost(int energyCost){
        this.energyCost = energyCost;

    }
    public String getType(){
        return this.type;

    }
    public void setType(String type){
        this.type = type;

    }
    public int getCooldown(){
        return this.cooldown;

    }
    public void setCooldown(int cooldown){
        this.cooldown = cooldown;

    }
    public String getDescription(){
        return this.description;

    }
    public void setDescription(String description){
        this.description;

    }
    public void displayInfo(){
        System.out.println("Character Info");
        System.out.println("Technique Name:" + this.name);
        System.out.println("Power" + this.power);
        System.out.println("EnergyCost" + this.energyCost);
        System.out.println("Type" + this.type);
        System.out.println("Cooldown" + this.cooldown);
        System.out.println("Description" + this.description);
    }
}