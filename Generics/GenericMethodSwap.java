public class GenericMethodSwap{
    public static <T> void Swap(T[] array, int i, int j){
        T temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String[] args){
        String fruits[]={"Apple","Mango","Orange"};
        System.out.println("Before Swapping : ");
        for(String fruit : fruits){
            System.out.print(fruit+" ");
        }

        Swap(fruits,0,2);

        System.out.println("\nAfter Swapping : ");

        for(String fruit: fruits){
            System.out.print(fruit+" ");
        }
    }
}