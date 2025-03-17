package classesAndObjects;

import java.util.ArrayList;
import java.util.List;

public class TeamPlayerDemo {
    public static void main(String[] args) {
        Player player1 = new Player("John Doe", "Forward", 10);
        Player player2 = new Player("Alice Smith", "Goalkeeper", 1);

        List<Player> teamPlayers = new ArrayList<>();
        teamPlayers.add(player1);
        teamPlayers.add(player2);

        Team team = new Team("Tigers", "New York", "Division A", teamPlayers);

        System.out.println(team);
    }
}

