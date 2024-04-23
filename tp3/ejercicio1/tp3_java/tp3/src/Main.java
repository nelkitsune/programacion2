import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Grupo grupo1 = new Grupo("rojo", 'a');
        Grupo grupo2 = new Grupo("rojo", 'b');
        Grupo grupo3 = new Grupo("rojo", 'c');
        Alumno alumno1 = new Alumno("ramiro",44240492,grupo1);
        Alumno alumno2 = new Alumno("pedro",44240492,grupo1);
        Alumno alumno3 = new Alumno("jose",442,grupo1);
        Alumno alumno4 = new Alumno("alon",44240492,grupo1);
        Alumno alumno5 = new Alumno("ricardo",44240492,grupo1);
        Asignatura laboratorio = new Asignatura("laboratorio","24",5);
        Asignatura programacion = new Asignatura("programacion","23",6);
        Asignatura sistema_operativo = new Asignatura("sistema operativo","22",8);
        Profesor profe1 = new Profesor("pablito",234574,"TIC",laboratorio);
        alumno1.agregar_grupo(grupo2);
        alumno1.agregar_grupo(grupo3);
        profe1.agregar_asignatura(programacion);
        profe1.agregar_asignatura(sistema_operativo);
        grupo1.agregar_asignatura(laboratorio);
        grupo1.agregar_asignatura(programacion);
        grupo1.agregar_asignatura(sistema_operativo);
        laboratorio.setProfe(profe1);
        programacion.setProfe(profe1);
        sistema_operativo.setProfe(profe1);
        System.out.println("el aula del " + profe1.getName()+" es " + profe1.getImparte().get(2).getAula());
        for (int i = 0; i < profe1.getImparte().toArray().length; i++) {
            System.out.println(profe1.getImparte().get(i).getNombre());
        }
        for (int i = 0; i < laboratorio.getGrupo().getPersona().toArray().length; i++) {
            System.out.println("nombre de participante: " + laboratorio.getGrupo().getPersona().get(i).getName()+ " dni:" + grupo1.getPersona().get(i).getDni());

        }
        System.out.println(alumno1.getPertenece().get(2).getLetra());

        for (int i = 0; i < alumno1.getPertenece().get(0).getRecibe().toArray().length; i++) {

            System.out.println(alumno1.getPertenece().get(0).getRecibe().get(i).getNombre());
        }
        System.out.print("ingrese la asignatura de su interes. A laboratorio, B programacion, C Sistema ");

        Scanner sc = new Scanner(System.in);
        String option = sc.next().toUpperCase();
        switch (option){
            case "A" -> System.out.println(alumno1.getPertenece().get(0).getRecibe().get(0).getProfe().getName());
            case "B"-> System.out.println(alumno1.getPertenece().get(0).getRecibe().get(1).getProfe().getName());
            case "C"-> System.out.println(alumno1.getPertenece().get(0).getRecibe().get(2).getProfe().getName());
            default -> System.out.println("letra ingresada incorrecta, debe elegir A,B,C");
        }
        for (int i = 0; i < profe1.getImparte().get(1).getGrupo().getPersona().toArray().length; i++) {
            System.out.println(profe1.getImparte().get(1).getGrupo().getPersona().get(i).getName());

        }
    }
    /*
    Asociación: Es una relación entre dos clases que se establece a través de sus objetos. La asociación puede ser de uno a uno, de uno a muchos, de muchos a uno, de muchos a muchos. En la programación orientada a objetos, un objeto se comunica con otro objeto para usar la funcionalidad y los servicios proporcionados por ese objeto12.
    Agregación: Es un subtipo de relación de asociación en UML. Una relación de agregación se puede describir en palabras simples como "un objeto de una clase puede poseer o acceder a los objetos de otra clase"1. La agregación es una asociación de conjuntos de datos donde los conjuntos de datos no dependen unos de otros3. En Agregación, ambas entidades pueden sobrevivir individualmente, lo que significa que terminar una entidad no afectará a la otra entidad2.
    Composición: Es un tipo de agregación más específico que implica la propiedad4. Los conjuntos de datos dependen unos de otros3. En la composición, si se destruye la entidad principal, todas las entidades asociadas también serán destruidas4.
     */
}