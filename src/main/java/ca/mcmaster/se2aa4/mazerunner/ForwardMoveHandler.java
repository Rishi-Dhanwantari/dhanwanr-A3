package ca.mcmaster.se2aa4.mazerunner;

/**
 * Concrete handler class for moving forward.
 */

public class ForwardMoveHandler extends MovementHandler {
    @Override
    protected boolean tryMove(Runner runner, Maze maze) {
        if (maze.isPass(runner.getPosition()[0] + runner.getDirection().getCurrentDirection()[0], runner.getPosition()[1] + runner.getDirection().getCurrentDirection()[1])){
            runner.moveForward();
            return true;
        }
        return false;
    }
}
