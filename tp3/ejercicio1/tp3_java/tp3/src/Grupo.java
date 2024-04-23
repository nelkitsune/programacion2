import java.util.AbstractSet;
import java.util.ArrayList;

public class Grupo {
    private String grupo;
    private char letra;
    public ArrayList<Asignatura> recibe = new ArrayList<>();
    private ArrayList<Person> persona = new ArrayList<>();

    public ArrayList<Person> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Person> persona) {
        this.persona = persona;
    }

    public Grupo(String grupo, char letra) {
        this.grupo = grupo;
        this.letra = letra;
        Alumno alumnobase= new Alumno("antonio", 44140492,this);
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public ArrayList<Asignatura> getRecibe() {
        return recibe;
    }

    public void setRecibe(ArrayList<Asignatura> recibe) {
        this.recibe = recibe;
    }
    public void agregar_alumno(Alumno alumno){
        persona.add(alumno);
    }
    public void agregar_asignatura(Asignatura asignatura){
        recibe.add(asignatura);
        asignatura.setGrupo(this);
    }
}
