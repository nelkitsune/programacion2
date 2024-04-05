import Figura.*;
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);

        System.out.println("El area del cuadrado es = "+cuadrado1.area());

        cuadrado1.dibujar();
        cuadrado1.rotar();

        Circulo circulo = new Circulo(3);
        circulo.dibujar();
    }
}