import java.util.Scanner;

class FahrenheitToCelsius{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature: ");
        float fahren = scanner.nextFloat();
        System.out.println("Celsius: ("+fahren+"-32)*5/9"+" :"+" "+((fahren-32)*5/9));
    }
}