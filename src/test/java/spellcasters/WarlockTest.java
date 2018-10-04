package spellcasters;

import mythical.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Dragon dragon;

    @Before
    public void setUp() {
        dragon = new Dragon("Smaug", 10.00);
        warlock = new Warlock("Merlin", 30.00, dragon);
    }

    @Test
    public void canGetName() {
        assertEquals("Merlin", warlock.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(30.00, warlock.getHealthPoint(), 0.01);
    }

    @Test
    public void canSetHealthValue() {
        warlock.setHealthPoint(10.00);
        assertEquals(10.00, warlock.getHealthPoint(), 0.01);
    }

    @Test
    public void canRaiseHealthValue() {
        warlock.raiseHealthPoint(3.00);
        assertEquals(33.00, warlock.getHealthPoint(), 0.01);
    }

    @Test
    public void canLowerHealthValue() {
        warlock.lowerHealthPoint(3.00);
        assertEquals(27.00, warlock.getHealthPoint(), 0.01);
    }

    @Test
    public void canCheckDeadNotDead() {
        warlock.lowerHealthPoint(10.00);
        assertEquals(false, warlock.checkDead());
    }

    @Test
    public void canCheckDeadDead() {
        warlock.lowerHealthPoint(51.00);
        assertEquals(true, warlock.checkDead());
    }

}
