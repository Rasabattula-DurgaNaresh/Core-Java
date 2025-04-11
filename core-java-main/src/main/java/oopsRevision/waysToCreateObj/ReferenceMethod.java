package oopsRevision.waysToCreateObj;

// Initializing an object means storing data into the object

class Student{
    String name;
    int id;
}

public class ReferenceMethod {
       public static void main(String [] arg)
       {
           Student s= new Student();
           s.id = 10;
           s.name = "Sarthak Rastogi";
           System.out.println(s.id+" "+s.name);
       }
}

