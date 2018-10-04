package spells;

import behaviours.Castable;
import behaviours.Targetable;
import enemies.Enemy;
import enemies.Troll;

import java.lang.annotation.Target;

public class Fireball extends Spell  {

    public Fireball(String name, Double attackValue) {
        super(name, attackValue);
    }

}
