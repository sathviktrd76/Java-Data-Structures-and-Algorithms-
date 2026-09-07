public class GenericMaximumArray{
    public static <T extends Comparable<T>> T maximum(T[] arr){
        T max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i].compareTo(max)>0){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        Integer numbers[]={10,20,30,40,50,60};
        Integer result=maximum(numbers);
        System.out.println("Maximum : "+result);
    }
}