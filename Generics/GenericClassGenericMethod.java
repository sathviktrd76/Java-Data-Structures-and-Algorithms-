public class GenericClassGenericMethod{
    static class Box<T>{
        private T value;

        Box(T value){
            this.value=value;
        }
    

        public <U> void display(U data){
            System.out.println("Box value : "+value);
            System.out.println("Method value : "+data);
        }
    }
     public static void main(String[] args){
        Box<Integer> intBox=new Box<>(100);
        intBox.display("Hello");
        intBox.display(7.6);
     }
}
