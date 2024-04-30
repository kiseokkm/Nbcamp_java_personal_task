package main.java.Operation;

public class ModOperation implements IOperation {
    @Override
    public double operate(int firstNum, int secondNum) {
        if (secondNum == 0) throw new IllegalArgumentException("계산불가");
        return firstNum % secondNum;
    }
}