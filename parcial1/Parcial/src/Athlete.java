import java.util.ArrayList;


public class Athlete extends Person implements Contract {
    private double height;
    private int age;
    private double weight;

    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public double calculateBMI() {
        return weight / Math.pow(height, 2);
    }

    @Override
    public boolean hasExtraWeight() {
        double imc = calculateBMI();
        return imc > 24.9 && imc < 30;
    }

    @Override
    public double takePulse() {
        return 89;
    }

    public String toString() {
        return  "Nombre= " + getName() +
                " \nAltura= " + getHeight() +
                " \nPeso= " + getWeight() +
                "\nIMC= " + (Math.floor(calculateBMI() * 100) / 100) +
                "\ntiene sobrepeso: " + hasExtraWeight();

    }
}
