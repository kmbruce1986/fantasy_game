package mythical;

import behaviours.Protectable;

public class Dragon extends MythicalCreature implements Protectable {

    public Dragon(String name, Double attackValue) {
        super(name, attackValue);
    }
}
