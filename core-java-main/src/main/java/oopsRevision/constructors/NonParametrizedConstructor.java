package oopsRevision.constructors;

class Car{
    String carName;
    Float carPrice;

    Car(){
        carName = "swift";
        carPrice = 600000.23f;
    }
}
public class NonParametrizedConstructor {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.carName+" "+car.carPrice);
    }
}
