package Vue;

import Controleur.cltClient;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consulter extends javax.swing.JFrame {
    /**
     * Creates new form Consulter
     */
    private cltClient clt;
    public Consulter() throws SQLException {
        initComponents();
        clt = new cltClient();
        clt.consulter(nomLabel, prenomLabel, telLabel, labelBilan, labelMotif);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        nomLabel = new javax.swing.JLabel();
        prenomLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        labelMotif = new javax.swing.JLabel();
        labelBilan = new javax.swing.JLabel();
        motifInput = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        clipboard = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setFont(new java.awt.Font("Galvji", 1, 13)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 93, 94));
        exitBtn.setText("X");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        nomLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        nomLabel.setForeground(new java.awt.Color(0, 153, 153));
        nomLabel.setText("Nom");
        jPanel1.add(nomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        prenomLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        prenomLabel.setForeground(new java.awt.Color(0, 153, 153));
        prenomLabel.setText("Prénom");
        jPanel1.add(prenomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        telLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        telLabel.setForeground(new java.awt.Color(0, 153, 153));
        telLabel.setText("Tél.");
        jPanel1.add(telLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        labelMotif.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        labelMotif.setForeground(new java.awt.Color(0, 153, 153));
        labelMotif.setText("Motif :");
        jPanel1.add(labelMotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        labelBilan.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        labelBilan.setToolTipText("");
        labelBilan.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(labelBilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 370, 140));

        motifInput.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        motifInput.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        motifInput.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(motifInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 300, 20));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gsbLogo.png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        clipboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clipboardConsulter.png"))); // NOI18N
        jPanel1.add(clipboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 440, 330));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background#2.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new GSBapplication().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Consulter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoMouseClicked

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Consulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Consulter().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Consulter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel clipboard;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBilan;
    private javax.swing.JLabel labelMotif;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel motifInput;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JLabel prenomLabel;
    private javax.swing.JLabel telLabel;
    // End of variables declaration//GEN-END:variables
}
