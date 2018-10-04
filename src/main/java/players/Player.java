package players;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private Double healthPoint;
//    private ArrayList<Treasure> treasure;

    public Player(String name, Double healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
//        this.treasure = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Double getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void raiseHealthPoint(Double healthPoint){
        this.healthPoint += healthPoint;
    }

    public void lowerHealthPoint(Double healthPoint){
        this.healthPoint -= healthPoint;
    }

    public boolean checkDead(){
        if (this.healthPoint < 0){
            return true;
        }
        return false;
    }

//    public ArrayList<Treasure> getTreasure() {
//        return treasure;
//    }
//
//    public void setTreasure(ArrayList<Treasure> treasure) {
//        this.treasure = treasure;
//    }
}
