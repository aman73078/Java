import java.util.Scanner;

class CheckNumber{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "";
        if(number > 0){
            result = "Positive";
        }else if(number < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }

        System.out.println("Result is: "+result);
    }
}