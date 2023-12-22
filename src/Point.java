public class Point {
    private int x;
    private int y;
    Point(){} // Creating Empty Constructor
    Point(int x, int y){ // Creating Parametrized Constructor to Initialize Points
        this.x = x;
        this.y = y;
    }

    public int getX() { // Creating Getters
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceTo(Point point){ // Creating distanceTo method that uses Formula to calculate the Distance
        return Math.sqrt((point.getX()-x)*(point.getX()-x) + (point.getY()-y)*(point.getY()-y));
    }

    @Override
    public String toString() { // Creating Default toString Method
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
