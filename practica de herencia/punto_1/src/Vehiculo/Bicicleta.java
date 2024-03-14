package Vehiculo;

public  class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public Bicicleta(String nombre,String color, int ruedas, String tipo) {
        super(nombre,color, ruedas);
        this.tipo = tipo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void mostrarDatos(){
        System.out.println(getNombre()+" "+getColor()+" "+getRuedas()+" "+ getTipo());
    }
}
