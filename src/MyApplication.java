import java.util.ArrayList;

public class MyApplication {
    public void Start(){
        ArrayList<Point> points = new ArrayList<>(); // Creating ArrayList of Points
        Point point = new Point(4,3); // Initializing Points
        Point point1 = new Point(4, 0);
        Point point2 = new Point(0, 0);
        Point point3 = new Point(8, 2);
        Point point4 = new Point(4, 9);
        Point point5 = new Point(6, 1);
        Point point6 = new Point(2, 6);
        Point point7 = new Point(7, 4);
        Point point8 = new Point(5, 8);
        Point point9 = new Point(9, 3);
        points.add(point); // Adding Points to Arraylist
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.add(point5);
        points.add(point6);
        points.add(point7);
        points.add(point8);
        points.add(point9);
        Shape shape = new Shape(points); // Initializing Shape and putting there ArrayList of Points
        System.out.println("Average Side: " + shape.averageSide()); // Using Methods
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
    }

}
