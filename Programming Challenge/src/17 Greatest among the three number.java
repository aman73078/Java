import java.util.Scanner;

class GreatestNumber{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1>num2 && num1 > num3){
            System.out.println("Greatest Number: "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("Greatest Number: "+num2);
        }else{
            System.out.println("Greatest Number: "+num3);
        }
    }
}