import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> dia_semana = new ArrayList<>(7);
        dia_semana.add("lunes");
        dia_semana.add("martes");
        dia_semana.add("miercoles");
        dia_semana.add("jueves");
        dia_semana.add("viernes");
        dia_semana.add("sabado");
        dia_semana.add("domingo");


        dia_semana.set(3,"juernes");

        System.out.println(dia_semana.get(3)+" "+dia_semana.get(4));

        System.out.println(dia_semana.get(0)+" "+dia_semana.get(6));

        dia_semana.remove(3);
        System.out.println(dia_semana.get(2));

        Iterator<String> it = dia_semana.iterator();
        System.out.println("________________");

        while (it.hasNext()){
            System.out.println(it.next());
        }
        Iterator<String> it2 = dia_semana.iterator();
        while (it2.hasNext()){
            if(it2.next().equals("Lunes")){
                System.out.println("elemento encontrado");
                break;
            }
        }
        Iterator<String> it3 = dia_semana.iterator();
        while (it3.hasNext()){
            if(it3.next().equalsIgnoreCase("Lunes")){
                System.out.println("elemento encontrado");
                break;
            }
        }

    }
}