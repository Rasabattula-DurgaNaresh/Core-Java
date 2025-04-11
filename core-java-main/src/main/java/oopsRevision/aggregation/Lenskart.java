package oopsRevision.aggregation;

class Person{

    void display(String s, Float p)
    {
        System.out.println(s+" "+p);
    }

}
public class Lenskart {
    Person p; // aggregation i.e. incorporating other class obj details in this class...facilitates HAS-A relationship
              // "Lenskart class HAS A reference of Person class"
    String brand;
    Float price;

    void aMethod()
    {
        p = new Person();
        p.display("benFranklin",1800f);
    }
    public static void main(String[] args) {
       Lenskart l = new Lenskart();
       l.aMethod();
    }
}
