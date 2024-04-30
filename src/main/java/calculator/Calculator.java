package main.java.calculator;

import main.java.Exception.InvalidCalculationException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> results;  // Changed from List<Integer> to accommodate both integers and floating-point results
    private List<Double> circleAreas;

    // Updated constructor to handle the new List<Double> for results
    public Calculator() {
        this.results = new ArrayList<>();
        this.circleAreas = new ArrayList<>();
    }

    // Adds a result to the results list
    public void addResult(double result) {
        results.add(result);
    }

    // Gets a copy of the results list
    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    // Sets a new list of results
    public void setResults(List<Double> newResults) {
        this.results = new ArrayList<>(newResults);
    }

    // Removes the first result from the list if it exists
    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    // Prints all stored results
    public void inquiryResults() {
        if (!results.isEmpty()) {
            System.out.println("저장된 모든 결과:");
            for (double res : results) {
                System.out.println(res);
            }
        } else {
            System.out.println("저장된 결과가 없습니다.");
        }
    }

    // Adds a circle area to the circleAreas list
    public void addCircleArea(double area) {
        circleAreas.add(area);
    }

    // Gets a copy of the circleAreas list
    public List<Double> getCircleAreas() {
        return new ArrayList<>(circleAreas);
    }

    // Sets a new list of circle areas
    public void setCircleAreas(List<Double> newCircleAreas) {
        this.circleAreas = new ArrayList<>(newCircleAreas);
    }

    // Prints all stored circle areas
    public void inquiryCircleResults() {
        if (!circleAreas.isEmpty()) {
            System.out.println("저장된 원의 넓이 결과:");
            for (double area : circleAreas) {
                System.out.println(area);
            }
        } else {
            System.out.println("저장된 원의 넓이 결과가 없습니다.");
        }
    }
}