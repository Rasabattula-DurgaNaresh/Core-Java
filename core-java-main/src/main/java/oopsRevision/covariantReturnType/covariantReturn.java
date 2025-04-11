package oopsRevision.covariantReturnType;

class Q{
    Q get(){
        return this;
    }
}
public class covariantReturn extends Q{
    @Override
    covariantReturn get() //method overriding but changed return type
    {
        return this;
    }

    void msg(){System.out.println("hi there");}

    public static void main(String[] args) {
        new covariantReturn().get().msg();
    }
}
