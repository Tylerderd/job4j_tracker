package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void period() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void period2() {
        Point a = new Point(3, 1);
        Point b = new Point(7, 4);
        Point c = new Point(7, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(6, 0.001));
    }

    @Test
    public void period3() {
        Point a = new Point(1, 6);
        Point b = new Point(4, 6);
        Point c = new Point(1, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(7.5, 0.001));
    }

    @Test
    public void period4() {
        Point a = new Point(5, 5);
        Point b = new Point(7, 5);
        Point c = new Point(7, 7);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(2, 0.001));
    }
}