package enemies;

import behaviours.Targetable;
import weapons.Weapon;

public abstract class Enemy implements Targetable {

    private String name;
    private Double healthPoint;
    private Weapon weapon;

    public Enemy(String name, Double healthPoints, Weapon weapon) {
        this.name = name;
        this.healthPoint = healthPoints;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Double getHealthPoint() {
        return healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setHealthPoint(Double healthPoints) {
        this.healthPoint = healthPoints;
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
}
