package oopsRevision.strings;

public class StringImmutability {
    public static void main(String [] args)
    {
        String s = "Sarthak";
        s.concat("Rastogi"); // a new object with SarthakRastogi gets created, but s is reference to the Sarthak obj only
        System.out.println(s); // O/p:- Sarthak....because reference is pointing to Sarthak only
        
    }
}
