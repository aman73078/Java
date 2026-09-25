import java.util.Scanner;

class ReverseNumberDigits{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.printf("Reverse digits of %d: %d", number,reverseDigit(number));
        System.out.println();
    }

    public static int reverseDigit(int num){
        int reverseNum = 0;
        while(num > 0){
            reverseNum = (reverseNum*10) + num%10;
            num = num/10;
        }
        return reverseNum;
    }
}