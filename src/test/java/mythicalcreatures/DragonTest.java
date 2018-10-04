package mythicalcreatures;

import enemies.Troll;
import mythical.Dragon;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import weapons.Club;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;
    Club club;
    Troll troll;

    @Before
    public void setUp() {
        club = new Club(WeaponType.CLUB, 15.00);
        troll = new Troll("Bob", 20.00, club);
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

    @Test
    public void canAttack() {
        dragon.attack(troll);
        assertEquals(0, troll.getHealthPoint(), 0.01);
    }

    @Test
    public void cannotAttackGoodie() {
        Dwarf dwarf = new Dwarf("Gimli", 20.00, club);
        dragon.attack(dwarf);
        assertEquals(20.00, dwarf.getHealthPoint(), 0.01);
    }
}
