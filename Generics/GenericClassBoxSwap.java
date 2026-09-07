class Box<T>{
    T value;

    Box(T value){
        this.value=value;
    }
}

public class GenericClassBoxSwap{
    public static <T> void Swap(Box<T> a , Box<T> b){
        T temp=a.value;
        a.value=b.value;
        b.value=temp;
    }

    public static void main(String[] args){
        Box<Integer> a = new Box<>(29);
        Box<Integer> b = new Box<>(7);

        System.out.println("Before Swapping : ");
        System.out.println("a = "+a.value);
        System.out.println("b = "+b.value);

        Swap(a,b);

        System.out.println("\nAfter swapping : ");
        System.out.println("a = "+a.value);
        System.out.println("b = "+b.value);
    }
}