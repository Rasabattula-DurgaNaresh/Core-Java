package oopsRevision.waysToCreateObj;

class Student1{
    long rollNo;
    String name;

    void setRecord(long rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayInformation()
    {
        System.out.println(rollNo+" "+name);
    }

}
public class initializationThroughMethod {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        s1.setRecord(220027015, "Sarthak Rastogi");
        s2.setRecord(220027010, "Satish Rana");

        s1.displayInformation();
        s2.displayInformation();

    }
}


