import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Door> doors;

    public House(int numberOfDoors, String doorMaterial) {
        this.doors = new ArrayList<>();
        // Crear automáticamente las puertas al construir la casa
        for (int i = 0; i < numberOfDoors; i++) {
            Door door = new Door(doorMaterial);
            doors.add(door);
        }
    }

    public List<Door> getDoors() {
        return doors;
    }
}
