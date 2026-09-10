import java.util.*;
public class GenericLowerBoundedWildcard {
    public static void addNumbers(List<? super Integer> list){
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
    }

    public static void main(String[] args){
        List<Integer> integers = new ArrayList<>();
        addNumbers(integers);
        System.out.println(integers);

        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);
        System.out.println(numbers);

        List<Object> objects = new ArrayList<Object>();
        addNumbers(objects);
        System.out.println(objects);
    }
}
