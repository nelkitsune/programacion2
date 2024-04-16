import java.util.ArrayList;
import java.util.Iterator;

class Team implements Iterable<Player> {
    ArrayList<Player> players;

    // Constructor
    public Team() {
        this.players = new ArrayList<>();
    }

    // Método para agregar un jugador al equipo
    public void addPlayer(Player player) {
        this.players.add(player);
    }

    // Método del iterador
    public Iterator<Player> iterator() {
        return this.players.iterator();
    }
}