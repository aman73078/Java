import java.util.Scanner;

class PerimeterOfRectangle{
    static void main() {
        System.out.println("Welcome to Perimeter of Rectangle.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the width of rectangle: ");
        float width = scanner.nextFloat();
        System.out.println("Please enter the height of rectangle: ");
        float height = scanner.nextFloat();
        System.out.println("Perimeter of rectangle 2*("+width+"+"+height+") :"+" "+(2*(width+height)));
    }
}