public class RightHalfPyramid {
    public static void main() {
        pattern(5);
    }

    public static void pattern(int rows){
        for(int row=1; row<=rows; row++){
            for(int col=1; col<=rows-row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
