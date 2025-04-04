package ca.mcmaster.se2aa4.mazerunner;

/**
 * Abstract factory class for Runner creation.
 */

abstract class Runner {
    abstract void traverseMaze(Maze maze);

    abstract Path getPath();
}