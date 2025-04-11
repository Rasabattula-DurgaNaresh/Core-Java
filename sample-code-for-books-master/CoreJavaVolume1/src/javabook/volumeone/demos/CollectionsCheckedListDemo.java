package javabook.volumeone.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CollectionsCheckedListDemo {
    public static void main(String a[]){
        // Example 1
        ArrayList<String> strings = new ArrayList<>();
        ArrayList rawList = strings; // warning only, not an error, for compatibility with legacy code 
        rawList.add(new Date()); // now strings contains a Date object!
        
        // Example 2
        List myList = new ArrayList();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        //you can add any type of elements to myList object
        myList.add(10);

        List chkList = Collections.checkedList(myList, String.class);
        System.out.println("Checked list content: "+chkList); // [one, two, three, four, 10]
        chkList.add(10); //throws java.lang.ClassCastException: Attempt to insert class java.lang.Integer element into collection with element type class java.lang.String
    }
}
//https://www.java2novice.com/java-collections-and-util/collections/checked-list/
