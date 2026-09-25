import java.util.Scanner;

class LeastCommonMultiple{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.printf("LCM of %d and %d: %d",firstNumber,secondNumber,lcm(firstNumber,secondNumber));
        System.out.println();
    }

    public static int lcm(int num1, int num2){
        int multiply = Math.max(num1,num2);
        while(true){
            if(multiply%num1 ==0 && multiply%num2 ==0){
                return multiply;
            }
            multiply++;
        }
    }
}