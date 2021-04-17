package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.oop.Graph.direction;

public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Graph origin = new Graph(0, 0);
        Assertions.assertEquals(0, Graph.distance(origin, origin));
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Graph origin = new Graph(0, 0);
        Graph point1 = new Graph(1, 0);
        Graph point2 = new Graph(0, 1);

        Assertions.assertEquals(1, Graph.distance(origin, point1));
        Assertions.assertEquals(1, Graph.distance(origin, point2));
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Graph point1 = new Graph(1, 0);
        Graph point2 = new Graph(-1, 0);

        Assertions.assertEquals(2, Graph.distance(point1, point2));
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Graph origin = new Graph(0, 0);
        Graph point1 = new Graph(1, 0);
        Graph point2 = new Graph(3, 0);

        Assertions.assertEquals(0, direction(origin, point1));
        Assertions.assertEquals(0, direction(origin, point2));
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Graph origin = new Graph(0, 0);
        Graph point1 = new Graph(-1, 0);
        Graph point2 = new Graph(-3, 0);

        Assertions.assertEquals(Math.PI, direction(origin, point1));
        Assertions.assertEquals(Math.PI, direction(origin, point2));
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Graph origin = new Graph(0, 0);
        Graph point1 = new Graph(0, 1);
        Graph point2 = new Graph(0, 3);

        Assertions.assertEquals(Math.PI / 2, direction(origin, point2));
        Assertions.assertEquals(Math.PI / 2, direction(origin, point1));
    }
}
