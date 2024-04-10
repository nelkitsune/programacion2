import Rpg.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard("Nel", "Elfo", 15, 50, 6, 7, 3);
        Wizard wizard2 = new Wizard("Maximilius", "gnomo", 14, 40, 6, 6, 1);
        Warrior warrior1 = new Warrior("Melkor", "Humano", 15, 70, 7, 7, 4);
        Warrior warrior2 = new Warrior("isildur", "semi-elfo", 10, 65, 7, 6, 3);
        Rogue rogue1 = new Rogue("Zack", "humano", 5, 50, 6, 4);
        Rogue rogue2 = new Rogue("kazuki", "\"humano\"", 15, 60, 6, 6);
        int damage;
        int count = 0;
        System.out.println("-----------------");
        System.out.println("Primer combate");
        while (true) {
            System.out.println("turno de " + warrior1.getName());
            damage = warrior1.attack();
            System.out.println(warrior1.getName() + " hace " + damage + " puntos de daño");
            rogue1.defend(damage);
            if (rogue1.getHp() < 0) {
                System.out.println(rogue1.getName() + " Murio");
                System.out.println(warrior1.getName() + " Gana");
                break;
            }
            System.out.println("turno de " + rogue1.getName());
            damage = rogue1.attack();
            System.out.println(rogue1.getName() + " hace " + damage + " puntos de daño");
            warrior1.defend(damage);
            if (warrior1.getHp() < 0) {
                System.out.println(warrior1.getName() + " Murio");
                System.out.println(rogue1.getName() + " Gana");
                break;
            }

        }
        System.out.println("-----------------");
        System.out.println("segundo combate");
        while (true) {
            System.out.println("turno de " + wizard1.getName());
            damage = wizard1.attack();
            System.out.println(wizard1.getName() + " hace " + damage + " puntos de daño");
            warrior2.defend(damage);
            if (warrior2.getHp() < 0) {
                System.out.println(warrior2.getName() + " Murio");
                System.out.println(wizard1.getName() + " Gana");
                break;
            }
            System.out.println("turno de " + warrior2.getName());
            damage = warrior2.attack();
            System.out.println(warrior2.getName() + " hace " + damage + " puntos de daño");
            wizard1.defend(damage);
            if (wizard1.getHp() < 0) {
                System.out.println(wizard1.getName() + " Murio");
                System.out.println(warrior2.getName() + " Gana");
                break;
            }
        }
        while (true) {
            System.out.println("turno de " + wizard2.getName());
            damage = wizard2.attack();
            System.out.println(wizard2.getName() + " hace " + damage + " puntos de daño");
            rogue2.defend(damage);
            if (rogue2.getHp() < 0) {
                System.out.println(rogue2.getName() + " Murio");
                System.out.println(wizard2.getName() + " Gana");
                break;
            }
            System.out.println("turno de " + rogue2.getName());
            damage = rogue2.attack();
            System.out.println(rogue2.getName() + " hace " + damage + " puntos de daño");
            wizard2.defend(damage);
            if (wizard2.getHp() < 0) {
                System.out.println(wizard2.getName() + " Murio");
                System.out.println(rogue2.getName() + " Gana");
                break;
            }
        }
    }
}