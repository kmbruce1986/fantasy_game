package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;

    @Before
    public void setUp() {
        axe = new Axe(WeaponType.AXE, 8.00);
    }

    @Test
    public void canGetType() {
        assertEquals(WeaponType.AXE, axe.getWeaponType());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(8.00, axe.getAttackValue(), 0.01);
    }

    @Test
    public void canSetAttackValue() {
        axe.setAttackValue(10.00);
        assertEquals(10.00, axe.getAttackValue(), 0.01);
    }
}
