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
//Κλάση που υλοποιεί τον server.
public class Server {
    //Δημιουργεία μιας δομής HashMap για την αποθήκευση των επαφών με κλειδί αναζήτησης το επίθετο και δεδομένα όλη την επαφή. 
    private static HashMap<String, Contact> conts = new HashMap<>(); 
    
    public static void main(String[] args) {
        try 
        {
            //Δημιουργεία ενός server socket για την σύνδεση.
            ServerSocket server = new ServerSocket(5555);
            
            //Εκκίνηση βασικής λούπας του server.
            while(true) 
            {
                //Εμφάνηση μηνύματος εκκίνησης και δημιουργεία μιας σύνδεσης.
                System.out.println("Accepting Connection...");
                Socket connection = server.accept();
                
                //Δημιουργεία ObjectReader και writer για την ανταλλαγή αντικειμένων με τον client.
                ObjectInputStream instream = new ObjectInputStream(connection.getInputStream());
                ObjectOutputStream outstream = new ObjectOutputStream(connection.getOutputStream());
                
                String input = instream.readUTF(); //Διάβασμα του μηνύματος που έρχεται από έναν client.
                
                //Αν ο server δεχθεί από έναν client το μήνυμα START ξεκινάει την λειτουργεία του.
                if(input.equals("START")) 
                {
                    //Απαντάει στον server με το μήνυμα WAITING.
                    String msg = "WAITING";
                    outstream.writeUTF(msg);
                    outstream.flush();
                    
                    input = instream.readUTF();//Διάβασμα του επόμενου μηνύματος που έρχεται από τον client.
                    
                    //Αν το μήνυμα είναι για αναζήτηση επαφής.
                    if(input.equals("REQUEST_SEARCH")) 
                    {
                        String surname = instream.readUTF();//Ανάγνωση του επιθέτου βάση του οποίου γίνεται η αναζήτηση.
                        
                        //Αν το επίθετο υπάρχει στέλνουμε στον client το περιεχόμενο της επαφής
                        if(conts.containsKey(surname.toUpperCase())) 
                        {
                            Contact contact = conts.get(surname.toUpperCase());
                            outstream.writeObject(contact.toString());
                            outstream.flush();
                        }
                        //Αν δεν υπάρχει στένουμε το μήνυμα norecord.
                        else 
                        {
                            outstream.writeUTF("NORECORD");
                            outstream.flush();
                        }
                        
                        //Αν όλα πήγαν καλά στέλνεται και το μήνυμα OK.
                        outstream.writeUTF("OK");
                        outstream.flush();
                    }
                    //Αν το μήνυμα είναι για εισαγωγή νέας επαφής.
                    if(input.equals("REQUEST_INSERT"))
                    {
                        try{
                            //Δημιουργεία αντικειμένου επαφής και ανάγνωση της επαφής πρός αναζήτηση.
                            Contact cont = (Contact) instream.readObject();
                            
                            //Τοποθέτηση της επαφής στο HashMap με βάση το επίθετο.
                            conts.put(cont.getSurname().toUpperCase(), cont);
                            
                            //Αποστολή του μηνύματος ΟΚ.
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
