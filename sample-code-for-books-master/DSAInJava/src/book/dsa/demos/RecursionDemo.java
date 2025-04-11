package book.dsa.demos;

import java.util.Stack;

public class RecursionDemo {
    public static void main(String[] args) {
        int recursion = triangle(5);
        System.out.println(recursion);
        int stack = triangleStatck(5);
        System.out.println(stack);
    }
    
    static int triangle(int n) {
        if(n==1) {
            return 1;
        }
        else {
            return n + triangle(n-1);
        }
    }

    static int triangleStatck(int n) {
        if (n == 1) {
            return 1;
        }
        Stack<Integer> stack = new Stack<Integer>();
        while (n > 0) {
            stack.push(n);
            n--;
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
