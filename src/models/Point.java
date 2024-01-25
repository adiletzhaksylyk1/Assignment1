package models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y) {
        this.setX(x);
        this.setY(y);
    }
    
    public double setX() {
        this.x = x;
    }
    public double setY() {
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    // distance(Point dest) - distance from current point to the dest point
    public double distance(Point dest) {
        double xDiff = dest.x - this.x;
        double yDiff = dest.y - this.y;
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    // toString
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
