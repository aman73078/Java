public class TypeConversion {
    static void main() {
//        Here we assinging litteral as long into float so this is implicit conversion or coercion
//        float myFloat = 5L;

        float myFloat = 5;
        System.out.println(myFloat);

        int myData = (int) 7.0d;
        System.out.println(myData);
    }
}
