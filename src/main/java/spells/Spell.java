package spells;

public abstract class Spell {

    private String name;
    private Double attackValue;

    public Spell(String name, Double attackValue) {
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
