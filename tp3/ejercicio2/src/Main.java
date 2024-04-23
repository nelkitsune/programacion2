public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("antonio");
        Empleado empleado2 = new Empleado("tonio");

        empleado1.asignar_supervisor(empleado2);
        empleado1.obtener_nombre_spervisor();
        empleado2.obtener_nombre_spervisor();
    }
}