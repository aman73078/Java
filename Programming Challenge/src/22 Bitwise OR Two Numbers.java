import java.util.Scanner;

class BitwiseOR{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int result = firstNumber | secondNumber;
        System.out.println("Result of OR: "+result);
    }
}