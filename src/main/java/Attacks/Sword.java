package Attacks;

public class Sword implements IWeapon{

    String name;

    public Sword(String name) {
        this.name = name;
    }

    public double attack(double damage){
        return damage += 10;
    }

}