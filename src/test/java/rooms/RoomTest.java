package rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void setUp() {
        room = new Room("Dungeon", false);
    }

    @Test
    public void canGetName() {
        assertEquals("Dungeon", room.getName());
    }

    @Test
    public void canCheckTastCompleted() {
        assertEquals(false, room.isTaskComplete());
    }

    @Test
    public void canSetTaskCompleted() {
        room.setTaskComplete(true);
        assertEquals(true, room.isTaskComplete());
    }

    @Test
    public void canCountPlayers() {
        assertEquals(0, room.countPlayers());
    }

//    @Test
//    public void canAddPlayer() {
//        room.add
//        assertEquals();
//    }
}
