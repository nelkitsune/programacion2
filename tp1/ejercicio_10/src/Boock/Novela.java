package Boock;

public class Novela extends Bock{
    private String tipo;
    public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Tipo: " + tipo);
    }
}
