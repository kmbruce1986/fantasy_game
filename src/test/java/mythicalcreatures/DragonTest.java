package mythicalcreatures;

import mythical.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void setUp() {
        dragon = new Dragon("Smaug", 20.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Smaug", dragon.getName());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(20.00, dragon.getAttackValue(), 0.01);
    }
}
