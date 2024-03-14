import Funciones.Catalogar;
import Vehiculo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalogar cat = new Catalogar();
        Coche auto = new Coche("autos","rojo",4,120,44);
        Camioneta kangoo = new Camioneta("kangoo","rojo",4,120,1904,220);
        Bicicleta bmx  = new Bicicleta("bmx","verde",2,"urbana");
        Motocivleta yamaha = new Motocivleta("yamaha","azul",2,"urbana",120,40);

        kangoo.mostrar_datos();

        List<Vehiculo> lista_vehiculos = new ArrayList<>();
        lista_vehiculos.add(auto);lista_vehiculos.add(kangoo);lista_vehiculos.add(bmx);lista_vehiculos.add(yamaha);

        cat.catalogar(lista_vehiculos);

        cat.catalogar_V2(lista_vehiculos);

    }
}