package enemies;

import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Sword;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    Club club;

    @Before
    public void setUp() {
        club = new Club(WeaponType.CLUB, 15.00);
        troll = new Troll("Voljin", 30.00, club);
    }


    @Test
    public void canGetName() {
        assertEquals("Voljin", troll.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(30.00, troll.getHealthPoint(), 0.01);
    }

    @Test
    public void canSetHealthValue() {
        troll.setHealthPoint(10.00);
        assertEquals(10.00, troll.getHealthPoint(), 0.01);
    }

    @Test
    public void canRaiseHealthValue() {
        troll.raiseHealthPoint(3.00);
        assertEquals(33.00, troll.getHealthPoint(), 0.01);
    }

    @Test
    public void canLowerHealthValue() {
        troll.lowerHealthPoint(3.00);
        assertEquals(27.00, troll.getHealthPoint(), 0.01);
    }

    @Test
    public void canCheckDeadNotDead() {
        troll.lowerHealthPoint(10.00);
        assertEquals(false, troll.checkDead());
    }

    @Test
    public void canCheckDeadDead() {
        troll.lowerHealthPoint(51.00);
        assertEquals(true, troll.checkDead());
    }

    @Test
    public void canGetWeaponType() {
        assertEquals(WeaponType.CLUB, troll.getWeapon().getWeaponType());
    }

}
