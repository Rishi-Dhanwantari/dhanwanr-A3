package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for if the maze is correctly storing the entry and exit points (specific maze used).
 */

class StartAndEndTest {

    @Test
    void testEntryExitPoints() {
        Maze maze = new Maze("./examples/straight.maz.txt");

        int[] entryPoint = new int[]{2, 0};
        int[] exitPoint = new int[]{2,4};

        assertEquals(entryPoint[0], maze.getEntryPoint()[0]);
        assertEquals(entryPoint[1], maze.getEntryPoint()[1]);
        assertEquals(exitPoint[0], maze.getExitPoint()[0]);
        assertEquals(exitPoint[1], maze.getExitPoint()[1]);
    }
}