import java.util.Scanner;

class CheckPalindromeNumber{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        isPalindrome(number);
    }

    public static void isPalindrome(int num){
        int reverseNum = 0;
        int originalNum = num;
        while(originalNum > 0){
            reverseNum = reverseNum*10 + originalNum%10;
            originalNum = originalNum/10;
        }
        System.out.println(num == reverseNum ? "Yes" : "No");
    }
}