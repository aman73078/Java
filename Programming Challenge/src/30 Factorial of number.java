import java.util.Scanner;

class FactorialOfNumber{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.printf("Factorial of %d: %d",number,factorial(number));
        System.out.println();
    }

    public static int factorial(int num){
        int fact = 1;
        while (num >=1){
            fact *= num;
            num--;
        }
        return fact;
    }
}