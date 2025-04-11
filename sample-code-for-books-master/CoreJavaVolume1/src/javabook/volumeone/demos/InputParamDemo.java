package javabook.volumeone.demos;

public class InputParamDemo {
	public static void main(String[] args)
    {
		int x = 2;
	    System.out.println("Before: x=" + x); // Before: x=2
	    triple(x);
	    System.out.println("After: x=" + x); // After: x=2
    }
	
	private static void triple(Integer x) {
		x = 3 * x;
	}
}
