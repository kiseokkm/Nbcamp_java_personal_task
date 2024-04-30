package main.java.calculator;

import main.java.Exception.InvalidCalculationException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;

    public Calculator() {
        results = new ArrayList<>();
    }

    public int calculate(int firstNumber, int secondNumber, char operator) throws InvalidCalculationException {
        int result = 0;
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    throw new InvalidCalculationException("계산불가");
                }
                result = firstNumber / secondNumber;
                break;
            default:
                throw new InvalidCalculationException("연산기호가 잘못 됐습니다");
        }
        addResult(result); // 결과 추가
        return result;
    }

    public List<Integer> getResults() {
        return new ArrayList<>(results);
    }

    public void setResults(List<Integer> newResults) {
        this.results = new ArrayList<>(newResults);
    }

    public void addResult(int result) {
        results.add(result);
    }

    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}
