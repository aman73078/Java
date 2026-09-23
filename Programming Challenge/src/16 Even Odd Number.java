import java.util.Scanner;

class CheckEvenOddNumber{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}