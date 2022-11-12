/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.net.*;

/**
 *
 * @author PC
 */
public class demoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress myHost = InetAddress.getLocalHost();
            System.out.println("Host address: "+myHost.getHostAddress());
            System.out.println("Host name: "+myHost.getHostName());
            
            InetAddress []address = InetAddress.getAllByName("phimmoi.net");
            for (int i = 0; i < address.length; i++) {
                System.out.println("Address: "+(i+1)+":"+address[i]);
            }
        } catch (Exception e) {
        }
    }
    
}
