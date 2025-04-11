package javabook.volumeone.demos;
import java.util.EnumSet;

public class EnumerationSetAndMapDemo {
    enum Weekday { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }; 
    static EnumSet<Weekday> always = EnumSet.allOf(Weekday.class);
    static EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
    static EnumSet<Weekday> workday = EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY); 
    static EnumSet<Weekday> mwf = EnumSet.of(Weekday.MONDAY, Weekday.WEDNESDAY, Weekday.FRIDAY);
    
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.asList(Weekday.values())); // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]
        System.out.println(always);  // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]
        System.out.println(never);   // []
        System.out.println(workday); // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]
        System.out.println(mwf);     // [MONDAY, WEDNESDAY, FRIDAY]
    }
}
