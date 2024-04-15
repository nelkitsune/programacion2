public class Main {
    public static void main(String[] args) {
        // Crear personas y bocks
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        Bock bock1 = new Bock("Bock 1");
        Bock bock2 = new Bock("Bock 2");

        // Agregar bocks a personas
        person1.addBock(bock1);
        person1.addBock(bock2);
        person2.addBock(bock1);

        // Mostrar la lista de bocks de cada persona
        System.out.println(person1.getName() + " tiene los siguientes bocks:");
        for (Bock bock : person1.getBocks()) {
            System.out.println("- " + bock.getTitle());
        }

        System.out.println(person2.getName() + " tiene los siguientes bocks:");
        for (Bock bock : person2.getBocks()) {
            System.out.println("- " + bock.getTitle());
        }

        // Mostrar la lista de personas que poseen un bock en particular
        System.out.println("El bock '" + bock1.getTitle() + "' es poseído por:");
        for (Person person : bock1.getPerson()) {
            System.out.println("- " + person.getName());
        }
    }
}