package Rpg;

import java.util.Random;

public class Rogue extends Character_base{
    Random d4 = new Random();
    Random d6 = new Random();
    private int mod_skill;


    public Rogue(String name, String raza, int level, int hp, int ca, int mod_skill) {
        super(name, raza, level, hp, ca);
        this.mod_skill = mod_skill;

    }

    public int getMod_skill() {
        return mod_skill;
    }

    public void setMod_skill(int mod_skill) {
        this.mod_skill = mod_skill;
    }

    @Override
    public int attack() {
        int snake_damage = (d6.nextInt(6) + 1) +( d6.nextInt(6) + 1) + (d6.nextInt(6) + 1);
        int damage =  d4.nextInt(4)+1;
        damage = damage + mod_skill + snake_damage;
        return damage;
    }
    @Override
    public void defend(int damage) {
        int real_damage = damage-getCa();
        if (real_damage <= 0){
            System.out.println("El daño no pudo pasar la CA del Picaro");
        }else {
            int new_hp = getHp()-real_damage;
            setHp(new_hp);
            System.out.println("sufre "+real_damage+" puntos de danio. Te quedan: "+getHp()+" hp");

        }
    }
}
