package javabook.volumeone.demos;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {

        try {
            testHashMap();
            testWeakHashMap();
        }
        catch (InterruptedException iex) {
            System.out.println(iex);
        }
    }
    
    private static void testHashMap() throws InterruptedException {
        Map<Object, String> hm = new HashMap<Object, String>();

        Object key = new Object();
        hm.put(key, "xyz");
        System.out.println(hm.size());  // 1
        key = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(hm.size());  // 1
    }

    private static void testWeakHashMap() throws InterruptedException {
        Map<Object, String> whm = new WeakHashMap<Object, String>();

        Object key = new Object();
        whm.put(key, "xyz");

        System.out.println(whm.size()); // 1
        key = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(whm.size()); // 0  the only item has been garbage collected
    }
}
//http://www.onjava.com/pub/a/onjava/2001/07/09/optimization.html?page=2