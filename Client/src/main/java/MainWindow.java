
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Γεώργιος Ζάχος (ΑΜ:321/2021020)
 */

//Κλάση για την αναπαράσταση του αρχικού μενού απο την μεριά του Client.
public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("WEB PHONE CATALOG");

        jLabel2.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Select Action");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Insert New Contact:");

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Search Contact:");

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jButton3.setText("Disconect");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton3)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Λογική για την αναζήτηση μιας επαφής.
        try{
            Socket sock = new Socket("localhost" , 5555); //Σύνδεση στον server.
            String input;
            //Δημιουργεία ροών για την ανταλλαγή μηνυμάτων σε μορφή αντικειμένων μεταξύ του Server και του client.
            ObjectOutputStream outstream = new ObjectOutputStream(sock.getOutputStream());
            ObjectInputStream instream = new ObjectInputStream(sock.getInputStream());
            
            outstream.writeUTF("START"); //Αποστολή του εναρκτήριου μηνύματος.
            outstream.flush();
            input = instream.readUTF();
            //Αν ο Server απαντήσει με waiting τότε ξεκινάει η αναζήτηση.
            if(input.equals("WAITING"))
            {
                outstream.writeUTF("REQUEST_SEARCH");//Αποστολή εναρκτήριου μηνύματος αναζήτησης στον server.
                outstream.flush();
                
                //Εμφάνηση απλής φόρμας για την εισαγωγή επιθέτου για αναζήτηση.
                String surname = JOptionPane.showInputDialog(this, "Enter surname of the contact", "Search Contact", JOptionPane.PLAIN_MESSAGE);

                if (surname == null) 
                {
                    return;
                }
                
                //Αποστολή του επιθέτου προς αναζήτηση.
                outstream.writeUTF(surname.toUpperCase());
                outstream.flush();
                
                //Ανάγνωση και εμφάνηση του αποτελέσματος της αναζήτησης.
                String in = instream.readUTF();
                JOptionPane.showMessageDialog(this, in, "Search Result", JOptionPane.INFORMATION_MESSAGE);
                
                //Ανάγνωση και εμφάνηση της κατάστασης του server.
                input = instream.readUTF();
                JOptionPane.showMessageDialog(this, input, "Server Response", JOptionPane.INFORMATION_MESSAGE);
                
                sock.close(); //Κλείσιμο της σύνδεσης.
            }
            else //Εμφάνηση μηνύματος για αποτυχία σε περίπτωση που δεν τιρηθεί το πρωτόκολλο.
            {
                JOptionPane.showMessageDialog(this, "Server busy try again later!", "Server Response", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Λογική για την εισαγωγή μιας νέας επαφής.
        try {
        //Παρόμοια βήματα με την αναζήτηση.
        Socket sock = new Socket("localhost" , 5555);
        ObjectOutputStream outstream = new ObjectOutputStream(sock.getOutputStream());
        ObjectInputStream instream = new ObjectInputStream(sock.getInputStream());
        
        outstream.writeUTF("START");
        outstream.flush();
        String input = instream.readUTF();
        
        if(input.equals("WAITING"))  // Αν ο server απαντήσει με waiting ξεκινάει η λογική εισαγωγής.
        {

            Contact contact = new Contact(); // Δημιουργεία ενός αντικειμένου επαφής για την εισαγωγή.
            
            outstream.writeUTF("REQUEST_INSERT"); // Αποστολή της πρόθεσης να δημιουργήσουμε νέα επαφή στον server.
            outstream.flush();
            
            //Εμφάνηση popup μηνυμάτων για την εισαγωγή των απαράιτητων στοιχείων μιας επαφής.
            String name = JOptionPane.showInputDialog(this, "Enter name:", "Insert Contact Info", JOptionPane.PLAIN_MESSAGE);
            String surname = JOptionPane.showInputDialog(this, "Enter surname:", "Insert Contact Info", JOptionPane.PLAIN_MESSAGE);
            String phoneNumber = JOptionPane.showInputDialog(this, "Enter phone number:", "Insert Contact Info", JOptionPane.PLAIN_MESSAGE);
            String address = JOptionPane.showInputDialog(this, "Enter address:", "Insert Contact Info", JOptionPane.PLAIN_MESSAGE);
            String profession = JOptionPane.showInputDialog(this, "Enter profession:", "Insert Contact Info", JOptionPane.PLAIN_MESSAGE);
            
            //Εισαγωγή όλων των στοιχείων που δώθηκαν από τον χρήστη, στο αντικέιμενο της επαφής που θα στείλουμε στον server.
            contact.setName(name);
            contact.setSurname(surname);
            contact.setNumber(phoneNumber);
            contact.setAddress(address);
            contact.setProffesion(profession);
            
            //Αποστολή του αντικειμένου επαφής στον server.
            outstream.writeObject(contact);
            outstream.flush();
            
            //Ανάγνωση του μηνύματος απάντησης του server και εμφάνησή του
            input = instream.readUTF(); 
            JOptionPane.showMessageDialog(this, input, "Server Response", JOptionPane.INFORMATION_MESSAGE);

            sock.close(); //Κλείσιμο σύνδεσης.
        }
        else //Εμφάνηση μηνύματος για αποτυχία σε περίπτωση που δεν τιρηθεί το πρωτόκολλο.
        {
            JOptionPane.showMessageDialog(this, "Server busy try again later!", "Server Response", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);// Κλείσιμο του client σε περίπτωση που επιλέξει το κουμπι disconect.
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
