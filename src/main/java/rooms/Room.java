package rooms;

import enemies.Enemy;
import players.Player;
import treasures.Treasure;

import java.util.ArrayList;

public class Room {

    private String name;
    private boolean taskComplete;
    private ArrayList<Player> players;
    private ArrayList<Enemy> enemies;
    private ArrayList<Treasure> treasures;

    public Room(String name, boolean taskComplete) {
        this.name = name;
        this.taskComplete = taskComplete;
        this.players = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.treasures = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean isTaskComplete() {
        return taskComplete;
    }

    public void setTaskComplete(boolean taskComplete) {
        this.taskComplete = taskComplete;
    }

    public int countPlayers(){
        return this.players.size();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void removePlayer(Player deadPlayer){
        Player foundPlayer = null;
        for (Player player : this.players){
            if (player == deadPlayer){
            foundPlayer = deadPlayer;
            }
        } this.players.remove(deadPlayer);
    }

    public void clearAllPlayers(){
        this.players.clear();
    }


}
