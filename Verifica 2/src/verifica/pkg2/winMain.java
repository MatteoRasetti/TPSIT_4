/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica.pkg2;

/**
 *
 * @author studente
 */
public class winMain extends javax.swing.JFrame {

    /**
     * Creates new form winMain
     */
    public winMain() {
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

        avvia = new javax.swing.JButton();
        ferma = new javax.swing.JButton();
        velocita = new javax.swing.JSlider();
        su = new javax.swing.JButton();
        destra = new javax.swing.JButton();
        sinistra = new javax.swing.JButton();
        giu = new javax.swing.JButton();
        messaggio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        barca = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulatore Navale");

        avvia.setText("Avvia");
        avvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avviaActionPerformed(evt);
            }
        });

        ferma.setText("Ferma");
        ferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermaActionPerformed(evt);
            }
        });

        velocita.setMaximum(30);
        velocita.setMinimum(5);
        velocita.setMinorTickSpacing(5);
        velocita.setPaintLabels(true);
        velocita.setPaintTicks(true);
        velocita.setSnapToTicks(true);
        velocita.setToolTipText("");
        velocita.setValue(5);
        velocita.setEnabled(false);

        su.setText("^");
        su.setEnabled(false);
        su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suActionPerformed(evt);
            }
        });

        destra.setText(">");
        destra.setEnabled(false);
        destra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destraActionPerformed(evt);
            }
        });

        sinistra.setText("<");
        sinistra.setEnabled(false);
        sinistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinistraActionPerformed(evt);
            }
        });

        giu.setText("v");
        giu.setEnabled(false);
        giu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giuActionPerformed(evt);
            }
        });

        messaggio.setText("Trascina per aumentare la velocità!");
        messaggio.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(167, 235, 250));

        barca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verifica/pkg2/galleon-146994_960_720.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(barca)
                .addGap(41, 41, 41))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("                Naval Training Simulator 2017");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(avvia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ferma, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sinistra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(su, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(giu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(velocita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(avvia)
                        .addComponent(ferma)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(su, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(giu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(destra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sinistra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(velocita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(messaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void destraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destraActionPerformed
        int x1 = barca.getX();
        int y1 = barca.getY();
        int v = velocita.getValue();
        x1 = x1 + v;
        barca.setLocation(x1, y1);
    }//GEN-LAST:event_destraActionPerformed

    private void giuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giuActionPerformed
        int x1 = barca.getX();
        int y1 = barca.getY();
        int v = velocita.getValue();
        y1 = y1 + v;
        barca.setLocation(x1, y1);
    }//GEN-LAST:event_giuActionPerformed

    private void avviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avviaActionPerformed
        su.setEnabled(true);
        giu.setEnabled(true);
        destra.setEnabled(true);
        sinistra.setEnabled(true);
        velocita.setEnabled(true);
        messaggio.setEnabled(true);
    }//GEN-LAST:event_avviaActionPerformed

    private void suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suActionPerformed
        int x1 = barca.getX();
        int y1 = barca.getY();
        int v = velocita.getValue();
        y1 = y1 - v;
        barca.setLocation(x1, y1);
    }//GEN-LAST:event_suActionPerformed

    private void sinistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinistraActionPerformed
        int x1 = barca.getX();
        int y1 = barca.getY();
        int v = velocita.getValue();
        x1 = x1 - v;
        barca.setLocation(x1, y1);
    }//GEN-LAST:event_sinistraActionPerformed

    private void fermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermaActionPerformed
        su.setEnabled(false);
        giu.setEnabled(false);
        destra.setEnabled(false);
        sinistra.setEnabled(false);
        velocita.setEnabled(false);
        messaggio.setEnabled(false);
        barca.setLocation(12, 115);
    }//GEN-LAST:event_fermaActionPerformed

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
            java.util.logging.Logger.getLogger(winMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(winMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(winMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(winMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new winMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avvia;
    private javax.swing.JLabel barca;
    private javax.swing.JButton destra;
    private javax.swing.JButton ferma;
    private javax.swing.JButton giu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messaggio;
    private javax.swing.JButton sinistra;
    private javax.swing.JButton su;
    private javax.swing.JSlider velocita;
    // End of variables declaration//GEN-END:variables
}