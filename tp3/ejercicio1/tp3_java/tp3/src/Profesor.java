import java.lang.reflect.Array;
import java.util.ArrayList;

public class Profesor extends Person{
    private String departamento;
    private ArrayList<Asignatura> imparte = new ArrayList<>();

    public Profesor(String name, int dni, String departamento, Asignatura asignatura) {
        super(name, dni);
        this.departamento = departamento;
        imparte.add(asignatura);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Asignatura> getImparte() {
        return imparte;
    }

    public void setImparte(Asignatura asignatura) {
        imparte.add(asignatura);
    }
    public void agregar_asignatura(Asignatura nuevaAsignatura){
        imparte.add(nuevaAsignatura);
    }
}
