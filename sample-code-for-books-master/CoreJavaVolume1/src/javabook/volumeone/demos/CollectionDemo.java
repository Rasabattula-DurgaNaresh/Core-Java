package javabook.volumeone.demos;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {
    public static void main(String[] args)
    {
        List<String> staff = new LinkedList<>(); 
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");
        ListIterator<String> iter = staff.listIterator(); 
        iter.next(); // skip past first element 
        iter.add("Juliet");
        iter.add("John");
        
        for(String item: staff) {
            System.out.println(item);
        }
        
        String greeting = "Hello";
        int n = greeting.length(); // is 5.
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(n);
        System.out.println(cpCount);
    }
}
