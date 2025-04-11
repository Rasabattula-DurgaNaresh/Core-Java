package oopsRevision;

// Anonymous simply means nameless. An object which has no reference is known as an anonymous object.
// It can be used at the time of object creation only.

class Calculation{
    void printIntegers()
    {
        int i=1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new Calculation().printIntegers(); // anonymous object
    }
}
