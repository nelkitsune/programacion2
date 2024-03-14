package Funciones;
import Vehiculo.Vehiculo;
import Vehiculo.*;
import java.util.ArrayList;
import java.util.List;

public class Catalogar {
    public void catalogar(List<Vehiculo> lista_auto) {
        for (Vehiculo i : lista_auto) {
            String nombreClase = i.getClass().getSimpleName();
            System.out.println(nombreClase);
            System.out.println("nombre: " + i.getNombre());
            System.out.println("cantidad de ruedas: " + i.getRuedas());
            System.out.println("color: " + i.getColor());

            if (i instanceof Camioneta) {
                System.out.println("cilindrada: " + ((Camioneta) i).getCilindrada());
                System.out.println("velocidad: " + ((Camioneta) i).getVelocidad());
                System.out.println("carga: " + ((Camioneta) i).getCarga());
            } else if (i instanceof Motocivleta) {
                System.out.println("cilindrada: " + ((Motocivleta) i).getCilindrada());
                System.out.println("velocidad: " + ((Motocivleta) i).getVelocidad());
                System.out.println("tipo: " + ((Motocivleta) i).getTipo());
            } else if (i instanceof Coche) {
                System.out.println("cilindrada: " + ((Coche) i).getCilindrada());
                System.out.println("velocidad: " + ((Coche) i).getVelocidad());
            } else if (i instanceof Bicicleta) {
                System.out.println("cilindrada: " + ((Bicicleta) i).getTipo());
            }
            System.out.println("-----------------------");
        }
    }

    public void catalogar_V2(List<Vehiculo> lista_auto) {
        int contador;
        for (int j = 0; j <= 4; j+=2) {
            contador = 0;
            for (Vehiculo i : lista_auto) {
                if (i.getRuedas() == j){
                    contador++;
                }
            }
            System.out.println("Se han encontrado " +contador+ " vehículos con " + j +" ruedas");
            System.out.println("-----------------------");

        }
    }
}

