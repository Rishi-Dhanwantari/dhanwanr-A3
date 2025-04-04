package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for if the current direction is stored after a left turn.
 */

class TurnLeftTest {

    @Test
    void testDirectionTurnLeft() {
        Direction direction = Direction.EAST;
        direction = direction.turnLeft();
        
        assertEquals(direction, Direction.NORTH);
    }
}