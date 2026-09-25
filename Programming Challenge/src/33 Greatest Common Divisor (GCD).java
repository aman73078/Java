import java.util.Scanner;

class GreatestCommonDivior{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.printf("GCD of %d and %d: %d",firstNumber,secondNumber,gcd(firstNumber,secondNumber));
        System.out.println();
    }

    public static int gcd(int num1, int num2){
        int max = Math.max(num1,num2);
        int result = 0;
        while(max >1){
            if(num1%max ==0 && num2%max==0){
                result = max;
            }
            max--;
        }
        return result;
    }
}