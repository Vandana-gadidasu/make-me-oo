package org.oop;

public class Graph {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Graph(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Graph from, Graph to) {
        double xDistance = getxDistance(from, to);
        double yDistance = getyDistance(from, to);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }


    public static double direction(Graph from, Graph to) {
        double xDistance = getxDistance(to, from);
        double yDistance = getyDistance(from, to);
        return Math.atan2(yDistance, xDistance);
    }

    private static double getyDistance(Graph from, Graph to) {
        return to.getY() - from.getY();
    }

    private static double getxDistance(Graph from, Graph to) {
        return from.getX() - to.getX();
    }
}
