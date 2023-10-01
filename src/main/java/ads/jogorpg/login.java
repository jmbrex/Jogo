/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ads.jogorpg;

import ads.jogorpg.DataBase.DbMongoDB;
import ads.jogorpg.DataBase.DbSQL;
import ads.jogorpg.DataBase.Doc;
import ads.jogorpg.Telas.TelaPrincipal;
import ads.jogorpg.User.User;
import javax.swing.JOptionPane;
/**
 *
 * @author João Marcelo
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public login() {
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

        TxtUser = new javax.swing.JTextField();
        TXTPassWord = new javax.swing.JPasswordField();
        BT_CriarConta = new javax.swing.JButton();
        BT_Login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtUser.setBackground(new java.awt.Color(204, 204, 204));
        TxtUser.setForeground(new java.awt.Color(0, 0, 0));
        TxtUser.setText("  Usuario");
        getContentPane().add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 170, 30));

        TXTPassWord.setBackground(new java.awt.Color(204, 204, 204));
        TXTPassWord.setForeground(new java.awt.Color(0, 0, 0));
        TXTPassWord.setText("aaaa");
        TXTPassWord.setToolTipText("");
        getContentPane().add(TXTPassWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 329, 170, 30));

        BT_CriarConta.setBackground(new java.awt.Color(204, 204, 204));
        BT_CriarConta.setForeground(new java.awt.Color(0, 0, 0));
        BT_CriarConta.setText("Criar Conta");
        BT_CriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CriarContaActionPerformed(evt);
            }
        });
        getContentPane().add(BT_CriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 120, -1));

        BT_Login.setBackground(new java.awt.Color(204, 255, 204));
        BT_Login.setForeground(new java.awt.Color(0, 0, 0));
        BT_Login.setText("Login");
        BT_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("..\\moldurahori-PhotoRoom.png-PhotoRoom.png"));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("..\\fundo.png"));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_CriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CriarContaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Cadastro telaCad = new Cadastro();
        telaCad.setVisible(true);
    }//GEN-LAST:event_BT_CriarContaActionPerformed

    private void BT_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_LoginActionPerformed
        // TODO add your handling code here:
        DbSQL SQL = new DbSQL();
        //Pegando user no SQL
        User p1 = SQL.sqlUserSelectNickName(TxtUser.getText());
        //Conectando com Mongo -- Salvar usuario Logado
        DbMongoDB mongo = new DbMongoDB();
        Doc doc = new Doc();
        
        
        if(TXTPassWord.getText().equals(p1.getPassWord())){
            mongo.MongoDropCollection("Jogo", "LogedUser");
            mongo.MongoInsertDB("Jogo", "LogedUser", doc.UserToDoc(p1));
            this.dispose();
            TelaPrincipal T1 = new TelaPrincipal();
            T1.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha Incorretos");
        }
        
        
    }//GEN-LAST:event_BT_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_CriarConta;
    private javax.swing.JButton BT_Login;
    private javax.swing.JPasswordField TXTPassWord;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
