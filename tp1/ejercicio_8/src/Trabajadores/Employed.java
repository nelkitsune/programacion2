package Trabajadores;

abstract class Employed {
    protected String name;
    protected int age;
    protected int salary;
    protected boolean Ability_to_work;

    public Employed(String name, int age, int salary, boolean ability_to_work) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Ability_to_work = ability_to_work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isAbility_to_work() {
        return Ability_to_work;
    }

    public void setAbility_to_work(boolean ability_to_work) {
        Ability_to_work = ability_to_work;
    }
}
