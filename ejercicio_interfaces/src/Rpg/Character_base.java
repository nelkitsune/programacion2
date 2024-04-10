package Rpg;

public class  Character_base implements Character{

    private String name;
    private String raza;
    private int level;
    private int hp;
    private int ca;
    private int initiative;

    public Character_base(String name, String raza, int level, int hp,int ca) {
        this.name = name;
        this.raza = raza;
        this.level = level;
        this.hp = hp;
        this.ca=ca;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public void defend(int damage) {

    }
}
