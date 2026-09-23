import java.util.Scanner;

class SimpleInterest{
    static void main() {
        System.out.println("Welcome to Simple Interest.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of p: ");
        float p = scanner.nextFloat();
        System.out.println("Please enter t: ");
        int t = scanner.nextInt();
        System.out.println("Please enter r: ");
        float r = scanner.nextFloat();
        System.out.println("Simple interest: ("+p+"*"+t+"*"+r+")/"+100+" :"+" "+((p*t*r)/100));
    }
}