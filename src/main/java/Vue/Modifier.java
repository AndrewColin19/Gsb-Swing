/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.cltClient;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;

/**
 *
 * @author benndui
 */
public class Modifier extends javax.swing.JFrame {

    /**
     * Creates new form Modifier
     */
    
    private cltClient clt;
    public Modifier() throws SQLException {
        initComponents();
        clt = new cltClient();
        clt.creeComboModel(clt.getRapDAO().recupMotif(), motif);
        clt.creeComboModel(clt.getMedDAO().tousLesMedecins(), medCombo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        previewsMotif = new javax.swing.JTextField();
        motif = new javax.swing.JComboBox<>();
        medCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        validatedBtn = new javax.swing.JLabel();
        clipboard = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gsbFinale.png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        mainPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        exitBtn.setFont(new java.awt.Font("Galvji", 1, 13)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 93, 94));
        exitBtn.setText("X");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        mainPanel.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        previewsMotif.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        previewsMotif.setText("Entrez un nouveau motif");
        previewsMotif.setBorder(null);
        previewsMotif.setName(""); // NOI18N
        previewsMotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewsMotifActionPerformed(evt);
            }
        });
        mainPanel.add(previewsMotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, 30));

        motif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veuillez s??lectionner un motif" }));
        mainPanel.add(motif, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 160, -1));

        medCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veuillez selectionner un medecin" }));
        mainPanel.add(medCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 160, -1));

        jScrollPane1.setFocusable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 170, 350, 150));

        validatedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/majBtn.png"))); // NOI18N
        validatedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validatedBtnMouseClicked(evt);
            }
        });
        mainPanel.add(validatedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 160, 50));

        clipboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clipboard#red.png"))); // NOI18N
        mainPanel.add(clipboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background#1.png"))); // NOI18N
        mainPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 787, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new GSBapplication().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Modifier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoMouseClicked

    private void validatedBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validatedBtnMouseClicked
        try {
            // TODO add your handling code here:
            clt.editRapport(jTextArea1, previewsMotif, motif, medCombo);
        } catch (SQLException ex) {
            Logger.getLogger(Modifier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_validatedBtnMouseClicked

    private void previewsMotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewsMotifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previewsMotifActionPerformed

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
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Modifier().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Modifier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel clipboard;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> medCombo;
    private javax.swing.JComboBox<String> motif;
    private javax.swing.JTextField previewsMotif;
    private javax.swing.JLabel validatedBtn;
    // End of variables declaration//GEN-END:variables
}
