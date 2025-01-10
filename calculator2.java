package week03.parameter.staticFolder.task01;

public class calculator {
    public int calculate(int a, int b, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    return 0; // 나눗셈 오류 시 0 반환
                }
                break;
            default:
                System.out.println("올바른 연산 기호를 입력하세요.");
                return 0; //
        }
        return result;
    }

}


//        }
