package oopsRevision.constructors;

class Bike{
    String name;
    Float price;

    Bike(String name,Float price)
    {
        this.name = name;
        this.price = price;
    }
}
public class ParametrizedConstructor {
    public static void main(String[] args) {
        Bike bike = new Bike("HeroHonda",65000f);
        System.out.println(bike.name+" "+bike.price);
    }
}
