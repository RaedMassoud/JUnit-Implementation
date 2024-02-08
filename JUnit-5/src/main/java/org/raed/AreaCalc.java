package org.raed;

public class AreaCalc {

    // Returns area of a square
    public double areaOfSquare(double side) {
        return side > 0? side * side : 0;
    }

    // Returns the area of a circle
    public double areaOfCircle(double radius) {
        return Math.round(radius > 0? Math.PI * Math.pow(radius, 2) : 0);
    }


}
