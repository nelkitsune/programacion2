import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Bock> bocks = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Bock> getBocks() {
        return bocks;
    }

    public void setBocks(ArrayList<Bock> bocks) {
        this.bocks = bocks;
    }
    public void addBock(Bock bock){
        getBocks().add(bock);
        bock.agregar_propetiario(this);
    }
}
