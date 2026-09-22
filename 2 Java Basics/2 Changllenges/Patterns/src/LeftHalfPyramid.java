public class LeftHalfPyramid {
    static void main() {
        pattern(5);
    }

    public static void pattern(int rows){
        for(int row=1; row<=rows; row++){
            for(int col=1; col<=(rows-row); col++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
