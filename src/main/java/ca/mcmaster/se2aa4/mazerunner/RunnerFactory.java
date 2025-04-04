package ca.mcmaster.se2aa4.mazerunner;

/**
 * Abstract factory class for Runner creation.
 */

public class RunnerFactory {
    public Runner getRunner(int[] entryPosition, Direction startingDirection, String runnerType){
        if (runnerType.equals(null)){
            return null;
        }

        if (runnerType.equalsIgnoreCase("Right Hand")){
            return new RightHandRunner(entryPosition, startingDirection);
        }

        return null;
    }
}