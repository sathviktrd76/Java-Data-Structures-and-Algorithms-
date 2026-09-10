import java.util.*;

public class GenericUpperBoundWildcard{
    public static void printNumbers(List<? extends Number> list){
        for(Number value : list){
            System.out.print(value+" ");
        }
    }

    public static void main(String[] args){
        List<Integer> integers = Arrays.asList(10,20,30);
        System.out.print(integers);
    }
}