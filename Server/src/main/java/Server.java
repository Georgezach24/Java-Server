/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 *
 * @author Γεώργιος Ζάχος (ΑΜ: 321/2021020)
 */
public class Server {
    
    private static HashMap<String, Contact> conts = new HashMap<>();
    
    public static void main(String[] args) {
        conts.put("GEORGIOU", new Contact("GEORGE","GEORGIOU","21034556"));
        try 
        {
            ServerSocket server = new ServerSocket(5555);
            
            while(true) 
            {
                System.out.println("Accepting Connection...");
                Socket connection = server.accept();
                ObjectInputStream instream = new ObjectInputStream(connection.getInputStream());
                ObjectOutputStream outstream = new ObjectOutputStream(connection.getOutputStream());
                
                String input = instream.readUTF();
                
                if(input.equals("START")) 
                {
                    String msg = "WAITING";
                    outstream.writeUTF(msg);
                    outstream.flush();
                    
                    input = instream.readUTF();
                    if(input.equals("REQUEST_SEARCH")) 
                    {
                        String surname = instream.readUTF();

                        if(conts.containsKey(surname)) 
                        {
                            Contact contact = conts.get(surname);
                            outstream.writeUTF(contact.toString());
                            outstream.flush();
                        }
                        else 
                        {
                            outstream.writeUTF("NORECORD");
                            outstream.flush();
                        }
                            
                        outstream.writeUTF("OK");
                        outstream.flush();
                    }
                    if(input.equals("REQUEST_INSERT"))
                    {
                        try{
                            Contact cont = (Contact) instream.readObject();

                            conts.put(cont.getSurname(), cont);

                            outstream.writeUTF("OK");
                            outstream.flush();
                            System.out.println(conts);
                        }
                        catch(ClassNotFoundException ex)
                        {
                            ex.printStackTrace();
                        }
                    }


                       

                }    
               connection.close(); 
                
            }
        }
        catch(Exception ex) 
        {
            ex.printStackTrace();
        }
    }
}
