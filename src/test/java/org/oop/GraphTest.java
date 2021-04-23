package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GraphTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Graph origin = new Graph(0, 0);
        Graph point = new Graph(0, 0);
        double distance = origin.distanceTo(point);
        Assertions.assertEquals(0, distance);
    }

    @Test
    void distanceToBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Graph origin = new Graph(0, 0);
        Graph point1 = new Graph(1, 0);
        Graph point2 = new Graph(0, 1);
        double distance1 = origin.distanceTo(point1);
        double distance2 = origin.distanceTo(point2);
        boolean isDistanceOne = distance1 == distance2;
        Assertions.assertTrue(isDistanceOne);
    }

    @Test
    void distanceToBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Graph point1 = new Graph(1, 0);
        Graph point2 = new Graph(-1, 0);
        double distance = point1.distanceTo(point2);
        Assertions.assertEquals(2, distance);
    }


    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Graph origin = new Graph(0, 0);
        Graph point1 = new Graph(1, 0);
        Graph point2 = new Graph(3, 0);
        double angle1 = origin.angleBetween(point1);
        double angle2 = origin.angleBetween(point2);
        boolean isAngleZero = angle1 == angle2;
        Assertions.assertTrue(isAngleZero);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Graph origin = new Graph(0, 0);
        Graph point1 = new Graph(-1, 0);
        double angle = origin.angleBetween(point1);
        Assertions.assertEquals(Math.PI, angle);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Graph origin = new Graph(0, 0);
        Graph point1 = new Graph(0, 1);
        double angle= point1.angleBetween(origin);

        Assertions.assertEquals(Math.PI / 2, angle);

    }
}
