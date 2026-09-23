import java.util.Scanner;

class CalculateGrades{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        char grade = 'F';
        if(marks>90){
            grade = 'A';
        }else if(marks>75){
            grade = 'B';
        }else if(marks>60){
            grade = 'C';
        }else if(marks>30){
            grade = 'D';
        }else if(marks<30){
            grade = 'F';
        }
        System.out.println("Grade: "+grade);
    }
}