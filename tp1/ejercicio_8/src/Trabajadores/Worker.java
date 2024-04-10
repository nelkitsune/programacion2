package Trabajadores;

public class Worker extends Employed{
    private String  work_area;

    public Worker(String name, int age, int salary, boolean ability_to_work, String work_area) {
        super(name, age, salary, ability_to_work);
        this.work_area = work_area;
    }

    public String getWork_area() {
        return work_area;
    }

    public void setWork_area(String work_area) {
        this.work_area = work_area;
    }
    public void produce(){
        System.out.println("produciendo....");
        System.out.println("producto echo");
    }
}
