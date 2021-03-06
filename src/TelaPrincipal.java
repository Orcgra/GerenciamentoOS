/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Igor Santana
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal1
     */
    public TelaPrincipal() {
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

        Logo = new javax.swing.JLabel();
        TextNovoChamado = new javax.swing.JButton();
        TextEditarChamado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TextAtenderChamado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orcgra - Gerenciamento de O.S");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo ORCGRA.png"))); // NOI18N
        Logo.setText("jLabel3");

        TextNovoChamado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TextNovoChamado.setText("NOVO CHAMADO");
        TextNovoChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNovoChamadoActionPerformed(evt);
            }
        });

        TextEditarChamado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TextEditarChamado.setText("BUSCAR CHAMADO");
        TextEditarChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEditarChamadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Version 1.0");

        TextAtenderChamado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TextAtenderChamado.setText("ATENDER CHAMADO");
        TextAtenderChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAtenderChamadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextEditarChamado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextAtenderChamado))
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextNovoChamado)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 305, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(359, 359, 359))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(TextNovoChamado)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextEditarChamado)
                    .addComponent(TextAtenderChamado))
                .addGap(121, 121, 121)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNovoChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNovoChamadoActionPerformed
        // TODO add your handling code here:
        
        TelaNovoChamado TelaNovoChamado = new TelaNovoChamado ();
        TelaNovoChamado.setVisible(true);
       
    }//GEN-LAST:event_TextNovoChamadoActionPerformed

    private void TextEditarChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEditarChamadoActionPerformed
        // TODO add your handling code here:
        
        TelaBuscarChamado TelaBuscarChamado = new TelaBuscarChamado ();
        TelaBuscarChamado.setVisible(true);

    }//GEN-LAST:event_TextEditarChamadoActionPerformed

    private void TextAtenderChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAtenderChamadoActionPerformed
        // TODO add your handling code here:
        
        TelaAtenderChamado telaAtenderChamado = new TelaAtenderChamado();
        telaAtenderChamado.setVisible(true);

    }//GEN-LAST:event_TextAtenderChamadoActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton TextAtenderChamado;
    private javax.swing.JButton TextEditarChamado;
    private javax.swing.JButton TextNovoChamado;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
