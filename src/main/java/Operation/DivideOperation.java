package main.java.Operation;

import main.java.Exception.InvalidCalculationException;

public class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
}