/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coding;

/**
 *
 * @author Admin
 */
public class SEGITIGA extends javax.swing.JFrame {

    /**
     * Creates new form SEGITIGA
     */
    public SEGITIGA() {
        initComponents();
        reset();
    }
    void reset (){
        PSISI.setText(null);
        ALUAS.setText(null);
        AKELILING.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PSISI = new javax.swing.JTextField();
        FKEMBALI = new javax.swing.JButton();
        FRESET = new javax.swing.JButton();
        FHITUNG = new javax.swing.JButton();
        ALUAS = new javax.swing.JLabel();
        AKELILING = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("SEGITIGA");

        jLabel2.setText("SISI");

        FKEMBALI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coding/arrow.png"))); // NOI18N
        FKEMBALI.setText("KEMBALI");
        FKEMBALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FKEMBALIActionPerformed(evt);
            }
        });

        FRESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coding/circular.png"))); // NOI18N
        FRESET.setText("RESET");
        FRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FRESETActionPerformed(evt);
            }
        });

        FHITUNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coding/account.png"))); // NOI18N
        FHITUNG.setText("HITUNG");
        FHITUNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FHITUNGActionPerformed(evt);
            }
        });

        ALUAS.setText("jLabel3");

        AKELILING.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AKELILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(FHITUNG))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(FRESET)
                                        .addGap(30, 30, 30)
                                        .addComponent(FKEMBALI))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(PSISI, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(ALUAS))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PSISI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FKEMBALI)
                    .addComponent(FHITUNG)
                    .addComponent(FRESET))
                .addGap(48, 48, 48)
                .addComponent(ALUAS)
                .addGap(18, 18, 18)
                .addComponent(AKELILING)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FRESETActionPerformed
        reset();
    }//GEN-LAST:event_FRESETActionPerformed

    private void FKEMBALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FKEMBALIActionPerformed
        new home ().setVisible(true);
        dispose();
    }//GEN-LAST:event_FKEMBALIActionPerformed

    private void FHITUNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FHITUNGActionPerformed
        int sisi = Integer.parseInt(PSISI.getText());
        double luas = 0.433 * sisi * sisi;
        int keliling = 3 * sisi;
        ALUAS.setText("LUAS : "+luas);
        AKELILING.setText("KELILING : "+keliling);
    }//GEN-LAST:event_FHITUNGActionPerformed

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
            java.util.logging.Logger.getLogger(SEGITIGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEGITIGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEGITIGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEGITIGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEGITIGA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AKELILING;
    private javax.swing.JLabel ALUAS;
    private javax.swing.JButton FHITUNG;
    private javax.swing.JButton FKEMBALI;
    private javax.swing.JButton FRESET;
    private javax.swing.JTextField PSISI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
