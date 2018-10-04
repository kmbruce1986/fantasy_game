package spellcasters;

import behaviours.Castable;
import mythical.MythicalCreature;

public class Warlock extends SpellCaster implements Castable {

    public Warlock(String name, Double healthPoint, MythicalCreature mythicalCreature) {
        super(name, healthPoint, mythicalCreature);
    }
}
