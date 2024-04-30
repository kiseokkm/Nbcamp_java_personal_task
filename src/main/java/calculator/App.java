package main.java.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.java.Exception.InvalidCalculationException;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> initialResults = new ArrayList<>();
        List<Double> initialCircleAreas = new ArrayList<>(); // 원의 넓이를 저장할 리스트 초기화
        Calculator calc = new Calculator(initialResults, initialCircleAreas);

        while (true) {
            System.out.println("계산을 계속하려면 'calc', 원의 넓이를 계산하려면 'circle'을 입력하세요: ");
            String command = sc.next();

            if (command.equalsIgnoreCase("circle")) {
                System.out.print("원의 반지름을 입력하세요: ");
                double radius = sc.nextDouble();
                double area = calc.calculateCircleArea(radius);
                System.out.println("원의 넓이: " + area);
                calc.inquiryCircleResults(); // 저장된 원의 넓이 결과 조회
            } else if (command.equalsIgnoreCase("calc")) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int firstNumber = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                System.out.print("두 번째 숫자를 입력하세요: ");
                int secondNumber = sc.nextInt();

                try {
                    int result = calc.calculate(firstNumber, secondNumber, operator);
                    System.out.println("결과: " + result);
                } catch (InvalidCalculationException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("현재 저장된 결과의 수: " + calc.getResults().size() + " " + calc.getResults());

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeCmd = sc.next();
                if (removeCmd.equalsIgnoreCase("remove")) {
                    calc.removeFirstResult();
                    System.out.println("첫 번째 결과가 삭제되었습니다.");
                }

                System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiryLook = sc.next();
                if (inquiryLook.equalsIgnoreCase("inquiry")) {
                    calc.inquiryResults(); // 변경
                }
            }

            System.out.println("더 계산하시겠습니까? ('exit'를 입력하면 종료합니다)");
            String input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
        }
        // 종료 시 최종 저장된 결과 출력
        System.out.println("최종 저장된 결과:");
        for (int res : calc.getResults()) {
            System.out.println(res);
        }
        sc.close();
    }
}
