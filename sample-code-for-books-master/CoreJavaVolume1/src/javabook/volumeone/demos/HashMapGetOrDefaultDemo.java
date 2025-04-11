package javabook.volumeone.demos;
import java.util.HashMap;

public class HashMapGetOrDefaultDemo {
    public static void main(String[] args) throws InterruptedException {
        HashMap<Integer, String> mapStudent = new HashMap<>();
        // put contents to our HashMap
        mapStudent.put(12001, "Eric");
        mapStudent.put(12002, "Johnny");
        
        String name = mapStudent.getOrDefault(12003, "DefaultName");
        System.out.println(name);
        
        mapStudent.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
    }
}
