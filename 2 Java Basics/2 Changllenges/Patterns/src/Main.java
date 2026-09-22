public class Main{
    public static void main(){
        pattern1(4);
        pattern1Way2(5);
    }

    public static void pattern1(int rows){
        String pattern = "";
        for(int row=0; row<rows; row++){
            String line = "";
            for(int col=0; col<=row; col++){
                line += "*";
            }
            pattern += line + '\n';
        }
        System.out.println(pattern);
    }

    public static void pattern1Way2(int rows){
        for(int row=1; row<=rows; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}