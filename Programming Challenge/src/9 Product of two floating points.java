import java.util.Scanner;

class Product{
    static void main() {
        System.out.println("Welcome to Product.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first floating number: ");
        float firstFloat = scanner.nextFloat();
        System.out.println("Please enter second floating number: ");
        float secondFloat = scanner.nextFloat();
        System.out.println("Product of "+firstFloat+"*"+secondFloat+" :"+" "+(firstFloat*secondFloat));
    }
}