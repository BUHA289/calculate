package week03.parameter.staticFolder;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {

            System.out.println("첫번째 숫자 입력해라");
            int num1 = sc.nextInt();

            System.out.println("두번째 숫자 입력");
            int num2 = sc.nextInt();

            System.out.println("사칙연산 입력하시오.");
            char op = sc.next().charAt(0);

            int result = 0;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case '/':
                    if (num1 != 0 && num2 != 0) {
                        result = num1 / num2;
                        System.out.println(result);
                    } else {
                        System.out.println("오류입니다");
                    }
                    break;
                default:
                    System.out.println("오류라고요");
                    break;
            }
            System.out.println("더계싼?");
            input = sc.next();

            if (input.equals("exit")) {
                break;
            }
        }


    }
}

