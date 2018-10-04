package spellcasters;

import behaviours.Targetable;
import enemies.Enemy;
import mythical.MythicalCreature;
import spells.Spell;

import java.util.ArrayList;

public class Warlock extends SpellCaster {

    public Warlock(String name, Double healthPoint, MythicalCreature mythicalCreature, ArrayList<Spell> spells) {
        super(name, healthPoint, mythicalCreature, spells);
    }

    public void cast(Targetable target, Spell spell){
        if (target instanceof Enemy) {
            Double reduceAmount = spell.getAttackValue();
            target.lowerHealthPoint(reduceAmount);
        }
    }

}
