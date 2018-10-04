package mythical;

public abstract class MythicalCreature {

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
