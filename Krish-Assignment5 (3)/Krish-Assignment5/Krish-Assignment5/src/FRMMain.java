/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s300095291
 */
public class FRMMain extends javax.swing.JFrame {
    
    double subtotal; //initializes universal variable
    double tax; //initializes universal variable

    /**
     * Creates new form FRMMain
     */
    
    public FRMMain() {
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

        Welcome = new javax.swing.JLabel();
        Instructions = new javax.swing.JLabel();
        LBLApl = new javax.swing.JLabel();
        LBLBana = new javax.swing.JLabel();
        LBLCoco = new javax.swing.JLabel();
        LBLDrgfrt = new javax.swing.JLabel();
        LBLPinapl = new javax.swing.JLabel();
        LBLKiwi = new javax.swing.JLabel();
        LBLMang = new javax.swing.JLabel();
        TXTApl = new javax.swing.JTextField();
        TXTBana = new javax.swing.JTextField();
        TXTCoco = new javax.swing.JTextField();
        TXTPinapl = new javax.swing.JTextField();
        TXTDrgfrt = new javax.swing.JTextField();
        TXTKiwi = new javax.swing.JTextField();
        TXTMang = new javax.swing.JTextField();
        BTNSub = new javax.swing.JButton();
        BTNTax = new javax.swing.JButton();
        BTNGrnd = new javax.swing.JButton();
        LBLSub = new javax.swing.JLabel();
        LBLgrnd = new javax.swing.JLabel();
        LBLTax = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 204));
        setResizable(false);

        Welcome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("Welcome to Krish's Fruit Mart!");

        Instructions.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Instructions.setText("Please state the number of each fruit you would like to buy");

        LBLApl.setText("Apples ($0.99):");

        LBLBana.setText("Bananas ($1.49):");

        LBLCoco.setText("Coconuts ($2.49):");

        LBLDrgfrt.setText("Dragon Fruit ($2.99):");

        LBLPinapl.setText("Pineapples ($2.49):");

        LBLKiwi.setText("Kiwis ($0.99):");

        LBLMang.setText("Mangoes ($3.45): ");

        TXTApl.setText("0");

        TXTBana.setText("0");

        TXTCoco.setText("0");

        TXTPinapl.setText("0");

        TXTDrgfrt.setText("0");

        TXTKiwi.setText("0");

        TXTMang.setText("0");

        BTNSub.setText("Calculate Subtotal");
        BTNSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSubActionPerformed(evt);
            }
        });

        BTNTax.setText("Calculate Taxes");
        BTNTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNTaxActionPerformed(evt);
            }
        });

        BTNGrnd.setText("Calculate Grand Total");
        BTNGrnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGrndActionPerformed(evt);
            }
        });

        LBLSub.setText("Subtotal");

        LBLgrnd.setText("Grand Total");

        LBLTax.setText("Taxes");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fruit_Basket_NH_Icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Welcome)
                            .addComponent(Instructions))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBLKiwi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TXTKiwi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LBLMang)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TXTMang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(LBLPinapl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(TXTPinapl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(LBLCoco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TXTCoco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(LBLBana)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TXTBana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(LBLApl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TXTApl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LBLDrgfrt)
                                    .addGap(18, 18, 18)
                                    .addComponent(TXTDrgfrt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNGrnd)
                            .addComponent(BTNTax)
                            .addComponent(BTNSub))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLSub)
                            .addComponent(LBLTax)
                            .addComponent(LBLgrnd))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Welcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Instructions)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLApl)
                            .addComponent(TXTApl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLBana)
                    .addComponent(TXTBana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLCoco)
                    .addComponent(TXTCoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNSub)
                    .addComponent(LBLSub))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLDrgfrt)
                    .addComponent(TXTDrgfrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLPinapl)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTPinapl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTNTax)
                        .addComponent(LBLTax)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLKiwi)
                    .addComponent(TXTKiwi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(LBLMang))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTMang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTNGrnd)
                        .addComponent(LBLgrnd)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNTaxActionPerformed
        
        final double TAXRATE = 0.13; //permenant tax rate multiplier
        tax = TAXRATE*subtotal; //calculates tax based on subtotal price
                
        LBLTax.setText("$" + String.format("%.2f",tax)); //replaces tax label with the dollar sign and tax, as a string, to 2 decimal places

// TODO add your handling code here:
    }//GEN-LAST:event_BTNTaxActionPerformed

    private void BTNSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSubActionPerformed
        
        int apples = Integer.parseInt(TXTApl.getText()); //initializes apples and gets the amount 
        int bananas = Integer.parseInt(TXTBana.getText());//initializes bananas and gets the amount
        int coconuts = Integer.parseInt(TXTCoco.getText());//initializes coconuts and gets the amount
        int dragonfrt = Integer.parseInt(TXTDrgfrt.getText());//initializes dragon fruit and gets the amount
        int pineapples = Integer.parseInt(TXTPinapl.getText());//initializes pineapples and gets the amount
        int kiwi = Integer.parseInt(TXTKiwi.getText());//initializes kiwis and gets the amount
        int mangoes = Integer.parseInt(TXTMang.getText());//initializes mangoes and gets the amount
        
        final double APPLES = 0.99; 
        final double BANANAS = 1.49;
        final double COCONUTS = 2.49;
        final double DRAGONFRT = 2.99;
        final double PINEAPPLES = 2.49;
        final double KIWI = 0.99;
        final double MANGOES = 3.45;
        //all the code above finalizes permenant prices of each fruit 
        
        subtotal = (apples*APPLES) + (bananas*BANANAS) + (coconuts*COCONUTS) + (dragonfrt*DRAGONFRT) + (pineapples*PINEAPPLES) + (kiwi*KIWI) + (mangoes*MANGOES);
        //calculates subtotal by multiplying each item with the price and adding them
        
        LBLSub.setText("$" + String.format("%.2f", subtotal));//replaces subtotal label with the dollar sign and subtotal, as a string, to 2 decimal places
            
    }//GEN-LAST:event_BTNSubActionPerformed

    private void BTNGrndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGrndActionPerformed
        
        double grand = subtotal + tax;//adds the orginal price and the tax for the total amount 
        
        LBLgrnd.setText("$" + String.format("%.2f", grand));//replaces grand label with the dollar sign and grand, as a string, to 2 decimal places
        
    }//GEN-LAST:event_BTNGrndActionPerformed

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
            java.util.logging.Logger.getLogger(FRMMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNGrnd;
    private javax.swing.JButton BTNSub;
    private javax.swing.JButton BTNTax;
    private javax.swing.JLabel Instructions;
    private javax.swing.JLabel LBLApl;
    private javax.swing.JLabel LBLBana;
    private javax.swing.JLabel LBLCoco;
    private javax.swing.JLabel LBLDrgfrt;
    private javax.swing.JLabel LBLKiwi;
    private javax.swing.JLabel LBLMang;
    private javax.swing.JLabel LBLPinapl;
    private javax.swing.JLabel LBLSub;
    private javax.swing.JLabel LBLTax;
    private javax.swing.JLabel LBLgrnd;
    private javax.swing.JTextField TXTApl;
    private javax.swing.JTextField TXTBana;
    private javax.swing.JTextField TXTCoco;
    private javax.swing.JTextField TXTDrgfrt;
    private javax.swing.JTextField TXTKiwi;
    private javax.swing.JTextField TXTMang;
    private javax.swing.JTextField TXTPinapl;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
