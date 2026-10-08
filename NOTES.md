# NOTES

## What I wrote
- `MyKarel.java`: the five-line beeper program 
- `worlds/NEWWORLD.w`: my own with two piles of two beepers
- `MyWorldSolver.java`: my program for that world. It walks 4 east, 4 north, picks up 2 beepers, turns, walks 2 west, picks up 2 more.

## What the agent wrote
- `AgentWorldSolver.java` Same world as my solver, but it uses `while (frontIsClear())` and `while (beepersPresent())` instead of counting squares.
- Works with any number of beepers and in any position
- Only worls when you compile is with javac.

## Where the agent got something wrong
- Nothing broke when I ran it in my world
- It did not run run.sh and I had to run the solver a different way because it only runs MyKarel

## What I did about it
- I did it myself in my world and checked for mistakes
- I added a how to run section so the grader can know what to do

## How to run
- Five-liner: `./run.sh`
- World solvers: load `worlds/NEWWORLD.w` in the Karel window, then run `MyWorldSolver` or `AgentWorldSolver`.
