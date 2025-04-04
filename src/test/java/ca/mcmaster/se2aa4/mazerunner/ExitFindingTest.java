package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for if the Runner arrives at the Maze's exit.
 */

class ExitFindingTest {

    @Test
    void testMazeTraversal() {
        Maze maze = new Maze("./examples/straight.maz.txt");
        RightHandRunner runner = new RightHandRunner(maze.getEntryPoint(), Direction.EAST);

        runner.traverseMaze(maze);

        assertEquals(runner.getPosition()[0], (maze.getExitPoint()[0]));
        assertEquals(runner.getPosition()[1], (maze.getExitPoint()[1]));
    }
}