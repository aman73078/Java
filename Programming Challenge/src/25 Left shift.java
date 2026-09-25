import java.util.Scanner;

class BitwiseLeftShift{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int result = number << 5;
        System.out.println("Result of <<: "+result);
    }
}