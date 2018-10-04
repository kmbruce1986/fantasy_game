package players;

import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Sword;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;

    @Before
    public void setUp() {
        sword = new Sword(WeaponType.SWORD, 10.00);
        knight = new Knight("Arthas", 40.00, sword);
    }

    @Test
    public void canGetName() {
        assertEquals("Arthas", knight.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(40.00, knight.getHealthPoint(), 0.01);
    }

    @Test
    public void canSetHealthValue() {
        knight.setHealthPoint(10.00);
        assertEquals(10.00, knight.getHealthPoint(), 0.01);
    }

    @Test
    public void canRaiseHealthValue() {
        knight.raiseHealthPoint(3.00);
        assertEquals(43.00, knight.getHealthPoint(), 0.01);
    }

    @Test
    public void canLowerHealthValue() {
        knight.lowerHealthPoint(3.00);
        assertEquals(37.00, knight.getHealthPoint(), 0.01);
    }

    @Test
    public void canCheckDeadNotDead() {
        knight.lowerHealthPoint(10.00);
        assertEquals(false, knight.checkDead());
    }

    @Test
    public void canCheckDeadDead() {
        knight.lowerHealthPoint(51.00);
        assertEquals(true, knight.checkDead());
    }

    @Test
    public void canGetWeaponType() {
        assertEquals(WeaponType.SWORD, knight.getWeapon().getWeaponType());
    }

    @Test
    public void canSetWeapon() {
        Club club = new Club(WeaponType.CLUB, 10.00);
        knight.setWeapon(club);
        assertEquals(WeaponType.CLUB, knight.getWeapon().getWeaponType());
    }

}
