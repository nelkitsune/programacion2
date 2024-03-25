import Empleados.FullTimeEmployee;
import Empleados.PartTimeEmployee;

public class Main {
    public static  void main(String[] args) {
        FullTimeEmployee f1 = new FullTimeEmployee(1,"jose",240,100);
        System.out.println("el salario del empleado "+ f1.getName()+" es "+ f1.calculateSalary());

        PartTimeEmployee p1 = new PartTimeEmployee(2,"raul",50,23,500);
        System.out.println("el salario del empleado "+ p1.getName()+" es "+ p1.calculateSalary());
    }
}