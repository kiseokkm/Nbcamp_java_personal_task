package main.java.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열생성
        int[] results = new int[10];
        int index = 0; // 초기화

        while (true) {
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
                        realOperation = false;
                    } else {
                        result = firstNumber / secondNumber;
                    }
                    break;
                default:
                    System.out.println("사칙연산 기호를 다시 입력하세요.");
                    realOperation = false;
                    System.exit(0);
            }

            if (realOperation) {
                System.out.println("결과: " + result);
                // 결과를 배열에 저장
                if (index < 10) {
                    results[index] = result;
                    index++; // 인덱스 증가
                    System.out.println("현재 저장된 결과의 수: " + index); //계산할때마다 몇개저장된지 몰라서 넣음
                } else {
                    System.out.println("10개초과");
                }
            }

            // 계산 계속 여부 확인
            System.out.println("더 계산하시겠습니까? ('go' 또는 '해'를 입력하면 계속합니다, 그 외는 종료)");
            String input = sc.next();
            if (!input.equals("go") && !input.equals("해")) {
                break;
            }
        }
        // 배열에 저장된 모든 결과 출력
        System.out.println("저장된 결과:");
        for (int i = 0; i < index; i++) {
            System.out.println("결과 " + (i + 1) + ": " + results[i]);
        }

        sc.close();
    }
}
