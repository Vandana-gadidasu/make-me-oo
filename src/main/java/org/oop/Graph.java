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

    public double distanceTo(Graph to) {
        double xDistance = this.x-to.x;
        double yDistance = this.y-to.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
    public double angleBetween(Graph to){
        double xDistance=this.x-to.x;
        double yDistance=this.y-to.y;
        return Math.atan2(yDistance,xDistance);
    }



}


// class Graph{
//x,y
//
//        distanceTo (Graph g)
//        { this.x - g.x
//        this.y - g.y
//        }
//
//
//        static
//}
//
//instance = new Graph(1,2)
//instance2 = new Graph(3,4)
//
//
//
//
//instance1.distanceto(instance2)


