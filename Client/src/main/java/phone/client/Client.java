/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package phone.client;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Γεώργιος Ζάχος (ΑΜ:321/2021020)
 */
public class Client {

    public static void main(String[] args) 
    {
        try 
        {
            Socket sock = new Socket("localhost" , 5555);
           
            ObjectOutputStream outstream = new ObjectOutputStream(sock.getOutputStream());
            ObjectInputStream instream = new ObjectInputStream(sock.getInputStream());
                
            System.out.println("Sending Messages to the Server...");
            System.out.println("Connecting to "+ sock.getInetAddress()+ " and port "+sock.getPort());
            System.out.println("Local Address :"+sock.getLocalAddress()+" Port :"+sock.getLocalPort());   
            
            Scanner scanner = new Scanner(System.in);
            String input;
            while(true) {
                outstream.writeUTF("START");
                outstream.flush();
                input = instream.readUTF();
                System.out.println("Server Says: " + input);
                System.out.println("Select function: ");
                System.out.println("1. Search contact");
                System.out.println("2. Create new contact");
                System.out.print(">");
                int option = scanner.nextInt();
                if(input.equals("WAITING")) 
                {
                    if(option == 1 ) 
                    {
                            outstream.writeUTF("REQUEST_SEARCH");
                            outstream.flush();
                            System.out.println("Insert surname of the search");
                            System.out.print(">");
                            String output = scanner.next();

                            outstream.writeUTF(output);
                            outstream.flush();

                            input = instream.readUTF();
                            System.out.println("Server says: " + input);
                            input = instream.readUTF();
                            System.out.println("Server says: " + input);
                    }
                    else if(option == 2) 
                    {
                        //TODO: implement later.
                    }
                }
                sock.close();
            }
            
            
        }
        catch(Exception ex) 
        {
            ex.printStackTrace();
        }
    }
}



