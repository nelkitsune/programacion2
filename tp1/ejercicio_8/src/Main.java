import Trabajadores.Manager;
import Trabajadores.Worker;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("jose",23,245,true,"contabilidad");
        Worker worker1 = new Worker("papsuta",23,123,true,"almacen");
        manager1.organize_work();
        worker1.produce();
    }
}