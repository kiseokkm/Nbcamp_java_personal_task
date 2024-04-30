package main.java.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNumber = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNumber = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);

        //사칙연산 구현
        int result = 0;
        switch (operator) {
            case '+' :
                result = firstNumber + secondNumber;
                break;
            case '-' :
                result = firstNumber - secondNumber;
                break;
            case '*' :
                result = firstNumber * secondNumber;
                break;
            case '/' :
                if (secondNumber == 0) {
                    System.out.println("다시 입력하세요. 나누기에서 두번째 수는 0 입력 불가능 합니다."); //오류 출력
                    System.exit(0); //종료
                } else {
                    result = firstNumber/ secondNumber;
                }
                break;
            default:
                System.out.println("사칙연산 기호를 다시 입력하세요.");
                System.exit(0);
        }

        System.out.println("결과 : " + result);


    }
}