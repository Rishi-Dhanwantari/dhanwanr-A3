package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for if the Runner is initialized in the correct position and direction.
 */

class RunnerInitializationTest {

    @Test
    void testRunnerInitialization() {
        Maze maze = new Maze("./examples/straight.maz.txt");
        Runner runner = new Runner(maze.getEntryPoint(), Direction.EAST);

        assertEquals(runner.getPosition()[0], maze.getEntryPoint()[0]);
        assertEquals(runner.getPosition()[1], maze.getEntryPoint()[1]);
        assertEquals(runner.getDirection(), Direction.EAST);
    }
}