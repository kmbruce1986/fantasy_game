package spells;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrostboltTest {

    Frostbolt frostbolt;

    @Before
    public void setUp() {
        frostbolt = new Frostbolt("Frostbolt", 20.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Frostbolt", frostbolt.getName());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(20.00, frostbolt.getAttackValue(), 0.01);
    }
}
