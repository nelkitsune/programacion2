import java.util.ArrayList;

public class Alumno extends Person{

    public ArrayList<Grupo> pertenece = new ArrayList<>();

    public Alumno(String name, int dni, Grupo grupo) {
        super(name, dni);
        pertenece.add(grupo);
        grupo.agregar_alumno(this);
    }

    public ArrayList<Grupo> getPertenece() {
        return pertenece;
    }

    public void setPertenece(ArrayList<Grupo> pertenece) {
        this.pertenece = pertenece;
    }
    public void agregar_grupo(Grupo grupo){
        pertenece.add(grupo);
    }
}
