import java.util.ArrayList;

public class National_team {
    private String color;
    private String pais;
    private ArrayList<Athlete> pertenece = new ArrayList<>();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public National_team(String color, String pais) {
        this.color = color;
        this.pais = pais;
    }

    public ArrayList<Athlete> getPertenece() {
        return pertenece;
    }

    public void setPertenece(Athlete athleta) {
        pertenece.add(athleta);
    }
}
