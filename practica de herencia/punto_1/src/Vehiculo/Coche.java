package Vehiculo;

public  class Coche extends Vehiculo {
    protected int velocidad;
    protected int cilindrada;

    
    public Coche(String nombre,String color, int ruedas, int velocidad, int cilindrada) {
        super(nombre,color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Coche(int velocidad, int cilindrada) {
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
        System.out.println(getNombre()+" "+getCilindrada()+" "+getColor()+" "+getVelocidad()+" "+getRuedas());
    }
}
