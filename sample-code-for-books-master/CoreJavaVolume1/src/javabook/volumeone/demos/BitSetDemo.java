package javabook.volumeone.demos;
import java.util.BitSet;

public class BitSetDemo {
    public static void main(String args[]) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // set some bits
        for(int i = 0; i < 16; i++) {
            if((i % 2) == 0) bits1.set(i);
            if((i % 5) != 0) bits2.set(i);
        }

        System.out.println("Initial pattern in bits1: ");
        System.out.println(toBinaryString(bits1) + "," + bits1);
        System.out.println("Initial pattern in bits2: ");
        System.out.println(toBinaryString(bits2) + "," + bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("bits2 AND bits1: ");
        System.out.println(toBinaryString(bits2) + "," + bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("bits2 OR bits1: ");
        System.out.println(toBinaryString(bits2) + "," + bits2);

        // XOR bits
        bits2.xor(bits1);
        System.out.println("bits2 XOR bits1: ");
        System.out.println(toBinaryString(bits2) + "," + bits2);
    }
    
    private static String toBinaryString(BitSet bi) {
        StringBuilder sb = new StringBuilder();
        for( int i = 0; i <= bi.length();  i++ )
        {
            sb.append(bi.get(i) == true ? 1: 0 );
        }
        
        return sb.reverse().toString();
    }
}
