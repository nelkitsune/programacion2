
public class Main {
    public static void main(String[] args) {

        PetStore petStore = new PetStore();

        Dog dog = new Dog("Max", 5, "Perro", 100.0, "Labrador", true);
        Cat cat = new Cat("Luna", 3, "Gato", 80.0, "Siames", true);
        Bird bird = new Bird("Paco", 1, "Ave", 50.0, "Perico", true);
        Fish fish = new Fish("Nemo", 2, "Pez", 30.0, "Pez payaso");

        petStore.addAnimal(dog);
        petStore.addAnimal(cat);
        petStore.addAnimal(bird);
        petStore.addAnimal(fish);

        petStore.listAnimals();

        petStore.sellAnimal("Luna");
        petStore.listAnimals();

        petStore.feedAnimal("Max");
        petStore.listAnimals();
    }
}
