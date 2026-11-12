# Learning archive

Code I wrote while learning to program: university coursework in Java, Java fundamentals, and a couple of Python exercises. It's kept as a record of that learning rather than as finished projects.

## Contents

### Java coursework: competitor management (`F21SF_RCW*`)

A program that reads competitor records (ID, name, level, age and judges' scores) from `input.txt`, calculates overall scores, and writes a report to `output.txt`. Three stages of the same assignment:

| Folder | Stage |
|---|---|
| `F21SF_RCW` | First version, swimming competitors |
| `F21SF_RCW_A1` | Submitted version, with a class diagram (`Class Diagram.ucls`) |
| `F21SF_RCW_A2` | Started extending it to several sports (swimmers, climbers, racers) with a shared `Competitor` base class. **Unfinished: it doesn't compile yet.** |

To run the first two (needs a JDK):

```bash
cd F21SF_RCW_A1
javac -d bin src/*.java
java -cp bin Manager
```

### Java fundamentals (`Java Concepts/`)

Sixteen small programs, one concept each: arrays and 2D arrays, booleans, comparison operators, dates, exponents, for, while and nested loops, if/else, return statements, a multiplication table and a simple Swing GUI. Each folder has its source in `src/`.

```bash
cd "Java Concepts/NestedLoops"
javac -d bin src/*.java && java -cp bin NestedLoops
```

### Python

- **`Pong.py`**: the classic two-player Pong game, built with Python's `turtle` module. Player one uses W/S, player two the arrow keys. The bounce sounds use `winsound`, so it runs on Windows.
- **`Python Pattern Programs.ipynb`**: printing number and star patterns with loops.
