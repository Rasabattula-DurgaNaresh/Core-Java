package javabook.volumeone.demos;
import java.io.Console;

public class PasswordDemo {
    public static void main(String[] args)
    {
        Console cons = System.console();
        try {
            if (cons != null) {
                String username = cons.readLine("User name: ");
                // prints
                System.out.println("User name: " + username);
                // read password into the char array
                char[] pwd = cons.readPassword("Password: "); 
                // prints
                System.out.println("Password is: "+ String.valueOf(pwd));
            } 
        } catch(Exception ex) {
             ex.printStackTrace();
        }
    }
}
