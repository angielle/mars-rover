import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MarsRoverTest {

    @Test
    public void testInvalidInstructions() {
        MarsRover rover = new MarsRover();
        Position finalPosition = rover.executeInstructions("ABCDEFGHIJK");
        assertEquals(0, finalPosition.getX());
        assertEquals(0, finalPosition.getY());
        assertEquals(Direction.N, rover.heading.getDirection());
    }

    @Test
    public void testRotateLeft() {
        MarsRover rover = new MarsRover();
        Position finalPosition = rover.executeInstructions("L");
        assertEquals(0, finalPosition.getX());
        assertEquals(0, finalPosition.getY());
        assertEquals(Direction.W, rover.heading.getDirection());
    }

    @Test
    public void testRotateRight() {
        MarsRover rover = new MarsRover();
        Position finalPosition = rover.executeInstructions("R");
        assertEquals(0, finalPosition.getX());
        assertEquals(0, finalPosition.getY());
        assertEquals(Direction.E, rover.heading.getDirection());
    }

    @Test
    public void testMoveForward() {
        MarsRover rover = new MarsRover();
        Position finalPosition = rover.executeInstructions("M");
        assertEquals(0, finalPosition.getX());
        assertEquals(1, finalPosition.getY());
        assertEquals(Direction.N, rover.heading.getDirection());
    }

    @Test
    public void testMoveToInvalidDirection() {
        MarsRover rover = new MarsRover();
        Position finalPosition = rover.executeInstructions("LMMLMMM");
        assertEquals(0, finalPosition.getX());
        assertEquals(0, finalPosition.getY());
        assertEquals(Direction.S, rover.heading.getDirection());
    }

    @Test
    public void testMoveToValidCoordinatesAndHeading() {
        MarsRover rover = new MarsRover();
        Position finalPosition = rover.executeInstructions("RMLMRMLM");
        assertEquals(2, finalPosition.getX());
        assertEquals(2, finalPosition.getY());
        assertEquals(Direction.N, rover.heading.getDirection());
    }

    @Test
    public void testMoveToInvalidCoordinatesAndHeading() {
        MarsRover rover = new MarsRover();
        Position finalPosition = rover.executeInstructions("LMLMRM");
        assertEquals(0, finalPosition.getX());
        assertEquals(0, finalPosition.getY());
        assertEquals(Direction.W, rover.heading.getDirection());
    }



}