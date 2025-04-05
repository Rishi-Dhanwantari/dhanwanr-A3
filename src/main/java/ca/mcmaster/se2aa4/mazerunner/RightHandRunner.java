package ca.mcmaster.se2aa4.mazerunner;

/**
 * Runner class to represent the Maze Runner and traverse through the maze.
 */

class RightHandRunner extends Runner {
    private int[] runnerPosition;
    private Direction runnerDirection;
    private Path path;
    private MovementHandler movementChain;

    //constructor method for Runner.
    public RightHandRunner(int[] entryPosition, Direction startingDirection){
        this.runnerPosition = entryPosition;
        this.runnerDirection = startingDirection;
        this.path = new Path();
        buildMovementChain();
    }

    //method that traverses the maze by following the right wall until the exit.
    public void traverseMaze(Maze maze){
        int[] exitPoint = maze.getExitPoint();

        while (!(this.runnerPosition[0] == exitPoint[0] && this.runnerPosition[1] == exitPoint[1])){
            this.movementChain.handle(this, maze);
        }
    }

    //method that moves the Runner one position forward, whichever direction they are facing.
    public void moveForward(){
        int[] currentDirection = runnerDirection.getCurrentDirection();
        this.runnerPosition[0] += currentDirection[0];
        this.runnerPosition[1] += currentDirection[1];
        this.path.addMovement("F");
    }

    //method that adjusts the Runner's direction by turning it right once.
    public void runnerTurnRight(){
        this.runnerDirection = this.runnerDirection.turnRight();
        this.path.addMovement("R");
    }

    //method that adjusts the Runner's direction by turning it left once.
    public void runnerTurnLeft(){
        this.runnerDirection = this.runnerDirection.turnLeft();
        this.path.addMovement("L");
    }

    //builds handling chain
    private void buildMovementChain() {
        MovementHandler right = new RightHandRightTurnHandler();
        MovementHandler forward = new ForwardMoveHandler();
        MovementHandler left = new RightHandLeftTurnHandler();

        right.setSuccessor(forward);
        forward.setSuccessor(left);
        this.movementChain = right;
    }

    //accessor method for the Runner's path.
    public Path getPath(){
        Path copy = new Path();
        copy.addMovement(this.path.getCanonicalPath());
        return copy;
    }

    //accessor method for the Runner's direction.
    public Direction getDirection(){
        Direction directionCopy = this.runnerDirection;
        return directionCopy;
    }

    //accessor method for the Runner's position;
    public int[] getPosition(){
        return new int[]{runnerPosition[0], runnerPosition[1]};
    }
}