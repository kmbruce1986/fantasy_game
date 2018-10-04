package players;

import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Sword;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Club club;

    @Before
    public void setUp() {
        club = new Club(WeaponType.CLUB, 15.00);
        barbarian = new Barbarian("Berethor", 50.00, club);
    }


    @Test
    public void canGetName() {
        assertEquals("Berethor", barbarian.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(50.00, barbarian.getHealthPoint(), 0.01);
    }

    @Test
    public void canSetHealthValue() {
        barbarian.setHealthPoint(10.00);
        assertEquals(10.00, barbarian.getHealthPoint(), 0.01);
    }

    @Test
    public void canRaiseHealthValue() {
        barbarian.raiseHealthPoint(3.00);
        assertEquals(53.00, barbarian.getHealthPoint(), 0.01);
    }

    @Test
    public void canLowerHealthValue() {
        barbarian.lowerHealthPoint(3.00);
        assertEquals(47.00, barbarian.getHealthPoint(), 0.01);
    }

    @Test
    public void canCheckDeadNotDead() {
        barbarian.lowerHealthPoint(10.00);
        assertEquals(false, barbarian.checkDead());
    }

    @Test
    public void canCheckDeadDead() {
        barbarian.lowerHealthPoint(51.00);
        assertEquals(true, barbarian.checkDead());
    }

    @Test
    public void canGetWeaponType() {
        assertEquals(WeaponType.CLUB, barbarian.getWeapon().getWeaponType());
    }

    @Test
    public void canSetWeapon() {
        Sword sword = new Sword(WeaponType.SWORD, 10.00);
        barbarian.setWeapon(sword);
        assertEquals(WeaponType.SWORD, barbarian.getWeapon().getWeaponType());
    }
}
