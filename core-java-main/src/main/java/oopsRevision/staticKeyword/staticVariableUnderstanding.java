package oopsRevision.staticKeyword;
import java.util.*;

class Counter2{
    static int x =0;
    Counter2(){
        x++;
        System.out.println(x);
    }
}
class Counter{
    int x =0;
    Counter()
    {
        x++;
        System.out.println(x);
    }
}
public class staticVariableUnderstanding {
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER 1 FOR INSTANCE VARIABLE case study & ENTER 2 FOR STATIC VARIABLE case study  ");

        int n = s.nextInt();

        if(n == 1)
        {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();
            Counter c4 = new Counter();
            System.out.println("the value remains same evey time the obj is created when u choose instance variable");
        }
        else if (n == 2)
        {
            Counter2 cc1 = new Counter2();
            Counter2 cc2 = new Counter2();
            Counter2 cc3= new Counter2();
            Counter2 cc4 = new Counter2();
            System.out.println("value changes because u used static variable");

        }
        else {
            System.out.println("bad request");
        }
    }
}
