import java.util.Scanner;

class SumOfDigitsOfInteger{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.printf("Sum digit of %d: %d",number,sumOfDigit(number));
        System.out.println();
    }

    public static int sumOfDigit(int num){
        int digitSum = 0;
        while(num >=1 ){
            digitSum += num%10;
            num = num/10;
        }
        return digitSum;
    }
}