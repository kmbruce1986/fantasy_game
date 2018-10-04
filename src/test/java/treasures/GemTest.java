package treasures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GemTest {

    Gem gem;

    @Before
    public void setUp() {
        gem = new Gem(TreasureType.GEM);
    }

    @Test
    public void canGetTreasureType() {
        assertEquals(TreasureType.GEM, gem.getTreasureType());
    }
}
