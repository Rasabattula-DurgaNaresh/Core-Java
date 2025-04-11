package oopsRevision.waysToCreateObj;

class Student3{
    int rollNo ;
    String name ;

    Student3(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}
public class initializationUsingConstructor {
    public static void main(String[] args) {
        Student3 st1 = new Student3(10,"Sarthak Rastogi");

        System.out.println(st1.rollNo+" "+st1.name);
    }
}
