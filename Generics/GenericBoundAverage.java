public class GenericBoundAverage {
    public static <T extends Number> double findAverage(T a, T b){
        return (a.doubleValue()+b.doubleValue())/2;
    }
    public static void main(String[] args){
        System.out.println("Average : "+findAverage(10, 20));
        System.out.println("Average : "+findAverage(29.7, 7.6));
    }
    
}
