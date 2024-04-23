public abstract class Person {
   protected String name;
    protected int dni;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Person(String name, int dni) {
        this.name = name;
        this.dni = dni;
    }
}
