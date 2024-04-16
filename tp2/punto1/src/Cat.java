class Cat extends Animal {
    private String breed;
    private boolean sterilized;

    public Cat(String name, int age, String animalType, double price, String breed, boolean sterilized) {
        super(name, age, animalType, price);
        this.breed = breed;
        this.sterilized = sterilized;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", raza='" + breed + '\'' +
                ", esterilizado=" + sterilized;
    }
}