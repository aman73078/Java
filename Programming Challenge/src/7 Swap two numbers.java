import java.util.Scanner;
class SwapTwoNumber{
    static void main() {
        System.out.println("Welcome to swapping station.");
           Scanner scanner = new Scanner(System.in);
           System.out.println("Please enter first number: ");
           int firstNumber = scanner.nextInt();
           System.out.println("Please enter second number: ");
           int secondNumber = scanner.nextInt();

           int temp = firstNumber;
           firstNumber = secondNumber;
           secondNumber = temp;
           System.out.println("Swapped numbers: \nFirstNumber: "+firstNumber+"\nSecondNumber"+secondNumber);
    }
}