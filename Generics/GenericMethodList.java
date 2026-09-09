import java.util.List;
import java.util.ArrayList;

public class GenericMethodList{
    public static <T> void printList(List<T> list){
        for(T value : list){
            System.out.println(value);
        }
    }

    public static void main(String[] args){
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);

        printList(number);
    }
}