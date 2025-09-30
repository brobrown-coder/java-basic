import java.util.Scanner;

public class BasicCalculator {
    // 덧셈 메소드 선언
    public int add(int first, int second) {
        return first + second;
    }

    
    public static void main(String[] args) {
        System.out.println("이것은 계산기 입니다");

        // 사용자 입력으로 두 정수 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int first = scanner.nextInt();
        System.out.print("두 번째 정수: ");
        int second = scanner.nextInt();

        BasicCalculator calculator = new BasicCalculator();
        int result = calculator.add(first, second);
        System.out.println("결과: " + result);

        scanner.close();
    }
}


