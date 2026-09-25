import java.util.Scanner;

class CheckPrimeNumber{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.printf("Is it Prime: "+prime(number));
        System.out.println();
    }

    public static String prime(int number){
        int i = 3;
        while(i < number){
            if(number%i==0) return "NOT A PRIME";
            i++;
        };
        return "Yes Prime";
    }
}