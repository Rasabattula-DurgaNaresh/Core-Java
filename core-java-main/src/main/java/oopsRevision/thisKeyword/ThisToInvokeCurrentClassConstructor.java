package oopsRevision.thisKeyword;

class C{
    C(){
        System.out.println("Hello");
    }

    C(int x){
        this(); // so when this constructor is called it firstly will call non-parametrized constructor,
                // this is called constructor chaining
        System.out.println("I am Cristiano Ronaldo");
    }
}
public class ThisToInvokeCurrentClassConstructor {
    public static void main(String[] args) {
        C c = new C(10);
    }
}
