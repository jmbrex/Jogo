/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ads.jogorpg.Telas;

import ads.jogorpg.DataBase.DbMongoDB;
import ads.jogorpg.DataBase.DbSQL;
import ads.jogorpg.DataBase.Doc;
import ads.jogorpg.Player.Personagens;
import ads.jogorpg.User.User;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author João Marcelo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        DbMongoDB mongo = new DbMongoDB();
        Document doc = 
        mongo.MongoGetDBcollection("Jogo", "LoggedUser");
        Nome.setText((String)doc.get("NickName"));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_Joar = new javax.swing.JButton();
        BT_CriarPersonagem = new javax.swing.JButton();
        WellCome = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_Joar.setBackground(new java.awt.Color(204, 204, 204));
        BT_Joar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BT_Joar.setForeground(new java.awt.Color(0, 0, 0));
        BT_Joar.setText("Jogar");
        BT_Joar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_JoarActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Joar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 200, 40));

        BT_CriarPersonagem.setBackground(new java.awt.Color(204, 204, 204));
        BT_CriarPersonagem.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BT_CriarPersonagem.setForeground(new java.awt.Color(0, 0, 0));
        BT_CriarPersonagem.setText("Criar Personagem");
        BT_CriarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CriarPersonagemActionPerformed(evt);
            }
        });
        getContentPane().add(BT_CriarPersonagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 200, 40));

        WellCome.setFont(new java.awt.Font("Arial", 2, 30)); // NOI18N
        WellCome.setForeground(new java.awt.Color(255, 255, 255));
        WellCome.setText("Bem Vind@!");
        getContentPane().add(WellCome, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 190, 50));

        Nome.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        Nome.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 250, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ads/jogorpg/icon/Moldura_Inicial1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 580, 700));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ads/jogorpg/icon/FundoMenu.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_CriarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CriarPersonagemActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CriarPersonagem T1 = new CriarPersonagem();
        T1.setVisible(true);
    }//GEN-LAST:event_BT_CriarPersonagemActionPerformed

    private void BT_JoarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_JoarActionPerformed
        // TODO add your handling code here:
        InicioDeJogo jogoInit = new InicioDeJogo();
        jogoInit.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BT_JoarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_CriarPersonagem;
    private javax.swing.JButton BT_Joar;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel WellCome;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
