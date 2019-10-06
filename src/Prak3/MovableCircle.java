package Prak3;

public class MovableCircle extends MovablePoint implements Movable{
    public MovablePoint center;
    int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, MovablePoint center, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
