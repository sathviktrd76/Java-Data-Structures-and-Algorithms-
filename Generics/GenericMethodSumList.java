import java.util.List;
import java.util.ArrayList;

public class GenericMethodSumList{
    public static <T extends Number> double sum(List<T> list){
        double total=0;

        for(T value : list){
            total+=value.doubleValue();
        }
        return total;

    }

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        double result = sum(numbers);

        System.out.println("Sum = "+result);
    }

}