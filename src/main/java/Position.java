public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Position moveForward(Heading heading) {
        int newX = x;
        int newY = y;

        switch (heading.getDirection()) {
            case East:
                newX = x + 1;
                break;
            case North:
                newY = y + 1;
                break;
            case South:
                newY = y - 1;
                break;
            case West:
                newX = x - 1;
                break;
            default:
                break;
        }

        if (newX >= 0 && newY >= 0) {
            return new Position(newX, newY);
        } else {
            return this;
        }
    }
}
