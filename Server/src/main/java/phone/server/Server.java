/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package phone.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 *
 * @author Γεώργιος Ζάχος (ΑΜ: 321/2021020)
 */
public class Server {
    
    private static HashMap<String,Contact> conts = new HashMap<String,Contact>();
    
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
                ObjectOutputStream outstream = new ObjectOutputStream(connection.getOutputStream());
                
                String input = instream.readLine();
                
                if(input.equals("START"))
                {
                    String msg;
                    msg = "WAITING";
                    outstream.writeObject(msg);
                    outstream.flush();
                    
                    if(input.equals("REQUEST_INSERT"))
                    {
                        //TODO: IMPLEMENT LATER
                    }
                    
                    if(input.equals("REQUEST_SEARCH"))
                    {
                        input = instream.readLine();
                        
                        if(conts.containsKey(input))
                        {
                            Contact contact = conts.get(input);
                            outstream.writeObject(contact);
                            outstream.flush();
                            outstream.writeObject("OK");
                            outstream.flush();
                        }
                        else
                        {
                            outstream.writeObject("NORECORD");
                            outstream.flush();
                        }
                        
                        
                    }
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
