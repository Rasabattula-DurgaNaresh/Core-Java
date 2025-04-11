package javabook.volumeone.demos;

public class FinallyDemo {
    public static void main(String[] args)
    {
        int res = foo(2);
        System.out.println("res=" + res);    // res = 0
        int res2 = foo2(2);
        System.out.println("res2=" + res2);  // res2 = 4
        int res3 = foo3(2);
        System.out.println("res3=" + res3);  // res3 = 4
        int res4 = foo4(2);
        System.out.println("res4=" + res4);  // res3 = 4
    }

    public static int foo(int n) {
        try {
            int res = n * n;
            return res; 
        }
        finally {
            return 0; 
        }
    }

    public static int foo2(int n) {
        int res = 1;
        try {
            res = n * n;
        }
        finally {
            return res; 
        }
    }
    
    public static int foo3(int n) {
        int res = 1;
        try
        {
            try {
                res = n * n;
                res = n / 0;
                return res; 
            }
            finally {
                return res; // if return statement exists in finally, exception will be hidden.
            }
        }
        catch (Exception e) {
            //show error message
            System.out.println("exception occurs in foo3:" + e);  // no exception caught because of return in finally block.
        }
        return res; 
    }
    
    public static int foo4(int n) {
        int res = 1;
        try
        {
            try {
                res = n * n;
                res = n / 0;
                return res; 
            }
            finally {
                //return res; // if return statement exists in finally, exception will be hidden.
            }
        }
        catch (Exception e) {
            //show error message
            System.out.println("exception occurs in foo4:" + e);
        }
        return res; 
    }
}
