package Trabajadores;

public class Manager extends Employed{
    private String departamento;

    public Manager(String name, int age, int salary, boolean ability_to_work, String departamento) {
        super(name, age, salary, ability_to_work);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void organize_work(){
        System.out.println("organizando trabajo");
        System.out.println("....");
        System.out.println("...");
        System.out.println("..");
        System.out.println(".");
        System.out.println("trabajo organizado");
    }
}
