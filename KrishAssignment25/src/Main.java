/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krish
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    public static boolean checker(String txt, boolean deen){
        int num;
        if (deen == true)
            num = 31;
        else
            num = 32;
        if (txt.length() < num)
            return(true);
        else
            return(false);
    }
    public static String encrypt(String orig, int key){
        int temp;
        char temper;
        String finale = "";
        
        for(int i = 0; i < orig.length(); i++){
            
            temper = orig.charAt(i);
            
            temp = (int)temper;
            
            temp += key;
            
            temper = (char)temp;
            
            finale = finale + temper;
        }
        return (finale + key);
    }
    
    
    public static int keyer(String crypt){
        char let = crypt.charAt(crypt.length()-1);
        String letter = Character.toString(let);
        int key;
        try{
            key = Integer.parseInt(letter);
            return(key);
        }
        catch(NumberFormatException e){
            return(0);
        }
    }
    
    public static String decrypt(String orig, int key){
        int temp;
        char temper;
        String finale = "";
        
        for(int i = 0; i < orig.length()-1; i++){
            
            temper = orig.charAt(i);
            
            temp = (int)temper;
            
            temp -= key;
            
            temper = (char)temp;
            
            finale = finale + temper;
        }
        return (finale);
    }
            
    public Main() {
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

        jLabel2 = new javax.swing.JLabel();
        LblEN = new javax.swing.JLabel();
        TXTEn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BTNEn = new javax.swing.JButton();
        LblDE = new javax.swing.JLabel();
        TXTDe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BTNDe = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("--Top Secret--");

        LblEN.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        LblEN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEN.setText("Encrypted message will be displayed here...");

        TXTEn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXTEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTEnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter a decrypted message and it will be encrypted.");

        BTNEn.setText("ENCRYPT");
        BTNEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEnActionPerformed(evt);
            }
        });

        LblDE.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        LblDE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblDE.setText("Decrypted message will be displayed here...");

        TXTDe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXTDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Enter a encrypted message and it will be decrypted.");

        BTNDe.setText("DECRYPT");
        BTNDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(BTNDe)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTEn)
                            .addComponent(LblEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                            .addComponent(LblDE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXTDe))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(BTNEn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(TXTEn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNEn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblEN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(TXTDe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblDE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTEnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTEnActionPerformed

    private void BTNEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEnActionPerformed
        // TODO add your handling code here:
        String enmsg = TXTEn.getText();
        
        int ran;
        
        if(checker(enmsg, true) == false)
            LblEN.setText("Sorry, the entered string value is too many characters. Please try again.");
        else{
            ran = (int)Math.round(Math.random()*8+1);
            LblEN.setText(encrypt(enmsg, ran));
        }
        
        
        
        
    }//GEN-LAST:event_BTNEnActionPerformed

    private void TXTDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDeActionPerformed

    private void BTNDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDeActionPerformed
        // TODO add your handling code here:
        String demsg = TXTDe.getText(); 

        if (keyer(demsg) == 0 || checker(demsg, false) == false)
            LblDE.setText("Sorry, the entered string cannot be decrypted. Please try again.");
        else{
            LblDE.setText(String.valueOf(decrypt(demsg, keyer(demsg))));
        }
    }//GEN-LAST:event_BTNDeActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNDe;
    private javax.swing.JButton BTNEn;
    private javax.swing.JLabel LblDE;
    private javax.swing.JLabel LblEN;
    private javax.swing.JTextField TXTDe;
    private javax.swing.JTextField TXTEn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}