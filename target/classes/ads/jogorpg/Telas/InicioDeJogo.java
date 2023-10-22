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
public class InicioDeJogo extends javax.swing.JFrame {

    /**
     * Creates new form InicioDeJogo
     */
    public InicioDeJogo() {
        initComponents();
        DbMongoDB mongo = new DbMongoDB();
        Document doc = 
        mongo.MongoGetDBcollection("Jogo", "LoggedUser");
        
        Doc D = new Doc();
        User U1 = D.DocToUser(doc);
        DbSQL SQL = new DbSQL();
        List <Personagens> ListaPersonagens = SQL.sqlDbPersonagensSelect(U1);
        
        for (int i = 0; i < ListaPersonagens.size(); i++) {
            SelectPersonagem.addItem(ListaPersonagens.get(i).getName() +" -- "+ ListaPersonagens.get(i).getClasse());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu1 = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        BT_Joar = new javax.swing.JButton();
        SelectPersonagem = new javax.swing.JComboBox<>();
        LabelClasse = new javax.swing.JLabel();
        Classe = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelVida = new javax.swing.JLabel();
        LabelStamina = new javax.swing.JLabel();
        Stamina = new javax.swing.JLabel();
        Vida = new javax.swing.JLabel();
        labelForça = new javax.swing.JLabel();
        Forca = new javax.swing.JLabel();
        LabelMagia = new javax.swing.JLabel();
        Magia = new javax.swing.JLabel();
        LabelDefesa = new javax.swing.JLabel();
        Defesa = new javax.swing.JLabel();
        LabelCritico = new javax.swing.JLabel();
        Critico = new javax.swing.JLabel();
        Atributos = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu1.setBackground(new java.awt.Color(204, 204, 204));
        Menu1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Menu1.setForeground(new java.awt.Color(0, 0, 0));
        Menu1.setText("Confirmar");
        Menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu1ActionPerformed(evt);
            }
        });
        getContentPane().add(Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 130, 30));

        Menu.setBackground(new java.awt.Color(204, 204, 204));
        Menu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Menu.setForeground(new java.awt.Color(0, 0, 0));
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 120, 40));

        BT_Joar.setBackground(new java.awt.Color(204, 204, 204));
        BT_Joar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BT_Joar.setForeground(new java.awt.Color(0, 0, 0));
        BT_Joar.setText("Jogar");
        BT_Joar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_JoarActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Joar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 200, 40));

        SelectPersonagem.setBackground(new java.awt.Color(208, 208, 208));
        SelectPersonagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        SelectPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectPersonagemActionPerformed(evt);
            }
        });
        getContentPane().add(SelectPersonagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 240, 30));

        LabelClasse.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelClasse.setForeground(new java.awt.Color(255, 255, 255));
        LabelClasse.setText("Classe:");
        getContentPane().add(LabelClasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, -1, -1));

        Classe.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Classe.setForeground(new java.awt.Color(255, 255, 255));
        Classe.setText("Classe");
        getContentPane().add(Classe, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, 120, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecione o Personagem ");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ads/jogorpg/icon/Moldura_Inicial1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 580, 700));

        LabelVida.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelVida.setForeground(new java.awt.Color(255, 255, 255));
        LabelVida.setText("Vida:");
        getContentPane().add(LabelVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, -1, -1));

        LabelStamina.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelStamina.setForeground(new java.awt.Color(255, 255, 255));
        LabelStamina.setText("Stamina:");
        getContentPane().add(LabelStamina, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, -1, -1));

        Stamina.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Stamina.setForeground(new java.awt.Color(255, 255, 255));
        Stamina.setText("Stamina");
        getContentPane().add(Stamina, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 260, 120, -1));

        Vida.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Vida.setForeground(new java.awt.Color(255, 255, 255));
        Vida.setText("Vida");
        getContentPane().add(Vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, 120, -1));

        labelForça.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelForça.setForeground(new java.awt.Color(255, 255, 255));
        labelForça.setText("Força:");
        getContentPane().add(labelForça, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, -1, -1));

        Forca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Forca.setForeground(new java.awt.Color(255, 255, 255));
        Forca.setText("Força");
        getContentPane().add(Forca, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 300, 120, -1));

        LabelMagia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelMagia.setForeground(new java.awt.Color(255, 255, 255));
        LabelMagia.setText("Magia:");
        getContentPane().add(LabelMagia, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, -1, -1));

        Magia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Magia.setForeground(new java.awt.Color(255, 255, 255));
        Magia.setText("Magia");
        getContentPane().add(Magia, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, 130, -1));

        LabelDefesa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelDefesa.setForeground(new java.awt.Color(255, 255, 255));
        LabelDefesa.setText("Defesa:");
        getContentPane().add(LabelDefesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, -1, -1));

        Defesa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Defesa.setForeground(new java.awt.Color(255, 255, 255));
        Defesa.setText("Defesa");
        getContentPane().add(Defesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 380, 120, -1));

        LabelCritico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelCritico.setForeground(new java.awt.Color(255, 255, 255));
        LabelCritico.setText("Critico:");
        getContentPane().add(LabelCritico, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, -1, -1));

        Critico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Critico.setForeground(new java.awt.Color(255, 255, 255));
        Critico.setText("Critico");
        getContentPane().add(Critico, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 420, 120, -1));

        Atributos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ads/jogorpg/icon/moldura_maior.png"))); // NOI18N
        getContentPane().add(Atributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 390, 460));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ads/jogorpg/icon/FundoMenu.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TelaPrincipal p1 = new TelaPrincipal();
        p1.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

    private void BT_JoarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_JoarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_JoarActionPerformed

    private void Menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu1ActionPerformed
        // TODO add your handling code here:
        DbMongoDB mongo = new DbMongoDB();
        mongo.MongoDropCollection("Jogo", "SelectedPersonagem");
        Document doc = 
        mongo.MongoGetDBcollection("Jogo", "LoggedUser");
        
        Doc D = new Doc();
        User U1 = D.DocToUser(doc);
        DbSQL SQL = new DbSQL();
        List <Personagens> ListaPersonagens = SQL.sqlDbPersonagensSelect(U1);
        
        mongo.MongoInsertDB("Jogo", "SelectedPersonagem", D.DocPersonagem(ListaPersonagens.get(SelectPersonagem.getSelectedIndex()-1)));
    }//GEN-LAST:event_Menu1ActionPerformed

    private void SelectPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectPersonagemActionPerformed
        // TODO add your handling code here:
        DbMongoDB mongo = new DbMongoDB();
        Document doc = 
        mongo.MongoGetDBcollection("Jogo", "LoggedUser");
        
        Doc D = new Doc();
        User U1 = D.DocToUser(doc);
        DbSQL SQL = new DbSQL();
        List <Personagens> ListaPersonagens = SQL.sqlDbPersonagensSelect(U1);
        
        
        Classe.setText(String.valueOf(ListaPersonagens.get(SelectPersonagem.getSelectedIndex()-1).getClasse()));
        Vida.setText(String.valueOf(ListaPersonagens.get(SelectPersonagem.getSelectedIndex()-1).getVidaMax()));
        Stamina.setText(String.valueOf(ListaPersonagens.get(SelectPersonagem.getSelectedIndex()-1).getStaminaMax()));
        Forca.setText(String.valueOf(ListaPersonagens.get(SelectPersonagem.getSelectedIndex()-1).getStregth()));
        Magia.setText(String.valueOf(ListaPersonagens.get(SelectPersonagem.getSelectedIndex()-1).getMagic()));
        Defesa.setText(String.valueOf(ListaPersonagens.get(SelectPersonagem.getSelectedIndex()-1).getDefense()));
        Critico.setText(String.valueOf(ListaPersonagens.get(SelectPersonagem.getSelectedIndex()-1).getCritical()));
    }//GEN-LAST:event_SelectPersonagemActionPerformed

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
            java.util.logging.Logger.getLogger(InicioDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDeJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atributos;
    private javax.swing.JButton BT_Joar;
    private javax.swing.JLabel Classe;
    private javax.swing.JLabel Critico;
    private javax.swing.JLabel Defesa;
    private javax.swing.JLabel Forca;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel LabelClasse;
    private javax.swing.JLabel LabelCritico;
    private javax.swing.JLabel LabelDefesa;
    private javax.swing.JLabel LabelMagia;
    private javax.swing.JLabel LabelStamina;
    private javax.swing.JLabel LabelVida;
    private javax.swing.JLabel Magia;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Menu1;
    private javax.swing.JComboBox<String> SelectPersonagem;
    private javax.swing.JLabel Stamina;
    private javax.swing.JLabel Vida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelForça;
    // End of variables declaration//GEN-END:variables
}
