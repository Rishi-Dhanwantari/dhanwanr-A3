package ca.mcmaster.se2aa4.mazerunner;

/**
 * Concrete handler for Right-hand-rule style left turns
 */

public class RightHandLeftTurnHandler extends MovementHandler {
    @Override
    protected boolean tryMove(Runner runner, Maze maze) {
        runner.runnerTurnLeft();
        return true;
    }
}

