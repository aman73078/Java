import java.util.Scanner;

public class UserInput {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Good Morning! " + name);
        System.out.println(name + ", also tell me your age.");
        int age = scanner.nextInt();
        System.out.println("Your age is "+age);
    }
}
