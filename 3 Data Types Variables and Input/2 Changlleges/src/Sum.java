import java.util.Scanner;

public class Sum {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of "+firstNumber+" and "+secondNumber+" : "+sum);
    }
}
