import java.util.Scanner;

class FibonacciSeries{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        printFibonacci(number);
    }

    public static void printFibonacci(int num){
        if(num < 0) return;
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");

        int first = 0;
        int second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }
}