package mythical;

import behaviours.Attackable;

public abstract class MythicalCreature implements Attackable {

    private String name;
    private Double attackValue;

    public MythicalCreature(String name, Double attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public Double getAttackValue() {
        return attackValue;
    }


}
