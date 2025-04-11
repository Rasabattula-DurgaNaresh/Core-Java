package javabook.volumeone.demos;

public class LabelDemo {
    public static void main(String[] args)
    {
        System.out.println("Before the Label... ");
        int num = 1;
        label: 
        {
            System.out.println(String.format("In the block, num = %d", num));
            if(num < 5) {
                System.out.println("Exists the block...");
                break label; //exitsblock ...
            }
        }
        // jumps here when the break statement executes
        System.out.println("After Lable... ");
    }
}
