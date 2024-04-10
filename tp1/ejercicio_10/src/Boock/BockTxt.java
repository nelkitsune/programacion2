package Boock;

public class BockTxt extends Bock{
    private String curso;

    public BockTxt(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Curso: " + curso);
    }
}
