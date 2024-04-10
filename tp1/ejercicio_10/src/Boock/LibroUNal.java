package Boock;

public class LibroUNal extends BockTxt {
    private String facultad;
    public LibroUNal(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Facultad: " + facultad);
    }
}