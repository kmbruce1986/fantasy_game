package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {


    Club club;

    @Before
    public void setUp() {
        club = new Club(WeaponType.CLUB, 4.00);
    }

    @Test
    public void canGetType() {
        assertEquals(WeaponType.CLUB, club.getWeaponType());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(4.00, club.getAttackValue(), 0.01);
    }

    @Test
    public void canSetAttackValue() {
        club.setAttackValue(10.00);
        assertEquals(10.00, club.getAttackValue(), 0.01);
    }
}
