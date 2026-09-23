import java.util.Scanner;

class Airthmatic{
    static void main() {
        System.out.println("Welcome to Airthmatic.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Result of "+num1+"+"+num2+" :"+" "+(num1+num2));
        System.out.println("Result of "+num1+"-"+num2+" :"+" "+(num1-num2));
        System.out.println("Result of "+num1+"*"+num2+" :"+" "+(num1*num2));
        System.out.println("Result of "+num1+"/"+num2+" :"+" "+(num1/num2));
        System.out.println("Result of "+num1+"%"+num2+" :"+" "+(num1%num2));
    }
}