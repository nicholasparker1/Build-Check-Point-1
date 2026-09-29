# Karel the Robot

My work from the Karel weeks of COSC 10001 at TCU. Karel is a robot that only knows four commands, and my program gets Karel to walk to the beeper and pick it up.

## How to run it

Open the folder in IntelliJ and press the green Run button. On macOS you can also run `run.sh`, and on Windows `run.ps1`.

## What I learned

- Karel has no `turnRight()`, so I built one from three `turnLeft()` calls.
- Karel crashes if I call `move()` while facing a wall, so I have to think about where Karel is before each step.
- Git saves my work in commits, and GitHub keeps a copy online that I push to.