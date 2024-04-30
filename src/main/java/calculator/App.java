package main.java.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {//while 문 반복
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();


            int result = 0;
            boolean realOperation = true;

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
                        System.out.println("다시 입력하세요. 나누기에서 두번째 수는 0이 될 수 없습니다.");
                        realOperation = false; // 나눗셈 실패 시 끝
                    } else {
                        result = firstNumber / secondNumber;
                    }
                    break;
                default:
                    System.out.println("사칙연산 기호를 다시 입력하세요.");
                    realOperation = false; // 이상한거 넣을시 끝
            }

            if (realOperation) {
                System.out.println("결과: " + result);
            }

            // exit 입력시 종료 되신 go or 해 입력시 계속 , 그 외 종료
            System.out.println("더 계산하시겠습니까? ('go' 또는 '해'를 입력하면 계속합니다, 그 외는 종료)");
            String input = sc.next();
            if (!input.equals("go") && !input.equals("해")) {
                break;
            }
        }

        sc.close();
    }
}
