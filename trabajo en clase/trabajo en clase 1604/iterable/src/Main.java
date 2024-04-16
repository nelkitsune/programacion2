
public class Main {
    public static void main(String[] args) {
        // Crear un equipo
        Team team = new Team();

        // Crear jugadores
        Player player1 = new Player("Jugador 1", "Delantero", 9);
        Player player2 = new Player("Jugador 2", "Mediocampista", 8);
        Player player3 = new Player("Jugador 3", "Defensor", 5);

        // Agregar jugadores al equipo
        team.addPlayer(player1);
        team.addPlayer(player2);
        team.addPlayer(player3);

        // Iterar sobre los jugadores del equipo
        for (Player player : team) {
            System.out.println("Nombre: " + player.name + ", Posición: " + player.position + ", Número de camiseta: " + player.shirtNumber);
        }
    }
}
