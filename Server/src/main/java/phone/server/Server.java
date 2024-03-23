/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package phone.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 *
 * @author Γεώργιος Ζάχος (ΑΜ: 321/2021020)
 */
public class Server {
    
    public static void main(String[] args) {
        
        try
        {
            ServerSocket server = new ServerSocket(5555);
            
            while(true)
            {
                System.out.println("Accepting Connection...");
                System.out.println("Local Address :"+server.getInetAddress()+" Port :"+server.getLocalPort());
                Socket connection = server.accept();
                BufferedReader instream = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                BufferedWriter outstream = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
                
                Contact cont;
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
