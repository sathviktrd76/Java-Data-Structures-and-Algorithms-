class Student implements Comparable<Student>{
    int marks;

    Student(int marks){
        this.marks=marks;
    }

    @Override 

    public int compareTo(Student other){
        return this.marks-other.marks;
    }
}

public class CustomClassComparable{
    public static <T extends Comparable<T>> T maximum(T a, T b){
        if(a.compareTo(b)>0){
            return a;
        }
        return b;
    }

    public static void main(String[] args){
        Student s1 = new Student(75);
        Student s2 = new Student(90);
        Student result = maximum(s1, s2);
        System.out.println("Maximum marks : "+result.marks);

    }
}