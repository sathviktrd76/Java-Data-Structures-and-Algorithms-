class Box<T>{

    private T value;

    public void setValue(T value){
        this.value=value;
    }

    T getValue(){
        return value;
    }
}

public class GenericBox{
    public static void main(String[] args){
        Box<Integer> intBox=new Box<>();
        intBox.setValue(76);
        System.out.println("Integer : "+intBox.getValue());

        Box<String> strBox=new Box<>();
        strBox.setValue("Sathvik T");
        System.out.println("String : "+strBox.getValue());
    }
}