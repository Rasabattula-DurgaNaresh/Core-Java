package oopsRevision.staticKeyword;
// note that static keyword is created when class is created, i.e. before the creation of object
class Pupil{
    int rollNo;
    String coll = "AKGEC Ghaziabad"; // it shows all the pupil will belong to same college
    // then instead of making it a simple variable make it static, so that when every time a new pupil object is created
    // then every time the variable will not get recreated.

//   static String coll = "AKGEC Ghaziabad";

    Pupil(int rollNo){
        this.rollNo = rollNo;
    }
    void printPupil()
    {
        System.out.println(rollNo+ " "+ coll);
    }
}
public class javaStaticVariable {
    public static void main(String arg[])
    {
         Pupil p1 = new Pupil(15);
         Pupil p2 = new Pupil(18);

         p1.printPupil();
         p2.printPupil();
    }
}
