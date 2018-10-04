package spellcasters;

import enemies.Troll;
import mythical.Dragon;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import spells.Fireball;
import spells.Frostbolt;
import spells.Spell;
import weapons.Club;
import weapons.WeaponType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Dragon dragon;
    Fireball fireball;
    Frostbolt frostbolt;
    ArrayList<Spell> spells;
    Club club;
    Troll troll;


    @Before
    public void setUp() {
        frostbolt = new Frostbolt("Frostbolt", 20.00);
        fireball = new Fireball("Fireball", 20.00);
        spells = new ArrayList<>();
        spells.add(frostbolt);
        spells.add(fireball);
        club = new Club(WeaponType.CLUB, 15.00);
        troll = new Troll("Bob", 20.00, club);
        dragon = new Dragon("Smaug", 10.00);
        warlock = new Warlock("Merlin", 30.00, dragon, spells);
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

    @Test
    public void canGetMythicalCreature() {
        assertEquals("Smaug", warlock.getMythicalCreature().getName());
    }

    @Test
    public void canGetNumberOfSpells() {
        assertEquals(2, warlock.countSpells());
    }


    @Test
    public void canCastSpell() {
        warlock.cast(troll, fireball);
        assertEquals(0, troll.getHealthPoint(), 0.01);
    }

    @Test
    public void cannotAttackGoodie() {
        Dwarf dwarf = new Dwarf("Gimli", 20.00, club);
        warlock.cast(dwarf, fireball);
        assertEquals(20.00, dwarf.getHealthPoint(), 0.01);
    }
}
