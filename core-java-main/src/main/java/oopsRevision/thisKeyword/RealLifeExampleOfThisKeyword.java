package oopsRevision.thisKeyword;

class Car{
    String name;
    Float price;
    Integer modelYear;
    Integer rating;

    Car(String name, Float price, Integer modelYear){
        this.name = name;
        this.price = price;
        this.modelYear = modelYear;
    }

    Car(String name, Float price, Integer modelYear,int rating)
    {
        this(name,price,modelYear); // making use of constructor
        this.rating=rating;
    }

    void display()
    {
       System.out.println(name+" "+price+" " +modelYear+" "+rating);
    }



}
public class RealLifeExampleOfThisKeyword {
    public static void main(String[] args) {
        Car c = new Car("swift",600000f,2019);
        c.display();

        Car c2 = new Car("swift",600000f,2019,5);
        c2.display();
    }
}
