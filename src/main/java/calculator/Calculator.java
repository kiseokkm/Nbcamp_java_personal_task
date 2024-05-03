package main.java.calculator;

import main.java.Exception.InvalidCalculationException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> results;  // Changed from List<Integer> to accommodate both integers and floating-point results
    private List<Double> circleAreas;

    public Calculator() {
        this.results = new ArrayList<>();
        this.circleAreas = new ArrayList<>();
    }

    public void addResult(double result) {
        results.add(result);
    }

    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    public void setResults(List<Double> newResults) {
        this.results = new ArrayList<>(newResults);
    }

    // Removes the first result from the list if it exists
    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

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

    public void addCircleArea(double area) {
        circleAreas.add(area);
    }

    public List<Double> getCircleAreas() {
        return new ArrayList<>(circleAreas);
    }

    public void setCircleAreas(List<Double> newCircleAreas) {
        this.circleAreas = new ArrayList<>(newCircleAreas);
    }

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