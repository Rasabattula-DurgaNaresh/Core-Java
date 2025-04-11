package javabook.volumeone.demos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BulkOperationsDemo {
    public static void main(String a[]){
        String[] nameA = new String[] {"Peter","Mike","Johnny","Cindy"};
        String[] nameB = new String[] {"Mike","Eric","Cindy","Allan","Talor"};
        List<String> listA = Arrays.asList(nameA);
        List<String> listB = Arrays.asList(nameB);
        Set<String> result = new HashSet<>(listA);
        result.retainAll(listB);
        System.out.println(result); // [Mike, Cindy]
    }
}
