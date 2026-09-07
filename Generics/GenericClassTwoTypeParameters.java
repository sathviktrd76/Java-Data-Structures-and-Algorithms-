class Pair<T, U>{
    T first;
    U second;

    Pair(T first, U second){
        this.first=first;
        this.second=second;
    }

    void display(){
        System.out.println("First value : "+first);
        System.out.println("Second value : "+second);
    }
}

public class GenericClassTwoTypeParameters{
    public static void main(String[] args){
        Pair<Integer, String> pair1 = new Pair<>(101,"Sathvik");
        Pair<String, Double> pair2 = new Pair<>("Marks",95.5);

        pair1.display();
        pair2.display();
    }
}