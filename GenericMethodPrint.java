public class GenericMethodPrint {
    public static <T> void print(T value){
        System.out.println(value);
    }

    public static void main(String[] args){
        print(100);
        print("Sathvik");
        print(7.6);
    }
    
}
