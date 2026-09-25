import java.util.Scanner;

class BitwiseRightShift{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int result = number >> 1;
        System.out.println("Result of >>: "+result);
    }
}