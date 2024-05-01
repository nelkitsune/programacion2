import java.util.ArrayList;

public class Site {
    private int phase;
    private String date;
    private String time;
    private ArrayList<Facilities>donde = new ArrayList<>();
    private ArrayList<Test> seHace= new ArrayList<>();

    public Site(int phase, String date, String time) {
        this.phase = phase;
        this.date = date;
        this.time = time;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Facilities> getDonde() {
        return donde;
    }

    public void setDonde(Facilities facilities) {
        donde.add(facilities);
        facilities.setSede(this);
    }


    public ArrayList<Test> getSeHace() {
        return seHace;
    }

    public void setSeHace(Test test) {
        seHace.add(test);
    }
}
