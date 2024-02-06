public class Heading {
    private Direction direction;

    public Heading(Direction direction) {
        this.direction = direction;
    }

    public Heading turnLeft() {
        int newOrdinal = (direction.ordinal() + 3) % 4;
        direction = Direction.values()[newOrdinal];
        return this;
    }

    public Heading turnRight() {
        int newOrdinal = (direction.ordinal() + 1) % 4;
        direction = Direction.values()[newOrdinal];
        return this;
    }

    public Direction getDirection() {
        return direction;
    }
}
