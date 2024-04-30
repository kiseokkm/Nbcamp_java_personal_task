package main.java.Operation;

public class SubstractOperation implements IOperation {
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
}

