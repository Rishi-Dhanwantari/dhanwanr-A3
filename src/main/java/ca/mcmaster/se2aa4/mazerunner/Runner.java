package ca.mcmaster.se2aa4.mazerunner;

/**
 * Abstract factory class for Runner creation.
 */

abstract class Runner {
    abstract void traverseMaze(Maze maze);

    abstract void moveForward();

    abstract void runnerTurnRight();

    abstract void runnerTurnLeft();

    abstract Path getPath();

    abstract Direction getDirection();

    abstract int[] getPosition();
}