class MultiplicationTable{
    public static void main(){
        printTable(5);
    }

    public static void printTable(int num){
        int i = 1;
        while (i <= 10){
            System.out.printf("%d * %d = %d\n", num, i, num * i);
            i++;
        }
    }
}