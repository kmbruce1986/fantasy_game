package players;

import behaviours.Targetable;
import enemies.Enemy;
import weapons.Weapon;

public class Barbarian extends Fighter {

    public Barbarian(String name, Double healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);
    }

    public void attack(Targetable target){
        if (target instanceof Enemy) {
            Double reduceAmount = this.getWeapon().getAttackValue();
            target.lowerHealthPoint(reduceAmount);
        }
    }

}
