import java.util.Scanner;

class CheckArmstrong{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        isArmstrong(number);
    }

    public static void isArmstrong(int num){
        int originalNum = num;
        int digitCount = String.valueOf(originalNum).length();
        int sumOfDigit = 0;
        while(num > 0){
            sumOfDigit += Math.pow(num%10,digitCount);
            num = num/10;
        };
        System.out.println(originalNum == sumOfDigit ? "Yes" : "No");
    }
}