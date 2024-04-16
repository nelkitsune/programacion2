class Fish extends Animal {
    private String species;

    public Fish(String name, int age, String animalType, double price, String species) {
        super(name, age, animalType, price);
        this.species = species;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", especie='" + species + '\'';
    }
}