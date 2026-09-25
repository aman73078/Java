import java.util.Scanner;

class EvenOddBitwise{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if((number & 1) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}