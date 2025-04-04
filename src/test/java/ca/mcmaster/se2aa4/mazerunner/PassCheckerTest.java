package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for if the maze can properly identify a Pass (blank).
 */

class PassCheckerTest {

    @Test
    void testIsPassMethod() {
        Maze maze = new Maze("./examples/huge.maz.txt");
        
        assertTrue(maze.isPass(maze.getEntryPoint()[0], (maze.getEntryPoint()[1] + 1)));
    }
}