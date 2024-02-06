import java.util.Scanner;

public class MarsRover {
    public static void main(String[] args) {
        MarsRover marsRover = new MarsRover();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the instructions: ");
        String userInput = scanner.nextLine();

        Position finalPosition = marsRover.executeInstructions(userInput);
        int x = finalPosition.getX();
        int y = finalPosition.getY();
        Direction direction = marsRover.heading.getDirection();

        System.out.println(x + "," + y + "," + direction);

        scanner.close();
    }

    public Position position;
    public Heading heading;

    public MarsRover() {
        this.position = new Position(0, 0);
        this.heading = new Heading(Direction.N);
    }

    public Position executeInstructions(String instructions) {
        for (int i = 0; i < instructions.length(); i++) {
            char instruction = instructions.charAt(i);

            switch (instruction) {
                case 'L':
                    heading = heading.turnLeft();
                    break;
                case 'R':
                    heading = heading.turnRight();
                    break;
                case 'M':
                    position = position.moveForward(heading);
                    break;
                default:
                    break;
            }
        }

        return position;
    }
}
