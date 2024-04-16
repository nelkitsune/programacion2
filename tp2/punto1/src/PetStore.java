import java.util.ArrayList;
import java.util.List;

class PetStore {
    private List<Animal> animals;

    public PetStore() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void sellAnimal(String name) {
        for (Animal animal : animals) {
            if (animal instanceof Dog && animal.getName().equals(name)) {
                animals.remove(animal);
                System.out.println("El perro " + name + " ha sido vendido.");
                return;
            } else if (animal instanceof Cat && animal.getName().equals(name)) {
                animals.remove(animal);
                System.out.println("El gato " + name + " ha sido vendido.");
                return;
            } else if (animal instanceof Bird && animal.getName().equals(name)) {
                animals.remove(animal);
                System.out.println("El ave " + name + " ha sido vendida.");
                return;
            } else if (animal instanceof Fish && animal.getName().equals(name)) {
                animals.remove(animal);
                System.out.println("El pez " + name + " ha sido vendido.");
                return;
            }
        }
        System.out.println("No se encontró un animal con el nombre " + name + ".");
    }

    public void feedAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                animal.Alimentar(name);
                return;
            }
        }
        System.out.println("No se encontró un animal con el nombre " + name + ".");
    }

    public void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No hay animales en la tienda.");
            return;
        }
        System.out.println("Lista de animales en la tienda:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
