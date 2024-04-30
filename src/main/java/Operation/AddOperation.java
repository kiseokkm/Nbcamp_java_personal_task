package main.java.Operation;

public class AddOperation implements IOperation {
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}