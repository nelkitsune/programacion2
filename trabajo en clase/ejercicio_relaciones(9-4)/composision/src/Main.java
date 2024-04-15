
public class Main {
    public static void main(String[] args) {

        House house = new House(3, "Madera");
        System.out.println("Materiales de las puertas de la casa:");
        for (Door door : house.getDoors()) {
            System.out.println("- " + door.getMaterial());
        }
    }
}