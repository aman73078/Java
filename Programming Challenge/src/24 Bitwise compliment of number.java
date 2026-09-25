import java.util.Scanner;

class BitwiseNOT{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int result = ~number;
        System.out.println("Result of NOT: "+result);
    }
}