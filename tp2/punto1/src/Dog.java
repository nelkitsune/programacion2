class Dog extends Animal {
    private String breed;
    private boolean vaccinated;

    public Dog(String name, int age, String animalType, double price, String breed, boolean vaccinated) {
        super(name, age, animalType, price);
        this.breed = breed;
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", raza='" + breed + '\'' +
                ", vacunado=" + vaccinated;
    }
}