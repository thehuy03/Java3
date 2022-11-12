
package demo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class demoChat {

    
    public static void main(String[] args) {
        try {
            
            System.out.println("Server connecting ");
            Socket sk = new Socket("localhost",2903);
            System.out.println("Connected");
            
            
        } catch (Exception e) {
        }
    }
    
}
