/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nalam
 */
public class FrmMainScreen extends javax.swing.JFrame {

    /**
     * Creates new form FrmMainScreen
     */
    public FrmMainScreen() {
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

        LBL1st = new javax.swing.JLabel();
        LBL2nd = new javax.swing.JLabel();
        LBL3rd = new javax.swing.JLabel();
        LBL4th = new javax.swing.JLabel();
        TXT1st = new javax.swing.JTextField();
        TXT2nd = new javax.swing.JTextField();
        TXT3rd = new javax.swing.JTextField();
        TXT4th = new javax.swing.JTextField();
        BTNAVG = new javax.swing.JButton();
        LBLAns = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBL1st.setText("First Number:");

        LBL2nd.setText("Second Number:");

        LBL3rd.setText("Third Number:");

        LBL4th.setText("Fourth Number:");

        TXT2nd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT2ndActionPerformed(evt);
            }
        });

        TXT3rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT3rdActionPerformed(evt);
            }
        });

        TXT4th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT4thActionPerformed(evt);
            }
        });

        BTNAVG.setText("Calculate AVG");
        BTNAVG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAVGActionPerformed(evt);
            }
        });

        LBLAns.setText("Answer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL4th)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LBL2nd)
                        .addComponent(LBL1st, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LBL3rd, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXT3rd, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(TXT2nd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXT1st, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXT4th))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(BTNAVG)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(LBLAns)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL1st)
                    .addComponent(TXT1st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL2nd)
                    .addComponent(TXT2nd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNAVG))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL3rd)
                    .addComponent(TXT3rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLAns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL4th)
                    .addComponent(TXT4th, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT4thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT4thActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT4thActionPerformed

    private void TXT2ndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT2ndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT2ndActionPerformed

    private void TXT3rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT3rdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT3rdActionPerformed

    private void BTNAVGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAVGActionPerformed
        int num1;
        int num2;
        int num3;
        int num4;
        double avg;
        num1 = Integer.parseInt(TXT1st.getText());
        num2 = Integer.parseInt(TXT2nd.getText());
        num3 = Integer.parseInt(TXT3rd.getText());
        num4 = Integer.parseInt(TXT4th.getText());
        avg = num1 + num2 + num3 + num4;
        avg = avg/4;
        avg = avg*10;
        avg = Math.round(avg);
        avg = avg/10;
        LBLAns.setText(String.valueOf(avg));
        
        

// TODO add your handling code here:
    }//GEN-LAST:event_BTNAVGActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAVG;
    private javax.swing.JLabel LBL1st;
    private javax.swing.JLabel LBL2nd;
    private javax.swing.JLabel LBL3rd;
    private javax.swing.JLabel LBL4th;
    private javax.swing.JLabel LBLAns;
    private javax.swing.JTextField TXT1st;
    private javax.swing.JTextField TXT2nd;
    private javax.swing.JTextField TXT3rd;
    private javax.swing.JTextField TXT4th;
    // End of variables declaration//GEN-END:variables
}