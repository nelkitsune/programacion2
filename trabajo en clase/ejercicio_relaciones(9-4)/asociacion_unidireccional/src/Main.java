import uni.*;
public class Main {
    public static void main(String[] args) {
        University utn = new University("Utn");
        University harvard = new University("Harvard");

        Student jose = new Student("jose",utn);
        Student maria = new Student("Maria",harvard);


        System.out.println(jose.getName() + " asiste a la universidad: " + jose.getUniversity().getName());
        System.out.println(maria.getName() + " asiste a la universidad: " + maria.getUniversity().getName());
        jose.setUniversity(harvard);
        System.out.println(jose.getName() + " ahora asiste a la universidad: " + jose.getUniversity().getName());
    }
}