package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for if the maze can identify a wall (pound sign).
 */

class WallCheckerTest {

    @Test
    void testIsWallMethod() {
        Maze maze = new Maze("./examples/huge.maz.txt");
        
        assertTrue(maze.isWall(maze.getEntryPoint()[0], (maze.getEntryPoint()[1] + 2)));
    }
}