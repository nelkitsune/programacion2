import java.util.ArrayList;

public class Facilities {
    private String category;
    private String location;
    private String name;
    private String tipe;
    private ArrayList<Site> sede = new ArrayList<>();


    public Facilities(String category, String location, String name, String tipe) {
        this.category = category;
        this.location = location;
        this.name = name;
        this.tipe = tipe;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public ArrayList<Site> getSede() {
        return sede;
    }

    public void setSede(Site site) {
        sede.add(site);
    }
}
