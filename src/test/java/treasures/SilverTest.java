package treasures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SilverTest {

    Silver silver;

    @Before
    public void setUp() {
        silver = new Silver(TreasureType.SILVER);
    }

    @Test
    public void canGetTreasureType() {
        assertEquals(TreasureType.SILVER, silver.getTreasureType());
    }
}
