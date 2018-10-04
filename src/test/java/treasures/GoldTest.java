package treasures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoldTest {

    Gold gold;

    @Before
    public void setUp() {
        gold = new Gold(TreasureType.GOLD);
    }

    @Test
    public void canGetTreasureType() {
        assertEquals(TreasureType.GOLD, gold.getTreasureType());
    }
}
