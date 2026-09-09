import java.util.List;
import java.util.ArrayList;

public class GenericMethodListAverage{
    public static <T extends Number> double findAverage(List<T> list){
        double sum = 0;

        for(T value : list){
            sum+=value.doubleValue();
        }
        return sum/list.size();
    }

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(29);
        numbers.add(7);
        numbers.add(6);

        double result=findAverage(numbers);

        System.out.println("Average : "+result);
    }
}