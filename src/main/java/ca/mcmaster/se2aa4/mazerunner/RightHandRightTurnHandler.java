package ca.mcmaster.se2aa4.mazerunner;

/**
 * Concrete handler for Right-hand-rule style right turns
 */

public class RightHandRightTurnHandler extends MovementHandler {
    @Override
    protected boolean tryMove(Runner runner, Maze maze) {
        if (maze.isPass(runner.getPosition()[0] + runner.getDirection().turnRight().getCurrentDirection()[0], runner.getPosition()[1] + runner.getDirection().turnRight().getCurrentDirection()[1])){
            runner.runnerTurnRight();
            runner.moveForward();
            return true;
        }
        return false;
    }
}
