import java.util.Scanner;

class SumAllOddNumbers{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Sum of all odd numbers: "+sumOddNumbers(number));
    }

    public static int sumOddNumbers (int num){
        int sum = 0;
        int i = 1;
        while (i<=num){
            if((i & 1) == 1){
                sum += i;
            }
            i++;
        }
        return sum;
    }
}