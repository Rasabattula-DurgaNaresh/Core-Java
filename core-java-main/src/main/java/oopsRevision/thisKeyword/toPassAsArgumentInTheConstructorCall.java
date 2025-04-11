package oopsRevision.thisKeyword;

class W{
    toPassAsArgumentInTheConstructorCall obj;

    W(toPassAsArgumentInTheConstructorCall obj)
    {
        this.obj = obj;
    }
    public void display() {
        System.out.println("hi there");
    }
}

public class toPassAsArgumentInTheConstructorCall {
    int data = 10;

    toPassAsArgumentInTheConstructorCall(){
        W w = new W(this);
        w.display();
    }

    public static void main(String[] args) {
        toPassAsArgumentInTheConstructorCall t= new toPassAsArgumentInTheConstructorCall();
    }
}
