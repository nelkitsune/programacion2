import java.util.ArrayList;

public class Test {
    private int code;
    private String title;
    private ArrayList<Athlete> participantes = new ArrayList<>();

    public Test(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Athlete> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Athlete atleta) {
       participantes.add(atleta);
    }
}
