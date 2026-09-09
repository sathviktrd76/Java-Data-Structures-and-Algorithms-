public class GenericBound{
    public static <T extends Number> void printNumber(T value){
        System.out.println(value);
    }
    public static void main(String[] args){
        printNumber(297);
        printNumber(7.6);

        // compiler will show an error when we pass String
    }
}