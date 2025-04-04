package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for if the current direction is stored after a right turn.
 */

class TurnRightTest {

    @Test
    void testDirectionTurnRight() {
        Direction direction = Direction.EAST;
        direction = direction.turnRight();
        
        assertEquals(direction, Direction.SOUTH);
    }
}