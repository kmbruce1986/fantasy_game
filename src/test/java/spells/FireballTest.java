package spells;

import org.junit.Before;
import org.junit.Test;
import players.Dwarf;

import static org.junit.Assert.assertEquals;

public class FireballTest {

    Fireball fireball;

    @Before
    public void setUp() {
        fireball = new Fireball("Fireball", 20.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Fireball", fireball.getName());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(20.00, fireball.getAttackValue(), 0.01);
    }

}
