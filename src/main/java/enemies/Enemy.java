package enemies;

import weapons.Weapon;

public abstract class Enemy {

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

    public Double getHealthPoints() {
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
