package oopsRevision.strings;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO";
        String s4 = "hello";
        String s3 = new String("hello");

        // equals methods compare only values not references
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.equals(s2)); // false


        // using == operator checks if references are pointing to same obj
        System.out.println(s1 == s3); // false
        System.out.println(s1 == s4); // true

        // using compareTo method compares the two strings lexicographically
        System.out.println(s1.compareTo(s2)); // 32
        System.out.println(s1.compareTo(s3)); // 0
        System.out.println(s1.compareTo(s4)); // 0

        // another method of convatinating
        String str = String.format("%s%s",s1,s2);
        System.out.println(str);

    }
}
