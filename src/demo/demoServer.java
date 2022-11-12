
package demo;

import java.net.*;

public class demoServer {


    public static void main(String[] args) {
        try {
            ServerSocket sv = new ServerSocket(2903);
            System.out.println("Doi ket noi....");
            sv.accept();
            System.out.println("Da ket noi....");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
