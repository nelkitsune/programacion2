
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Eliminar una tarea");
            System.out.println("4. Salir del programa");
            System.out.print("Ingrese la opción deseada: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la descripción de la tarea: ");
                        String descripcion = scanner.nextLine();
                        System.out.print("Ingrese la prioridad de la tarea (entero): ");
                        int prioridad = scanner.nextInt();
                        listaDeTareas.agregarTarea(new Tarea(descripcion, prioridad));
                        System.out.println("Tarea agregada correctamente.");
                        break;
                    case 2:
                        System.out.println("--- Todas las tareas ---");
                        if (listaDeTareas.obtenerNumeroTareas() == 0) {
                            System.out.println("No hay tareas en la lista.");
                        } else {
                            for (Tarea tarea : listaDeTareas) {
                                System.out.println(tarea);
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese la descripción de la tarea a eliminar: ");
                        String descripcionEliminar = scanner.nextLine();
                        listaDeTareas.eliminarTarea(descripcionEliminar);
                        break;
                    case 4:
                        System.out.println("¡Hasta luego!");
                        System.exit(0);
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese un valor válido.");
                scanner.next();
            }
        }
    }
}
