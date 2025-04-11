package oopsRevision.staticKeyword;
// a static method belongs to class and not instance
// you can call a static method without need of creating an instance
// with static methods u can change static variables as well
class Person
{
    String name ;
    int age;
    static String place = "Sitapur";

    static void update()
    {
        place = "Ghaziabad";
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void result(){
        System.out.println(name+" "+age+" "+place);
    }

}
public class staticMethod {
    public static void main(String[] args) {
        Person p = new Person("Sarthak",20);
        Person.update(); // static method should be accessed by direct class as reference
        p.result();


    }
}
