package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;


    @Before
    public void setUp() {
        sword = new Sword(WeaponType.SWORD, 5.00);
    }

    @Test
    public void canGetType() {
        assertEquals(WeaponType.SWORD, sword.getWeaponType());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(5.00, sword.getAttackValue(), 0.01);
    }

    @Test
    public void canSetAttackValue() {
        sword.setAttackValue(10.00);
        assertEquals(10.00, sword.getAttackValue(), 0.01);
    }
}
