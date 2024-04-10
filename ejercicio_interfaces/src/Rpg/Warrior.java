package Rpg;

import java.util.Random;

public class Warrior extends Character_base {
    Random d8 = new Random();
    private int mod_force;
    private int mod_weapon;

    public Warrior(String name, String raza, int level, int hp, int ca, int force, int mod_weapon) {
        super(name, raza, level, hp, ca);
        this.mod_force = force;
        this.mod_weapon = mod_weapon;
    }

    @Override
    public int attack() {
        int damage = d8.nextInt(8) + 1;
        damage = damage + mod_force + mod_weapon;
        return damage;
    }

    @Override
    public void defend(int damage) {
        int real_damage = damage-getCa();
        if (real_damage <= 0){
            System.out.println("el daño no pudo pasar la CA del guerrero");
        }else {
            int new_hp = getHp()-real_damage;
            setHp(new_hp);
            System.out.println("sufre "+real_damage+" puntos de danio. Te quedan: "+getHp()+" hp");

        }
    }
}
