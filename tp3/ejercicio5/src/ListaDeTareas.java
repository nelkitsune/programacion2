import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListaDeTareas implements Iterable<Tarea> {
    private ArrayList<Tarea> listaTareas;

    public ListaDeTareas() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    public void eliminarTarea(String descripcion) {
        for (Iterator<Tarea> iterator = listaTareas.iterator(); iterator.hasNext();) {
            Tarea tarea = iterator.next();
            if (tarea.getDescripcion().equals(descripcion)) {
                iterator.remove();
                System.out.println("Tarea eliminada: " + tarea);
                return;
            }
        }
        System.out.println("No se encontró ninguna tarea con esa descripción.");
    }

    public int obtenerNumeroTareas() {
        return listaTareas.size();
    }

    @Override
    public Iterator<Tarea> iterator() {
        Collections.sort(listaTareas, (t1, t2) -> t2.getPrioridad() - t1.getPrioridad());
        return listaTareas.iterator();
    }
}