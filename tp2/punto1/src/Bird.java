class Bird extends Animal {
    private String species;
    private boolean speaks;

    public Bird(String name, int age, String animalType, double price, String species, boolean speaks) {
        super(name, age, animalType, price);
        this.species = species;
        this.speaks = speaks;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", especie='" + species + '\'' +
                ", habla=" + speaks;
    }
}
