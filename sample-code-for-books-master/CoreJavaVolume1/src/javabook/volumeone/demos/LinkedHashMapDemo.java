package javabook.volumeone.demos;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        testInsertionOrder();
        testAccessOrder();
    }
    
    private static void testInsertionOrder() {
        System.out.println("Insertion Order of LinkedHashMap...");
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(1, "Peter");
        lhm.put(2, "Mike");
        lhm.put(3, "Johnny");
        lhm.put(4, "Cindy");

        lhm.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
    }
    
    private static void testAccessOrder() { 
        System.out.println("Access Order of LinkedHashMap...");
        LinkedHashMap<Integer, String> lru = new LinkedHashMap<Integer, String>(16, .75f, true); // LRU
        lru.put(1, "Peter");
        lru.put(2, "Mike");
        lru.put(3, "Johnny");
        lru.put(4, "Cindy");

        // initial sequence
        lru.forEach((k, v) -> System.out.println("initial sequence: key=" + k + ", value=" + v));
        System.out.println("Keys1:" + lru.keySet().toString());

        lru.get(3);
        System.out.println("Keys2:" + lru.keySet().toString());

        lru.get(1);
        System.out.println("Keys3:" + lru.keySet().toString());
    }
}
//http://www.baeldung.com/java-linked-hashmap
