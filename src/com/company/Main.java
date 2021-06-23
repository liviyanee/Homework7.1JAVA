package com.company;

public class Main {


    public static void main(String[] args) {
     Magic magic = new Magic();
     magic.setTypeOfSuperPower("magical");
     Medic medic = new Medic();
     medic.setTypeOfSuperPower("medical");
     Warrior warrior = new Warrior();
     warrior.setTypeOfSuperPower("military");
     Hero[] hero = {warrior, magic, medic};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility(" ");

        }


    }
}
