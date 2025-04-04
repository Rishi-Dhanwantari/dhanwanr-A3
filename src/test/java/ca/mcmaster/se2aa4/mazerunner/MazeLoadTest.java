package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for if the maze properly loads from a file.
 */

class MazeLoadTest {

    @Test
    void testMazeLoading() {
        Maze maze = new Maze("./examples/straight.maz.txt");
        assertNotNull(maze);
    }
}