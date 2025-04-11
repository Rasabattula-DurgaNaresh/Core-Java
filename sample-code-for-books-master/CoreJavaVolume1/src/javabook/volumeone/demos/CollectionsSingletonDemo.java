package javabook.volumeone.demos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSingletonDemo {
	public static void main(String args[])
    {
        String[] numbers = {"1", "2", "4", "2", "1", "2", "3", "1", "3", "4", "3", "3"};
 
        /* Creating list and removing its elements */
        List numList = new ArrayList(Arrays.asList(numbers));
        System.out.println("Original: " + numList);
        numList.remove("1");
        System.out.println("numList after removal of 1 " + numList);
        numList.remove("1");
        System.out.println("numList after removal of 1  " + numList);
        numList.remove("2");
        System.out.println("numList after removal of 2 " + numList);
 
        /* Creating another list and removing its elements using singleton() method */
        List numList2 = new ArrayList(Arrays.asList(numbers));
        System.out.println("Original: " + numList2);
 
        // Selectively delete "1" from all it's occurrences
        numList2.removeAll(Collections.singleton("1"));
        System.out.println("numList2 after removal of 1 with singleton:" + numList2);
 
        // Selectively delete "4" from all it's occurrences
        numList2.removeAll(Collections.singleton("4"));
        System.out.println("numList2 after removal of 4 with singleton:" + numList2);
 
        // Selectively delete "3" from all it's occurrences
        numList2.removeAll(Collections.singleton("3"));
        System.out.println("numList2 after removal of 3 with singleton: " + numList2);
    }
}
