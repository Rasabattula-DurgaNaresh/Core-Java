package javabook.volumeone.demos;

public class DoubleLoopDemo {
    public static void main(String[] args)
    {
        for (double x = 0; x != 1.0; x += 0.1) { // indefinite loop
            System.out.println(x);
            /*if (x > 2) {
                break;
            }*/
        }
    }
}
/*
See the below output that before x gets bigger than 2. `x` jumps from `0.9999999999999999` to `1.0999999999999999`. It never equals to `1.0`.
0.0
0.1
0.2
0.30000000000000004
0.4
0.5
0.6
0.7
0.7999999999999999
0.8999999999999999
0.9999999999999999
1.0999999999999999
1.2
1.3
1.4000000000000001
1.5000000000000002
1.6000000000000003
1.7000000000000004
1.8000000000000005
1.9000000000000006
2.0000000000000004
*/
