package treasures;

public abstract class Treasure {

    private TreasureType treasureType;

    public Treasure(TreasureType type) {
        this.treasureType = type;
    }

    public TreasureType getTreasureType() {
        return treasureType;
    }
}
