import java.util.Scanner;

class CheckLeapYear{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if((year%4==0 && year%100!=0) || (year % 400 == 0)){
            System.out.println("Yes Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}