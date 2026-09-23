import java.util.Scanner;

class CategorizeAgeGroup{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 13){
            System.out.println("Child");
        }else if(age < 20){
            System.out.println("Teen");
        }else if(age < 60){
            System.out.println("Adult");
        }else if(age > 60){
            System.out.println("Senior");
        }
    }
}