/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandreg;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author OmarKandeel
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Left = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lefttt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jXHyperlink1 = new org.jdesktop.swingx.JXHyperlink();
        Password = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        Bar = new javax.swing.JProgressBar();
        mess = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setPreferredSize(new java.awt.Dimension(800, 500));
        Left.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/LOGO.Trial 2.png"))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("© 2024 EasyPay All rights reserved. ");

        jLabel7.setFont(new java.awt.Font("Mistral", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EasyPay");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(136, 136, 136))
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel6)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(134, 134, 134))
        );

        Left.add(Right);
        Right.setBounds(0, 0, 410, 570);

        lefttt.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("SIGN UP");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("First Name");

        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Last Name");

        Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Password");

        jLabel4.setText("Already have an account? ");

        jXHyperlink1.setForeground(new java.awt.Color(0, 102, 102));
        jXHyperlink1.setText("Log In");
        jXHyperlink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXHyperlink1ActionPerformed(evt);
            }
        });

        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("X");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        Bar.setBackground(new java.awt.Color(255, 255, 255));
        Bar.setForeground(new java.awt.Color(0, 102, 102));

        kButton2.setForeground(new java.awt.Color(204, 102, 0));
        kButton2.setText("Next");
        kButton2.setActionCommand("Next");
        kButton2.setkBackGroundColor(new java.awt.Color(255, 102, 102));
        kButton2.setkBorderRadius(25);
        kButton2.setkEndColor(new java.awt.Color(255, 255, 51));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 102, 102));
        kButton2.setkStartColor(new java.awt.Color(0, 102, 102));
        kButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton2MouseClicked(evt);
            }
        });
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftttLayout = new javax.swing.GroupLayout(lefttt);
        lefttt.setLayout(leftttLayout);
        leftttLayout.setHorizontalGroup(
            leftttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftttLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(leftttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftttLayout.createSequentialGroup()
                        .addGroup(leftttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(leftttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(leftttLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(72, 72, 72))
                                .addGroup(leftttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftttLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jXHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Lname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(leftttLayout.createSequentialGroup()
                        .addGroup(leftttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mess, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        leftttLayout.setVerticalGroup(
            leftttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftttLayout.createSequentialGroup()
                .addGroup(leftttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftttLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addGroup(leftttLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mess, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(leftttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jXHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        Left.add(lefttt);
        lefttt.setBounds(410, -30, 390, 600);

        getContentPane().add(Left);
        Left.setBounds(0, 0, 800, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_PasswordActionPerformed

    private void jXHyperlink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXHyperlink1ActionPerformed
        // TODO add your handling code here:  Login LoginFrame = new Login();
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
      
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jXHyperlink1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked

    }//GEN-LAST:event_PasswordMouseClicked

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
           String pass =Password.getText();
            
            if(!PatternChecker.MatchPattern8Num(pass))
            {
//                nums.setBackground(new java.awt.Color(204, 0, 0));
                 mess.setText("password must contain 8 numbers");
            }
            else
            {
                mess.setText(" ");
                Bar.setValue(34);
            }
            if(!PatternChecker.MatchPatternchars(pass))
            {
                mess.setText("password must contain 2 upper case chars and 2 lower case chars");
            }
            else
            {
            mess.setText(" ");
            Bar.setValue(68);
            }
            if(!PatternChecker.MatchPatternSchars(pass))
            {
                mess.setText("password must contain 1 special char");
            }
            else
            {
            mess.setText("password accepted");
            Bar.setValue(100);
            Bar.setBackground(Color.green);
            }
            
            if(pass.isEmpty())
            {
                Bar.setValue(0);
            }
            //nums.repaint();
    }//GEN-LAST:event_PasswordKeyTyped

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
        // TODO add your handling code here:
            String pass =Email.getText();
            if(!PatternChecker.MatchPattern8Num(pass))
            {
                //nums.setBackground(new java.awt.Color(204, 0, 0));
            }
            else 
            {
                //nums.setBackground(new java.awt.Color(102,255,102));
            }
             //nums.repaint();
    }//GEN-LAST:event_EmailKeyTyped

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
          SignUp2 SignUp2Frame = new SignUp2();
        SignUp2Frame.setVisible(true);
        SignUp2Frame.pack();
        SignUp2Frame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void kButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton2MouseClicked
        // TODO add your handling code here:
        String fname=Fname.getText();
        String lname=Lname.getText();
        String email=Email.getText();
        String pass =Password.getText();
        if(fname.isEmpty()||lname.isEmpty()||email.isEmpty()||pass.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"please enter the required fields");
        }
        else
        {
            if(fname.length()<4||lname.length()<4)
            {
                JOptionPane.showMessageDialog(this,"Name is too short");
            }
            else
            {
                StringTokenizer token =new StringTokenizer(email,"@");
                String username=new String();
                String domain = new String();
                if(token.hasMoreTokens())
                {
                    username=(String)token.nextElement();//user ie before @
                }
                while(token.hasMoreTokens())
                {
                    domain = token.nextToken();//@gmail????
                }
                StringTokenizer token2=new StringTokenizer(domain,".");
                if(token2.hasMoreTokens())
                {
                    domain=token2.nextToken();
                }

                /*************************/

                domain=domain.toLowerCase();

                if(!domain.equals("gmail"))
                {
                    JOptionPane.showMessageDialog(this,"we accept gmail only");
                }
                else
                {

                    String newCardNumber =new String();
                    String maxStr="0";
                    String newCardNumber2=new String();

                    try
                    {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDatabase", "root", "123456");
                        Statement stmt = con.createStatement();
                        String sqlCommand ="SELECT MAX(national_id) as e FROM customers;";
                        PreparedStatement pstmt = con.prepareStatement(sqlCommand);
                        ResultSet rs2 = pstmt.executeQuery();

                        try
                        {
                            if (rs2.next()) {
                                // Fetch the value from ResultSet
                                String nationalId = rs2.getString("e");
                                System.out.println("Retrieved national_id: " + nationalId); // Log the retrieved value

                                // Check if nationalId is not null and not empty
                                maxStr = nationalId.substring(1);
                            }
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(this,"first");
                            JOptionPane.showMessageDialog(this,e);
                        }
                        finally
                        {
                            newCardNumber = (Integer.toString(Integer.parseInt(maxStr) + 1));
                            System.out.println("new national_id: " + newCardNumber);
                        }

                        // Close the ResultSet, Statement, and Connection
                    }
                    catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(this,e);
                    }

                    /********************************/

                    try
                    {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDatabase", "root", "123456");
                        Statement stmt = con.createStatement();
                        String sqlCommand = "INSERT INTO customers(Fname, lname, email, national_id,mobile_no,Address,date_birth) VALUES(?,?,?,?,?,?,?);"; // Replace "your_table_name" with the actual table name
                        PreparedStatement pstmt = con.prepareStatement(sqlCommand);

                        pstmt.setString(1, Fname.getText());
                        pstmt.setString(2, Lname.getText());
                        pstmt.setString(3, username);
                        pstmt.setString(4,newCardNumber);
                        pstmt.setString(5,Integer.toString(01022473));
                        pstmt.setString(6,Integer.toString(0));
                        String dateOfBirth = "2002-06-25";
                        java.sql.Date sqlDate = java.sql.Date.valueOf(dateOfBirth);
                        pstmt.setDate(7, sqlDate);
                        int rs = pstmt.executeUpdate();
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(this,"second");
                        JOptionPane.showMessageDialog(this,e);

                    }

                    try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDatabase", "root", "123456");
                        Statement stmt = con.createStatement();
                        String sqlCommand = "SELECT MAX(card_number) as e FROM account;";
                        PreparedStatement pstmt = con.prepareStatement(sqlCommand);
                        maxStr=new String();
                        pstmt = con.prepareStatement(sqlCommand);
                        ResultSet rs2 = pstmt.executeQuery();

                        if (rs2.next()) {
                            // Fetch the value from ResultSet
                            maxStr = rs2.getString("e"); // Ensure the column name is quoted properly

                            // Log the retrieved value for debugging
                            System.out.println("Retrieved max card number: " + maxStr);

                            // Check if maxStr is not null
                            if (maxStr != null && !maxStr.isEmpty()) {
                                // Invoke substring method on maxStr
                                maxStr = maxStr.substring(1);
                                // Further operations with the substring...
                            } else {
                                // Handle the case where maxStr is null or empty
                                maxStr = "0";
                            }
                        }

                        // Increment the maximum card number and construct the new card number
                        newCardNumber2 = "C" + (Integer.parseInt(maxStr) + 1);

                    } catch (Exception e) {
                        // Log any exceptions for debugging
                        JOptionPane.showMessageDialog(this, "third" );
                        JOptionPane.showMessageDialog(this, "Error occurred: " + e.getMessage());
                        e.printStackTrace();
                    }

                    // Increment the maximum card number and construct the new card number
                    newCardNumber2 = ("C"+Integer.toString(Integer.parseInt(maxStr) + 1));

                    /********************************/

                    try {
                        // Establish database connection
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDatabase", "root", "123456");

                        // Prepare INSERT statement
                        String sqlCommand = "INSERT INTO account (card_number, acc_pass, national_no, balance, acc_category, exipre_date, cvv, atm_pin) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement pstmt = con.prepareStatement(sqlCommand);

                        // Set parameter values
                        pstmt.setString(1, newCardNumber2);
                        pstmt.setString(2, pass);
                        pstmt.setString(3, newCardNumber);
                        pstmt.setInt(4, 0); // Assuming balance is an integer column
                        pstmt.setString(5, "s");
                        java.sql.Date sqlDate = java.sql.Date.valueOf("2002-06-25");
                        pstmt.setDate(6, sqlDate);
                        pstmt.setString(7, "0");
                        pstmt.setString(8, "000000");

                        // Execute the statement
                        int rowsAffected = pstmt.executeUpdate();

                        // Close resources
                        pstmt.close();
                        con.close();

                        // Dispose current frame and open new frame
                        this.dispose();
                        SignUp2 SignUp2Frame = new SignUp2();
                        SignUp2Frame.setVisible(true);
                        SignUp2Frame.pack();
                        SignUp2Frame.setLocationRelativeTo(null);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Error occurred: " + e.getMessage());
                        e.printStackTrace();
                    }

                }
            }
        }
    }//GEN-LAST:event_kButton2MouseClicked

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Bar;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Fname;
    private javax.swing.JPanel Left;
    private javax.swing.JTextField Lname;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.jdesktop.swingx.JXHyperlink jXHyperlink1;
    private com.k33ptoo.components.KButton kButton2;
    private javax.swing.JPanel lefttt;
    private javax.swing.JLabel mess;
    // End of variables declaration//GEN-END:variables
}
