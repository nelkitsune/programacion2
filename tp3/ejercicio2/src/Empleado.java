
public class Empleado {
    private String nombre;
    private Empleado supervisor = null;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void asignar_supervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }
    public void obtener_nombre_spervisor(){
        if (supervisor == null){
            System.out.println("sin supervisor");
        }else {
            System.out.println("el supervisor es :" + supervisor.getNombre());
        }
    }
}
