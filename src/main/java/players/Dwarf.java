package players;

import behaviours.Targetable;
import enemies.Enemy;
import weapons.Weapon;

public class Dwarf extends Fighter {

    public Dwarf(String name, Double healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);
    }

    public void attack(Targetable target){
        if (target instanceof Enemy) {
            Double reduceAmount = this.getWeapon().getAttackValue() * 2;
            target.lowerHealthPoint(reduceAmount);
        }
    }
}
