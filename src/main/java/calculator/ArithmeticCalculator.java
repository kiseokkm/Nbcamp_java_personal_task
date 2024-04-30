package main.java.calculator;

import main.java.Exception.InvalidCalculationException;
import main.java.Operation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArithmeticCalculator {
    private Map<Character, IOperation> operations;
    private List<Double> results = new ArrayList<>();

    public ArithmeticCalculator() {
        operations = Map.of(
                '+', new AddOperation(),
                '-', new SubstractOperation(),
                '*', new MultiplyOperation(),
                '/', new DivideOperation(),
                '%', new ModOperation()  // 예를 들어 나머지 연산을 추가할 수 있음
        );
    }

    public double calculate(double firstNumber, double secondNumber, char operator) throws InvalidCalculationException {
        IOperation operation = operations.get(operator);
        if (operation == null) {
            throw new InvalidCalculationException("잘못됨: " + operator);
        }
        double result = operation.operate((int) firstNumber, (int) secondNumber);
        results.add(result); // 결과를 저장
        return result;
    }

    // 결과 목록을 반환하는 메소드
    public List<Double> getResults() {
        return results;
    }

    // 첫 번째 결과를 삭제하는 메소드
    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    // 결과 목록을 출력하는 메소드
    public void inquiryResults() {
        if (!results.isEmpty()) {
            System.out.println("저장된 결과:");
            for (Double result : results) {
                System.out.println(result);
            }
        } else {
            System.out.println("저장된 결과가 없습니다.");
        }
    }
}
