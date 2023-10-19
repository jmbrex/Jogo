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
import java.awt.Color;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author João Marcelo
 */
public class CriarPersonagem extends javax.swing.JFrame {

    /**
     * Creates new form CriarPersonagem
     */
    public CriarPersonagem() {
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

        Nome = new javax.swing.JTextField();
        Classe = new javax.swing.JComboBox<>();
        Fem = new javax.swing.JCheckBox();
        Masc = new javax.swing.JCheckBox();
        Menu = new javax.swing.JButton();
        Criar = new javax.swing.JButton();
        Vida = new javax.swing.JLabel();
        Critico = new javax.swing.JLabel();
        Defesa = new javax.swing.JLabel();
        Magia = new javax.swing.JLabel();
        Forca = new javax.swing.JLabel();
        Stamina = new javax.swing.JLabel();
        LabelDefesa = new javax.swing.JLabel();
        LabelCritico = new javax.swing.JLabel();
        labelForça = new javax.swing.JLabel();
        LabelMagia = new javax.swing.JLabel();
        LabelStamina = new javax.swing.JLabel();
        LabelVida = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Info = new javax.swing.JLabel();
        Atributos = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nome.setBackground(new java.awt.Color(255, 255, 255));
        Nome.setForeground(new java.awt.Color(0, 0, 0));
        Nome.setToolTipText("Teste");
        Nome.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 200, 40));

        Classe.setBackground(new java.awt.Color(204, 204, 204));
        Classe.setForeground(new java.awt.Color(0, 0, 0));
        Classe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Guerreiro", "Mago", "Arqueiro" }));
        Classe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClasseActionPerformed(evt);
            }
        });
        getContentPane().add(Classe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, 30));

        Fem.setForeground(new java.awt.Color(255, 255, 255));
        Fem.setText("Feminino");
        Fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemActionPerformed(evt);
            }
        });
        getContentPane().add(Fem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, 30));

        Masc.setForeground(new java.awt.Color(255, 255, 255));
        Masc.setText("Masculino");
        Masc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MascActionPerformed(evt);
            }
        });
        getContentPane().add(Masc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 150, 30));

        Menu.setBackground(new java.awt.Color(204, 204, 204));
        Menu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Menu.setForeground(new java.awt.Color(0, 0, 0));
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 120, 40));

        Criar.setBackground(new java.awt.Color(204, 204, 204));
        Criar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Criar.setForeground(new java.awt.Color(0, 0, 0));
        Criar.setText("Criar!");
        Criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarActionPerformed(evt);
            }
        });
        getContentPane().add(Criar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 120, 40));

        Vida.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Vida.setForeground(new java.awt.Color(255, 255, 255));
        Vida.setText("Vida");
        getContentPane().add(Vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, 120, -1));

        Critico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Critico.setForeground(new java.awt.Color(255, 255, 255));
        Critico.setText("Critico");
        getContentPane().add(Critico, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 420, 120, -1));

        Defesa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Defesa.setForeground(new java.awt.Color(255, 255, 255));
        Defesa.setText("Defesa");
        getContentPane().add(Defesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 380, 120, -1));

        Magia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Magia.setForeground(new java.awt.Color(255, 255, 255));
        Magia.setText("Magia");
        getContentPane().add(Magia, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, 130, -1));

        Forca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Forca.setForeground(new java.awt.Color(255, 255, 255));
        Forca.setText("Força");
        getContentPane().add(Forca, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 300, 120, -1));

        Stamina.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Stamina.setForeground(new java.awt.Color(255, 255, 255));
        Stamina.setText("Stamina");
        getContentPane().add(Stamina, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 260, 120, -1));

        LabelDefesa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelDefesa.setForeground(new java.awt.Color(255, 255, 255));
        LabelDefesa.setText("Defesa:");
        getContentPane().add(LabelDefesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, -1, -1));

        LabelCritico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelCritico.setForeground(new java.awt.Color(255, 255, 255));
        LabelCritico.setText("Critico:");
        getContentPane().add(LabelCritico, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, -1, -1));

        labelForça.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelForça.setForeground(new java.awt.Color(255, 255, 255));
        labelForça.setText("Força:");
        getContentPane().add(labelForça, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, -1, -1));

        LabelMagia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelMagia.setForeground(new java.awt.Color(255, 255, 255));
        LabelMagia.setText("Magia:");
        getContentPane().add(LabelMagia, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, -1, -1));

        LabelStamina.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelStamina.setForeground(new java.awt.Color(255, 255, 255));
        LabelStamina.setText("Stamina:");
        getContentPane().add(LabelStamina, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, -1, -1));

        LabelVida.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelVida.setForeground(new java.awt.Color(255, 255, 255));
        LabelVida.setText("Vida:");
        getContentPane().add(LabelVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genero:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Classe:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ads/jogorpg/icon/moldura_maior.png"))); // NOI18N
        getContentPane().add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 400, 460));

        Atributos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ads/jogorpg/icon/moldura_maior.png"))); // NOI18N
        getContentPane().add(Atributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 390, 460));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ads/jogorpg/icon/FundoMenu.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemActionPerformed
        // TODO add your handling code here:
        Masc.setSelected(false);
    }//GEN-LAST:event_FemActionPerformed

    private void MascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MascActionPerformed
        // TODO add your handling code here:
        Fem.setSelected(false);
    }//GEN-LAST:event_MascActionPerformed

    private void ClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClasseActionPerformed
        // TODO add your handling code here:
        Personagens Tela = new Personagens();
        Tela.criarPersonagem((String) Classe.getSelectedItem(), "", "", 0);
        Vida.setText( String.valueOf(Tela.getVidaMax()));
        Stamina.setText(String.valueOf(Tela.getStaminaMax()));
        Forca.setText(String.valueOf(Tela.getStregth()));
        Magia.setText(String.valueOf(Tela.getMagic()));
        Defesa.setText(String.valueOf(Tela.getDefense()));
        Critico.setText(String.valueOf(Tela.getCritical()));
    }//GEN-LAST:event_ClasseActionPerformed

    private void CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarActionPerformed
        // TODO add your handling code here:
        DbSQL sql = new DbSQL();
        Doc doc = new Doc();
        Personagens P1 = new Personagens();
        User user = new User();
        DbMongoDB mongo = new DbMongoDB();
        String Sex = "0";
        
        if(Masc.isSelected()){
            Sex = "M";
        }else if(Fem.isSelected()){
            Sex = "F";
        }else{
            JOptionPane.showMessageDialog(null, "Informe um gênero para seu personagem");
        }
        if(Nome.getText().equals(" ") || Nome.getText().isEmpty() || Nome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina um nome para o Personagem");
        }else if(Classe.getSelectedItem().equals(" ")){
            JOptionPane.showMessageDialog(null, "Escolha uma classe");
        }else if(!Sex.equals("0")){
            
            user = doc.DocToUser(mongo.MongoGetDBcollection("Jogo", "LoggedUser"));
            P1.criarPersonagem((String) Classe.getSelectedItem(), Nome.getText(), Sex, user.getID());
            Document docPersonagem = doc.DocPersonagem(P1);
            sql.sqlDbPersonagemInsert(P1);
            JOptionPane.showMessageDialog(null, "Personagem Criado");
        }
        
        
        
        
        
        
    }//GEN-LAST:event_CriarActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TelaPrincipal p1 = new TelaPrincipal();
        p1.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(CriarPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarPersonagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atributos;
    private javax.swing.JComboBox<String> Classe;
    private javax.swing.JButton Criar;
    private javax.swing.JLabel Critico;
    private javax.swing.JLabel Defesa;
    private javax.swing.JCheckBox Fem;
    private javax.swing.JLabel Forca;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel LabelCritico;
    private javax.swing.JLabel LabelDefesa;
    private javax.swing.JLabel LabelMagia;
    private javax.swing.JLabel LabelStamina;
    private javax.swing.JLabel LabelVida;
    private javax.swing.JLabel Magia;
    private javax.swing.JCheckBox Masc;
    private javax.swing.JButton Menu;
    private javax.swing.JTextField Nome;
    private javax.swing.JLabel Stamina;
    private javax.swing.JLabel Vida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelForça;
    // End of variables declaration//GEN-END:variables
}