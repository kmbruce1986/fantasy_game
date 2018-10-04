package enemies;

import behaviours.Targetable;
import weapons.Weapon;

public class Troll extends Enemy {

    public Troll(String name, Double healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
    }
}
