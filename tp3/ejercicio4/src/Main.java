import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar nuevo alumno");
            System.out.println("2. Mostrar lista de alumnos");
            System.out.println("3. Calcular y mostrar media de notas");
            System.out.println("4. Mostrar alumno con la nota más alta");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción deseada: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del alumno: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la edad del alumno: ");
                        int edad = scanner.nextInt();
                        System.out.print("Ingrese la nota del alumno: ");
                        double nota = scanner.nextDouble();
                        listaAlumnos.add(new Alumno(nombre, edad, nota));
                        System.out.println("Alumno agregado correctamente.");
                        break;
                    case 2:
                        System.out.println("--- Lista de Alumnos ---");
                        for (Alumno alumno : listaAlumnos) {
                            System.out.println(alumno);
                        }
                        break;
                    case 3:
                        if (listaAlumnos.isEmpty()) {
                            System.out.println("No hay alumnos en la lista.");
                        } else {
                            double sumaNotas = 0;
                            for (Alumno alumno : listaAlumnos) {
                                sumaNotas += alumno.getNota();
                            }
                            double mediaNotas = sumaNotas / listaAlumnos.size();
                            System.out.println("La media de notas de todos los alumnos es: " + mediaNotas);
                        }
                        break;
                    case 4:
                        if (listaAlumnos.isEmpty()) {
                            System.out.println("No hay alumnos en la lista.");
                        } else {
                            Alumno mejorNota = listaAlumnos.get(0);
                            for (Alumno alumno : listaAlumnos) {
                                if (alumno.getNota() > mejorNota.getNota()) {
                                    mejorNota = alumno;
                                }
                            }
                            System.out.println("Alumno con la nota más alta: " + mejorNota);
                        }
                        break;
                    case 5:
                        System.out.print("Ingrese el nombre del alumno a buscar: ");
                        String nombreBuscar = scanner.nextLine();
                        boolean encontrado = false;
                        for (Alumno alumno : listaAlumnos) {
                            if (alumno.getNombre().equalsIgnoreCase(nombreBuscar)) {
                                System.out.println("Información del alumno encontrado:");
                                System.out.println(alumno);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró ningún alumno con ese nombre.");
                        }
                        break;
                    case 6:
                        System.out.println("¡Hasta luego!");
                        System.exit(0);
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor válido.");
                scanner.next(); 
            }
        }
    }
}
