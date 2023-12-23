package models;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)

    ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }


    // addPoint(Point) - adds to the container
    public void addPoint(Point point) {
        points.add(point);
    }


    // calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);

            perimeter += currentPoint.distance(nextPoint);
        }

        return perimeter + points.getFirst().distance(points.getLast());
    }


    // getAverageSide()
    public double getAverageSide() {
        double totalLength = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);

            totalLength += currentPoint.distance(nextPoint);
        }

        return (totalLength + points.getFirst().distance(points.getLast())) / points.size();
    }


    // getLongestSide()
    public double getLongestSide() {
        double longestSide = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);

            double currentSide = currentPoint.distance(nextPoint);

            if (currentSide > longestSide) {
                longestSide = currentSide;
            }
        }

        return longestSide;
    }
}