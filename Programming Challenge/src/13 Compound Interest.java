import java.util.Scanner;

class CompoundInterest{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter p: ");
        float p = scanner.nextFloat();
        System.out.println("Please enter r: ");
        float r = scanner.nextFloat();
        System.out.println("Please enter t: ");
        int t = scanner.nextInt();
        double compInt = p * Math.pow((1+r/100), t);
        System.out.println("Compund Interest: "+compInt);
    }
}