package Empleados;

public class FullTimeEmployee extends Employee{
    private float yerlyBonus;

    public FullTimeEmployee(int id, String name, float salary, float yerlyBonus) {
        super(id, name, salary);
        this.yerlyBonus = yerlyBonus;
    }

    public float getYerlyBonus() {
        return yerlyBonus;
    }

    public void setYerlyBonus(float yerlyBonus) {
        this.yerlyBonus = yerlyBonus;
    }
    @Override
    public float calculateSalary(){
        return super.calculateSalary() + getYerlyBonus();
    }
}
