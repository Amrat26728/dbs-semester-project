/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBSProject;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        setSize(1200,700);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        loginpanel = new javax.swing.JPanel();
        loginbtn = new javax.swing.JButton();
        password = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        passwordtf = new javax.swing.JPasswordField();
        rollnotf = new javax.swing.JTextField();
        viewpasswordlogin = new javax.swing.JLabel();
        signuppanel = new javax.swing.JPanel();
        namesignup = new javax.swing.JLabel();
        passwordsignup = new javax.swing.JLabel();
        nametfsignup = new javax.swing.JTextField();
        passwordtfsignup = new javax.swing.JPasswordField();
        rollnotfsignup = new javax.swing.JTextField();
        signupbtn = new javax.swing.JButton();
        rollnosignup = new javax.swing.JLabel();
        viewpasswordsignup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(6, 6, 28, 24);

        panel.setBackground(new java.awt.Color(248, 245, 241));

        loginpanel.setBackground(new java.awt.Color(248, 245, 241));
        loginpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(153, 153, 153))); // NOI18N

        loginbtn.setBackground(new java.awt.Color(153, 204, 255));
        loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginbtn.setText("Sign In");
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password.setText("Password:");

        rollno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rollno.setText("Roll No:");

        rollnotf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rollnotfKeyPressed(evt);
            }
        });

        viewpasswordlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        viewpasswordlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                viewpasswordloginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rollnotf, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(passwordtf, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewpasswordlogin))
                    .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rollnotf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordtf, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(viewpasswordlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        signuppanel.setBackground(new java.awt.Color(248, 245, 241));
        signuppanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "SignUp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(153, 153, 153))); // NOI18N

        namesignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namesignup.setText(" Name:");

        passwordsignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordsignup.setText(" Password:");

        nametfsignup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nametfsignupKeyPressed(evt);
            }
        });

        rollnotfsignup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rollnotfsignupKeyPressed(evt);
            }
        });

        signupbtn.setBackground(new java.awt.Color(153, 204, 255));
        signupbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signupbtn.setText("SignUp");
        signupbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        rollnosignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rollnosignup.setText("Roll No:");

        viewpasswordsignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        viewpasswordsignup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                viewpasswordsignupKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout signuppanelLayout = new javax.swing.GroupLayout(signuppanel);
        signuppanel.setLayout(signuppanelLayout);
        signuppanelLayout.setHorizontalGroup(
            signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signuppanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rollnosignup, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(signuppanelLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(namesignup, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(signuppanelLayout.createSequentialGroup()
                                .addComponent(passwordsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nametfsignup, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rollnotfsignup, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordtfsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(signupbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewpasswordsignup)
                .addContainerGap())
        );
        signuppanelLayout.setVerticalGroup(
            signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signuppanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollnosignup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rollnotfsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namesignup, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametfsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordtfsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(viewpasswordsignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(signuppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signuppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
        );

        getContentPane().add(panel);
        panel.setBounds(0, 0, 1190, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        
        new MainFrame().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_backMouseClicked

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        
        String RollNo = rollnotfsignup.getText();
        String Name = nametfsignup.getText();
        char[] pass = passwordtfsignup.getPassword();
        String Password = String.valueOf(pass);
        boolean check = true;
        
        if(RollNo.isEmpty() || Name.isEmpty() || Password.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Something is wrong while getting data!", null, JOptionPane.ERROR_MESSAGE);
        }
        
        else
        {
            try{
              Connection con = new DBConnection().getConnection();
              Statement s = con.createStatement();
              ResultSet rs = s.executeQuery("select roll_no, password from signup_data");
              while(rs.next())
              {
                  String str = rs.getString(1);
                  if(RollNo.equals(str))
                  {
                      check = false;
                  }
              }

              if(check)
              {
                try{
                    s.executeQuery("insert into signup_data values('"+RollNo+"','"+Name+"','"+Password+"')");
                    s.executeQuery("commit");
                    JOptionPane.showMessageDialog(null, "Succesfully Registered!", null, JOptionPane.INFORMATION_MESSAGE);
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e, null, JOptionPane.ERROR_MESSAGE);
                }
              }
              else
              {
                  JOptionPane.showMessageDialog(null, "Roll No is already registered!", null, JOptionPane.ERROR_MESSAGE);
              }
                con.close();
            }catch(SQLException e){

            }
        
        }
        
    }//GEN-LAST:event_signupbtnActionPerformed

    private void rollnotfsignupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollnotfsignupKeyPressed
        
        char ch = evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isDigit(ch) || Character.isISOControl(ch))
        {
            rollnotfsignup.setEditable(true);
        }
        
        else
        {
            rollnotfsignup.setEditable(false);
        }
        
    }//GEN-LAST:event_rollnotfsignupKeyPressed

    private void nametfsignupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametfsignupKeyPressed
        
        char ch = evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isISOControl(ch))
        {
            nametfsignup.setEditable(true);
        }
        
        else
        {
            nametfsignup.setEditable(false);
        }
        
    }//GEN-LAST:event_nametfsignupKeyPressed

    private void rollnotfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollnotfKeyPressed
        
        char ch = evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isDigit(ch) || Character.isISOControl(ch))
        {
            rollnotf.setEditable(true);
        }
        
        else
        {
            rollnotf.setEditable(false);
        }
        
    }//GEN-LAST:event_rollnotfKeyPressed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        
        String RollNo = rollnotf.getText();
        char[] ch = passwordtf.getPassword();
        String pass = String.valueOf(ch);
        boolean check = false;
        boolean check2 = true;
        String print = "Your roll no is not registered please signup first!";
        
        if(RollNo.isEmpty() || pass.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Something is wrong while getting data!", null, JOptionPane.ERROR_MESSAGE);
        }
        
        else
        {
            try{
                Connection con = new DBConnection().getConnection();
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery("Select roll_no, password from signup_data");
                while(rs.next())
                {
                    String str = rs.getString("roll_no");
                    if(RollNo.equals(str))
                    {
                        String str2 = rs.getString("password");
                        if(pass.equals(str2))
                        {
                            check = true;
                        }
                        else
                        {
                            print = "Password is incorrect!";
                        }
                    }
                }

                if(check)
                {
                    new UserFrame().setVisible(true);
                    this.dispose();
                }

                else
                {
                    JOptionPane.showMessageDialog(null, print, null, JOptionPane.ERROR_MESSAGE);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void viewpasswordloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_viewpasswordloginKeyPressed
        
        
        
    }//GEN-LAST:event_viewpasswordloginKeyPressed

    private void viewpasswordsignupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_viewpasswordsignupKeyPressed
        
        
        
    }//GEN-LAST:event_viewpasswordsignupKeyPressed

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
    private javax.swing.JLabel back;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JLabel namesignup;
    private javax.swing.JTextField nametfsignup;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel password;
    private javax.swing.JLabel passwordsignup;
    private javax.swing.JPasswordField passwordtf;
    private javax.swing.JPasswordField passwordtfsignup;
    private javax.swing.JLabel rollno;
    private javax.swing.JLabel rollnosignup;
    private javax.swing.JTextField rollnotf;
    private javax.swing.JTextField rollnotfsignup;
    private javax.swing.JButton signupbtn;
    private javax.swing.JPanel signuppanel;
    private javax.swing.JLabel viewpasswordlogin;
    private javax.swing.JLabel viewpasswordsignup;
    // End of variables declaration//GEN-END:variables
}
