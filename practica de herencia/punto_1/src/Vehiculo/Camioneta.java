package Vehiculo;

public class Camioneta extends Coche{
    private int carga;

    public Camioneta(int velocidad, int cilindrada, int carga) {
        super(velocidad, cilindrada);
        this.carga = carga;
    }

    public Camioneta(String nombre,String color, int ruedas, int velocidad, int cilindrada, int carga) {
        super(nombre,color, ruedas, velocidad, cilindrada);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void mostrar_datos(){
        System.out.println(getColor()+" "+getRuedas()+" "+getVelocidad()+" "+getCilindrada()+" "+getCarga());
    }
    public String getNombre() {
        return nombre;
    }
}
