package main.java.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList 생성
        List<Integer> results = new ArrayList<>();

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
                results.add(result); // 결과를 리스트에 추가
                System.out.println("현재 저장된 결과의 수: " + results.size() + " " + results);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeCmd = sc.next();
                if (removeCmd.equalsIgnoreCase("remove")) {
                    if (!results.isEmpty()) {
                        results.remove(0);
                        System.out.println("첫 번째 결과가 삭제되었습니다.");
                    } else {
                        System.out.println("삭제할 결과가 없습니다.");
                    }
                }
            }
            // 계속 계산할지 묻는 부분
            System.out.println("더 계산하시겠습니까? ('exit'를 입력하면 종료합니다)");
            String input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
        }
        // 저장된 모든 결과 출력
        System.out.println("최종 저장된 결과:");
        for (int i = 0; i < results.size(); i++) {
            System.out.println("결과 " + (i + 1) + ": " + results.get(i));
        }

        sc.close();
    }
}
