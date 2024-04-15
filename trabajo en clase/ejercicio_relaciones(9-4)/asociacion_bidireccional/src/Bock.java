import java.util.ArrayList;

public class Bock {
    private ArrayList<Person> person = new ArrayList<>();
    private String title;

    public Bock(String title) {
        this.title = title;
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void agregar_propetiario(Person person){
        getPerson().add(person);
    }
}
