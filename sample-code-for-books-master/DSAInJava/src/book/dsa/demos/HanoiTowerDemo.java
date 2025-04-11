package book.dsa.demos;

public class HanoiTowerDemo {
    static int nDisks = 3; // initial disks
    public static void main(String[] args) {
        doTowers(nDisks, 'A', 'B', 'C');
    }
    // suppose we have only three tower A(Source), B(Intermediate) and C(Destination)
    public static void doTowers(int topN, char from, char inter, char to) { 
        if(topN==1) {
            System.out.println("Disk 1 from " + from + " to "+ to); 
        }
        else {
            doTowers(topN-1, from, to, inter); // from-->inter
            System.out.println("Disk " + topN + " from " + from + " to "+ to); // move largest from -> to
            doTowers(topN-1, inter, from, to); // inter-->to
        } 
    }
}
