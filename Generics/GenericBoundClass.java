class NumberBox<T extends Number>{
    private T value;

    NumberBox(T value){
        this.value=value;
    }

    public double getValue(){
        return value.doubleValue();
    }
}

public class GenericBoundClass{
    public static void main(String[] args){
        NumberBox<Integer> a = new NumberBox<>(297);
        NumberBox<Double> b = new NumberBox<>(7.6);

        System.out.println("Integer value : "+a.getValue());
        System.out.println("Double value : "+b.getValue());

    }
}