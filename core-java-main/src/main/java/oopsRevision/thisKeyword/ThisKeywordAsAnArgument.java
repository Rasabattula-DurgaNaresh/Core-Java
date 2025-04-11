package oopsRevision.thisKeyword;
class Z
{
    void methodTemp(Z obj)
    {
         System.out.println("hi there");
    }

    void display()
    {
        methodTemp(this);
    }
}
public class ThisKeywordAsAnArgument {
    public static void main(String[] args) {
        Z z = new Z();
        z.display();
    }
}
