package Rpg;

import java.util.Random;

public class Wizard extends Character_base{
    Random d6 = new Random();
    private int mod_intelligence;
    private int mod_anillo_magico;

    public Wizard(String name, String raza, int level, int hp, int ca, int intelligence, int mod_anillo_magico) {
        super(name, raza, level, hp, ca);
        this.mod_intelligence = intelligence;
        this.mod_anillo_magico = mod_anillo_magico;
    }

    public int getIntelligence() {
        return mod_intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.mod_intelligence = intelligence;
    }

    public int getMod_anillo_magico() {
        return mod_anillo_magico;
    }

    public void setMod_anillo_magico(int mod_anillo_magico) {
        this.mod_anillo_magico = mod_anillo_magico;
    }

    @Override
    public int attack() {
        int damage = (d6.nextInt(6) + 1) +( d6.nextInt(6) + 1) + (d6.nextInt(6) + 1);
        damage = damage + mod_intelligence + mod_anillo_magico;
        return damage;
    }
    @Override
    public void defend(int damage) {
        int real_damage = damage-getCa();
        if (real_damage <= 0){
            System.out.println("el daño no pudo pasar la CA del mago");
        }else {
            int new_hp = getHp()-real_damage;
            setHp(new_hp);
            System.out.println("sufre "+real_damage+" puntos de danio. Te quedan: "+getHp()+" hp");

        }
    }
}
