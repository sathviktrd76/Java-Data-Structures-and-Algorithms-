public class GenericBoundArrayAverage{
    public static <T extends Number> double findAverage(T[] arr){

        double sum = 0;

        for(int i=1;i<arr.length;i++){
            sum+=arr[i].doubleValue();
        }
        return sum/arr.length;
    }
    
    public static void main(String[] args){
        Integer Number[] = {10,20,30,40,50,29,7,6};
        System.out.println("Average : "+findAverage(Number));
    }
}