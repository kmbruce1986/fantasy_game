package spellcasters;

import mythical.MythicalCreature;
import players.Player;

public abstract class SpellCaster extends Player {

    private MythicalCreature mythicalCreature;
//    private ArrayList<Spell> spells;


    public SpellCaster(String name, Double healthPoint, MythicalCreature mythicalCreature) {
        super(name, healthPoint);
        this.mythicalCreature = mythicalCreature;
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }
}
