class Animal {
    private String name;
    private int age;
    private String animalType;
    private double price;

    public Animal(String name, int age, String animalType, double price) {
        this.name = name;
        this.age = age;
        this.animalType = animalType;
        this.price = price;
    }

    public void Alimentar(String name) {
        System.out.println("El animal " + name + " ha sido alimentado.");
    }

    @Override
    public String toString() {
        return "Animal: " +
                "nombre='" + name + '\'' +
                ", edad=" + age +
                ", tipoAnimal='" + animalType + '\'' +
                ", precio=" + price;
    }

    public String getName() {
        return name;
    }
}