import java.util.Scanner;

class AreaOfTriangle{
    public static void main(){
        System.out.println("Welcome to Area of Triangle.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter base of triangle: ");
        float base = scanner.nextFloat();
        System.out.println("Please enter the hight of triangle: ");
        float height = scanner.nextFloat();
        System.out.println("Area of triangle 1/2*("+base+"*"+height+") :"+" "+(0.5*base*height));
    }
}