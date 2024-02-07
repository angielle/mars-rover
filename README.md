# Mars Rover Technical Challenge

### Description
---
**Requirements**
* Control the rover using input of string of letters (L, R, M)
* Assume that the rover starts at (0, 0, N)
* Movements outside of the plateau are considered invalid (x and y must be > 0)

**Input**
A single line of input is a series of instructions telling the rover how to explore the plateau.

**Output**
The output for each rover should be its final co-ordinates and heading.

**Test Input**
LMLMLMLMLM

**Expected Output**
0, 1, W


### How To Use
---

**Prerequisite**
- JDK 17 
- Apache Maven 3.9

**Steps**
1. Clone the repository to local machine
2. Open a terminal inside the root of the project directoryy
3. Run `java -cp target/classes MarsRover`
4. To test the unit cases, run `mvn test`