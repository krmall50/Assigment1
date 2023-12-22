import java.util.ArrayList;

public class Shape {
    private Point[] points; // Initializing Array of Points

    Shape() { // Creating Empty Constructor
    }

    Shape(ArrayList<Point> point) { // Creating Parametrized Constructor to Accept ArrayList of Points, and Copy this Points to Array of Points
        points = new Point[point.size()];

        for (int i = 0; i < point.size(); i++) {
            points[i] = point.get(i);
        }
    }

    public double perimeter() {
        double sum = 0; // Sum of Sides
        int length = points.length;
        for (int i = 0; i < length - 1; i++) {
            sum += points[i].distanceTo(points[i + 1]); // Summing all sides
        }
        sum += points[0].distanceTo(points[length - 1]); // Closing the Shape
        return sum;
    }

    public double longestSide() {
        int length = points.length;
        double longestSide = points[0].distanceTo(points[1]); // Setting First side to be Longest
        for (int i = 0; i < length - 2; i++) {
            if (longestSide < points[i].distanceTo(points[i + 1])) { // If some other side is Longer
                longestSide = points[i].distanceTo(points[i + 1]); // Setting it to be new Longest Side
            }
        }
        if (points[0].distanceTo(points[length - 1]) > longestSide) { // Checking last side which not considered in for loop
            longestSide = points[0].distanceTo(points[length - 1]);
        }
        return longestSide;

    }
    public double averageSide(){
        return perimeter()/points.length; // Calculating and Return Average
    }


}
