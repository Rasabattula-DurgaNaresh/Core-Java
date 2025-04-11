package javabook.volumeone.demos;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        // HashMap 
        Map hm = new HashMap();
        hm.put("hmkey","hmvalue");
        hm.put(new String("hmkey"),"hmvalue1"); // same key but different value

        // prints 1 since it compares the objects logically and both the keys are same
        System.out.println("Size of HashMap--"+hm.size()); // 1

        // IdentityHashMap
        Map ihm = new IdentityHashMap();
        ihm.put("ihmkey","ihmvalue"); 
        ihm.put(new String("ihmkey"),"ihmvalue1"); // same key but different value

        //ihm.size() will print 2 since it compares the objects by reference
        System.out.println("Size of IdentityHashMap--"+ihm.size());  // 2
    }
}
//https://www.geeksforgeeks.org/identityhashmap-class-java/