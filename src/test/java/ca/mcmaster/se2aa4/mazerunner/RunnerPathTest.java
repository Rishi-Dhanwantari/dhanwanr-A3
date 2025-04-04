package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for the Runner's right hand following and path tracking.
 */

class RunnerPathTest {

    @Test
    void testRunnerPathTracking() {
        Maze maze = new Maze("./examples/tiny.maz.txt");
        Runner runner = new Runner(maze.getEntryPoint(), Direction.EAST);

        runner.traverseMaze(maze);

        assertTrue(runner.getPath().getCanonicalPath().equals("FFFFFLLFFRFFRFFLLFFRFFRFFF"));
    }
}