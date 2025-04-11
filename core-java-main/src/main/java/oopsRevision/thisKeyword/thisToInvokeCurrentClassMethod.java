package oopsRevision.thisKeyword;

class B{
    int x;
    String s;

    void letsPlay()
    {
        System.out.println("lets play");
    }

    void dontPlay(){
        System.out.println("dont play");
        this.letsPlay();
    }
}
public class thisToInvokeCurrentClassMethod {
    public static void main(String[] args) {
        B b = new B();
        b.dontPlay();
    }
}
