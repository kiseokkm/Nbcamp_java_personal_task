package main.java.Operation;

public class MultiplyOperation implements IOperation {
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
}