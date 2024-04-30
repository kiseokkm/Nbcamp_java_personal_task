package main.java.calculator;

import main.java.Exception.InvalidCalculationException;
import main.java.Operation.AddOperation;
import main.java.Operation.SubstractOperation;
import main.java.Operation.MultiplyOperation;
import main.java.Operation.DivideOperation;

public class ArithmeticCalculator extends Calculator {
    private AddOperation addOperation;
    private SubstractOperation substractOperation;
    private MultiplyOperation multiplyOperation;
    private DivideOperation divideOperation;

    public ArithmeticCalculator() {
        this.addOperation = new AddOperation();
        this.substractOperation = new SubstractOperation();
        this.multiplyOperation = new MultiplyOperation();
        this.divideOperation = new DivideOperation();
    }

    public double calculate(double firstNumber, double secondNumber, char operator) throws InvalidCalculationException {
        double result;
        switch (operator) {
            case '+':
                result = addOperation.operate((int)firstNumber, (int)secondNumber);
                break;
            case '-':
                result = substractOperation.operate((int)firstNumber, (int)secondNumber);
                break;
            case '*':
                result = multiplyOperation.operate((int)firstNumber, (int)secondNumber);
                break;
            case '/':
                if (secondNumber == 0) {
                    throw new InvalidCalculationException("계산불가");
                }
                result = divideOperation.operate((int)firstNumber, (int)secondNumber);
                break;
            default:
                throw new InvalidCalculationException("연산기호가 잘못 됐습니다");
        }
        addResult(result);
        return result;
    }
}
