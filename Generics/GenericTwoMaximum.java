public class GenericTwoMaximum{
    public static <T extends Comparable<T>> T maximum (T a, T b){
        if(a.compareTo(b)>0){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args){
        System.out.println("Maximum : "+maximum(29, 7));
        System.out.println("Maximum : "+maximum(7.6, 29.7));
        System.out.println("Maximum : "+maximum("Apple","Mango"));
    }
}