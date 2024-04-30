package main.java.calculator;

public class CircleCalculator extends Calculator {

    public double calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        addResult(area);
        return area;
    }
}
