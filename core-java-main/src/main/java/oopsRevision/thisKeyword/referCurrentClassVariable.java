package oopsRevision.thisKeyword;

class A{
    int a;
    String s;

    A(int a, String s){
        this.a = a;
        this.s = s;
    }

    void display(){
        System.out.println(a+" "+s);
    }
}
public class referCurrentClassVariable {
    public static void main(String[] args) {
        A a = new A(20,"hello");
        a.display();
    }
}
