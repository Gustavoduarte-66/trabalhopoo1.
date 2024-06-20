/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login.View;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Teles
 */
public class DespesasView extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalView
     */
    public DespesasView() {
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

        jLabelDespesas = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jTextFieldFormaPagamento = new javax.swing.JTextField();
        jLabelFormaPagamento = new javax.swing.JLabel();
        jLabelTotalDinheiro = new javax.swing.JLabel();
        jTextFieldAlunos = new javax.swing.JTextField();
        jLabelDataPagamento = new javax.swing.JLabel();
        jTextFieldTotalDespesas = new javax.swing.JTextField();
        jLabelAlunos = new javax.swing.JLabel();
        jTextFieldDataPagamento = new javax.swing.JTextField();
        jLabelDataPagamento1 = new javax.swing.JLabel();
        jTextFieldDataPagamento1 = new javax.swing.JTextField();
        jTextFieldValor1 = new javax.swing.JTextField();
        jTextFieldFormaPagamento1 = new javax.swing.JTextField();
        jTextFieldAlunos1 = new javax.swing.JTextField();
        jTextFieldDataPagamento2 = new javax.swing.JTextField();
        jTextFieldValor2 = new javax.swing.JTextField();
        jTextFieldFormaPagamento2 = new javax.swing.JTextField();
        jTextFieldAlunos2 = new javax.swing.JTextField();
        jTextFieldDataPagamento3 = new javax.swing.JTextField();
        jTextFieldValor3 = new javax.swing.JTextField();
        jTextFieldFormaPagamento3 = new javax.swing.JTextField();
        jTextFieldAlunos3 = new javax.swing.JTextField();
        jLabelValor1 = new javax.swing.JLabel();
        jTextFieldValor4 = new javax.swing.JTextField();
        jLabelTotalDespesas = new javax.swing.JLabel();
        jTextFieldTotalDinheiro = new javax.swing.JTextField();
        jLabelTotalDinheiro2 = new javax.swing.JLabel();
        jTextFieldTotalPix = new javax.swing.JTextField();
        jLabelTotalDinheiro3 = new javax.swing.JLabel();
        jTextFieldTotalCartao1 = new javax.swing.JTextField();
        jLabelImagemFundoTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDespesas.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        jLabelDespesas.setText("Despesas");
        getContentPane().add(jLabelDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        jButtonVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonVoltar.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 150, 50));
        getContentPane().add(jTextFieldFormaPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 230, 40));

        jLabelFormaPagamento.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelFormaPagamento.setText("Forma de Pagamento");
        getContentPane().add(jLabelFormaPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 230, -1));

        jLabelTotalDinheiro.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelTotalDinheiro.setText("Total em cartão");
        getContentPane().add(jLabelTotalDinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 200, -1));
        getContentPane().add(jTextFieldAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 340, 40));

        jLabelDataPagamento.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelDataPagamento.setText("Data");
        getContentPane().add(jLabelDataPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 60, -1));
        getContentPane().add(jTextFieldTotalDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 610, 110, 40));

        jLabelAlunos.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelAlunos.setText("Alunos");
        getContentPane().add(jLabelAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 100, -1));
        getContentPane().add(jTextFieldDataPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 110, 40));

        jLabelDataPagamento1.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelDataPagamento1.setText("Data");
        getContentPane().add(jLabelDataPagamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 60, -1));
        getContentPane().add(jTextFieldDataPagamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 110, 40));
        getContentPane().add(jTextFieldValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 110, 40));
        getContentPane().add(jTextFieldFormaPagamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 230, 40));
        getContentPane().add(jTextFieldAlunos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 340, 40));
        getContentPane().add(jTextFieldDataPagamento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 110, 40));
        getContentPane().add(jTextFieldValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 110, 40));
        getContentPane().add(jTextFieldFormaPagamento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 230, 40));
        getContentPane().add(jTextFieldAlunos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 340, 40));
        getContentPane().add(jTextFieldDataPagamento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 110, 40));
        getContentPane().add(jTextFieldValor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 110, 40));
        getContentPane().add(jTextFieldFormaPagamento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 230, 40));
        getContentPane().add(jTextFieldAlunos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 340, 40));

        jLabelValor1.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelValor1.setText("Valor");
        getContentPane().add(jLabelValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 70, -1));
        getContentPane().add(jTextFieldValor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 110, 40));

        jLabelTotalDespesas.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelTotalDespesas.setText("Total de despesas");
        getContentPane().add(jLabelTotalDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 200, -1));
        getContentPane().add(jTextFieldTotalDinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 110, 40));

        jLabelTotalDinheiro2.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelTotalDinheiro2.setText("Total em pix");
        getContentPane().add(jLabelTotalDinheiro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 200, -1));
        getContentPane().add(jTextFieldTotalPix, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 110, 40));

        jLabelTotalDinheiro3.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelTotalDinheiro3.setText("Total em dinheiro");
        getContentPane().add(jLabelTotalDinheiro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 200, -1));
        getContentPane().add(jTextFieldTotalCartao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 110, 40));

        jLabelImagemFundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/abstract-silhouette-bodybuilder-gym-logo-white-background-bodybuilder-training-vector-illustration-abstract-silhouette-139642649.jpg"))); // NOI18N
        getContentPane().add(jLabelImagemFundoTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        MenuPrincipalView telaMenuPrincipal = new MenuPrincipalView();
        telaMenuPrincipal.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(DespesasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DespesasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DespesasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DespesasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DespesasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelAlunos;
    private javax.swing.JLabel jLabelDataPagamento;
    private javax.swing.JLabel jLabelDataPagamento1;
    private javax.swing.JLabel jLabelDespesas;
    private javax.swing.JLabel jLabelFormaPagamento;
    private javax.swing.JLabel jLabelImagemFundoTela;
    private javax.swing.JLabel jLabelTotalDespesas;
    private javax.swing.JLabel jLabelTotalDinheiro;
    private javax.swing.JLabel jLabelTotalDinheiro2;
    private javax.swing.JLabel jLabelTotalDinheiro3;
    private javax.swing.JLabel jLabelValor1;
    private javax.swing.JTextField jTextFieldAlunos;
    private javax.swing.JTextField jTextFieldAlunos1;
    private javax.swing.JTextField jTextFieldAlunos2;
    private javax.swing.JTextField jTextFieldAlunos3;
    private javax.swing.JTextField jTextFieldDataPagamento;
    private javax.swing.JTextField jTextFieldDataPagamento1;
    private javax.swing.JTextField jTextFieldDataPagamento2;
    private javax.swing.JTextField jTextFieldDataPagamento3;
    private javax.swing.JTextField jTextFieldFormaPagamento;
    private javax.swing.JTextField jTextFieldFormaPagamento1;
    private javax.swing.JTextField jTextFieldFormaPagamento2;
    private javax.swing.JTextField jTextFieldFormaPagamento3;
    private javax.swing.JTextField jTextFieldTotalCartao1;
    private javax.swing.JTextField jTextFieldTotalDespesas;
    private javax.swing.JTextField jTextFieldTotalDinheiro;
    private javax.swing.JTextField jTextFieldTotalPix;
    private javax.swing.JTextField jTextFieldValor1;
    private javax.swing.JTextField jTextFieldValor2;
    private javax.swing.JTextField jTextFieldValor3;
    private javax.swing.JTextField jTextFieldValor4;
    // End of variables declaration//GEN-END:variables
}
