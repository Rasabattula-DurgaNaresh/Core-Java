package javabook.volumeone.demos;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentDemo {
	public static void main(String[] args)
    {
		Set<String> mySet = Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());

		Set<String> myConcurrentSet = ConcurrentHashMap.<String>newKeySet();
    }
}
