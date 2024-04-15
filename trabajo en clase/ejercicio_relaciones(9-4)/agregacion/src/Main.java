import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John Doe", "Manager");
        Employee employee2 = new Employee("Jane Smith", "Developer");
        Employee employee3 = new Employee("Alice Johnson", "HR Specialist");

        Department department = new Department("Engineering");

        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        System.out.println("Empleados del departamento de " + department.getName() + ":");
        for (Employee employee : department.getEmployees()) {
            System.out.println("- Nombre: " + employee.getName() + ", Cargo: " + employee.getPosition());
        }
    }
}