package Lab_OOPDS.Lab03_q1;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        double d = Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
        
        return d;
    }

    public String toString() {
        String coordinate = "(" + x + "," + y + ")";

        return coordinate;
    }
}
