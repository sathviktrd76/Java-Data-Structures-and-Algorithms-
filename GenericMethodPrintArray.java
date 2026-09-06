public class GenericMethodPrintArray {
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Integer numbers[]={7,29,6};
        String names[]={"Alice","Bob"};
        Double decimals[]={7.6,29.7};
        Character letters[]={'S','A'};

        printArray(numbers);
        printArray(names);
        printArray(decimals);
        printArray(letters);
    }
    
}
