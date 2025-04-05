package ca.mcmaster.se2aa4.mazerunner;

/**
 * Abstract handler class for chain.
 */

public abstract class MovementHandler {
    protected MovementHandler successor;

    public void setSuccessor(MovementHandler successor) {
        this.successor = successor;
    }

    public boolean handle(Runner runner, Maze maze) {
        if (tryMove(runner, maze)) {
            return true;
        } else if (successor != null) {
            return successor.handle(runner, maze);
        }
        return false;
    }

    protected abstract boolean tryMove(Runner runner, Maze maze);
}
