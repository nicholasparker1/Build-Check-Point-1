import stanford.karel.*;

/*
 * AgentWorldSolver.java
 *
 * Written by the AI agent as an extension of MyWorldSolver.
 *
 * MyWorldSolver hard-codes every step: "move 4, turn, move 4, pick twice".
 * It only works if the beepers are in exactly those spots, with exactly
 * two beepers each.
 *
 * This version asks Karel what it sees instead of counting squares:
 *   - walk east until a wall is in the way
 *   - walk north until a wall is in the way
 *   - walk west along the top row until a wall is in the way
 *   - on every square, pick up however many beepers are there (zero is fine)
 *
 * It solves the same world as MyWorldSolver (worlds/NEWWORLD.w), but it would
 * also work if the beeper piles were bigger or in different squares along
 * the top row.
 */
public class AgentWorldSolver extends Karel {

    public void run() {
        pickAllBeepers();          // the starting square, in case it has any
        walkToWall();              // east along the bottom row
        turnLeft();
        walkToWall();              // north up the right-hand wall
        turnLeft();
        walkToWall();              // west along the top row, collecting
    }

    // Move forward until a wall blocks the way, clearing each square.
    private void walkToWall() {
        while (frontIsClear()) {
            move();
            pickAllBeepers();
        }
    }

    // Pick up every beeper on this square. Does nothing on an empty square,
    // which avoids the crash that a bare pickBeeper() causes there.
    private void pickAllBeepers() {
        while (beepersPresent()) {
            pickBeeper();
        }
    }
}
