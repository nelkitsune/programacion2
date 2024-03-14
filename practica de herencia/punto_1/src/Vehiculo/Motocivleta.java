package Vehiculo;

public class Motocivleta extends Bicicleta{
    private int velocidad;
    private int cilindrada;

    public Motocivleta(String tipo, int velocidad, int cilindrada) {
        super(tipo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Motocivleta(String nombre,String color, int ruedas, String tipo, int velocidad, int cilindrada) {
        super(nombre,color, ruedas, tipo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public String getNombre() {
        return nombre;
    }
    public void mostrarDatos(){
        System.out.println(getNombre()+" "+getCilindrada()+" "+getColor()+" "+getVelocidad()+" "+getRuedas()+" "+getTipo());
    }
}
