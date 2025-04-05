package ca.mcmaster.se2aa4.mazerunner;

/**
 * RightHandRunner class that implements Runner with Right-Hand-Rule logic (follow right wall).
 */

class RightHandRunner extends Runner {

    //constructor method for RightHandRunner.
    public RightHandRunner(int[] entryPosition, Direction startingDirection){
        super(entryPosition, startingDirection);
    }

    //builds handling chain
    public void buildMovementChain() {
        MovementHandler right = new RightHandRightTurnHandler();
        MovementHandler forward = new ForwardMoveHandler();
        MovementHandler left = new RightHandLeftTurnHandler();

        right.setSuccessor(forward);
        forward.setSuccessor(left);
        this.movementChain = right;
    }
}