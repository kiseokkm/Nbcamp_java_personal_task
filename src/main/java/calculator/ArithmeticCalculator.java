package main.java.calculator;

import main.java.Exception.InvalidCalculationException;

public class ArithmeticCalculator extends Calculator {

    public double calculate(double firstNumber, double secondNumber, char operator) throws InvalidCalculationException {
        double result;
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
                    throw new InvalidCalculationException("Division by zero");
                }
                result = firstNumber / secondNumber;
                break;
            default:
                throw new InvalidCalculationException("Invalid operation");
        }
        addResult(result);
        return result;
    }
}
