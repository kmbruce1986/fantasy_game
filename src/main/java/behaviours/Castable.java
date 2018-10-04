package behaviours;

import spells.Spell;

public interface Castable {

    void cast(Targetable target, Spell spell);
}
