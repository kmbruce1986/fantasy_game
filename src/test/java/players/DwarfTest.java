package players;

import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import weapons.*;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Axe axe;
    Troll troll;



    @Before
    public void setUp() {
        axe = new Axe(WeaponType.AXE, 6.00);
        troll = new Troll("Bob", 20.00, axe);
        dwarf = new Dwarf("Gimli", 20.00, axe);
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(20.00, dwarf.getHealthPoint(), 0.01);
    }

    @Test
    public void canSetHealthValue() {
        dwarf.setHealthPoint(10.00);
        assertEquals(10.00, dwarf.getHealthPoint(), 0.01);
    }

    @Test
    public void canRaiseHealthValue() {
        dwarf.raiseHealthPoint(3.00);
        assertEquals(23.00, dwarf.getHealthPoint(), 0.01);
    }

    @Test
    public void canLowerHealthValue() {
        dwarf.lowerHealthPoint(3.00);
        assertEquals(17.00, dwarf.getHealthPoint(), 0.01);
    }

    @Test
    public void canCheckDeadNotDead() {
        dwarf.lowerHealthPoint(10.00);
        assertEquals(false, dwarf.checkDead());
    }

    @Test
    public void canCheckDeadDead() {
        dwarf.lowerHealthPoint(51.00);
        assertEquals(true, dwarf.checkDead());
    }

    @Test
    public void canGetWeaponType() {
        assertEquals(WeaponType.AXE, dwarf.getWeapon().getWeaponType());
    }

    @Test
    public void canSetWeapon() {
        Club club = new Club(WeaponType.CLUB, 10.00);
        dwarf.setWeapon(club);
        assertEquals(WeaponType.CLUB, dwarf.getWeapon().getWeaponType());
    }

    @Test
    public void canAttack() {
        dwarf.attack(troll);
        assertEquals(8, troll.getHealthPoint(), 0.01);
    }

    @Test
    public void cannotAttackGoodie() {
        Dwarf dwarf = new Dwarf("Heheo", 20.00, axe);
        dwarf.attack(dwarf);
        assertEquals(20.00, dwarf.getHealthPoint(), 0.01);
    }
}
