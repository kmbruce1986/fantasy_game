package spellcasters;

import behaviours.Castable;
import behaviours.Targetable;
import mythical.MythicalCreature;
import players.Player;
import spells.Spell;

import java.util.ArrayList;

public abstract class SpellCaster extends Player implements Castable {

    private MythicalCreature mythicalCreature;
    private ArrayList<Spell> spells;


    public SpellCaster(String name, Double healthPoint, MythicalCreature mythicalCreature, ArrayList<Spell> spells) {
        super(name, healthPoint);
        this.mythicalCreature = mythicalCreature;
        this.spells = spells;
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public int countSpells(){
        return this.spells.size();
    }

}
