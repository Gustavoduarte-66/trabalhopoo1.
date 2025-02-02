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
public class AdicionarDespesasView extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalView
     */
    public AdicionarDespesasView() {
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

        jLabelAdicionardespesas = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelFornecedor = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        jLabelTipo = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldNomeCompleto = new javax.swing.JTextField();
        jTextFieldFornecedor = new javax.swing.JTextField();
        jTextFieldDataVencimento = new javax.swing.JTextField();
        jLabelFormaPagamento = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabelDataVencimento1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelImagemFundoTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAdicionardespesas.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        jLabelAdicionardespesas.setText("Adicionar Despesas");
        getContentPane().add(jLabelAdicionardespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

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

        jButtonCancelar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 720, 150, 50));

        jLabelFornecedor.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelFornecedor.setText("Fornecedor");
        getContentPane().add(jLabelFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 130, -1));
        getContentPane().add(jTextFieldTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 240, 30));

        jLabelTipo.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelTipo.setText("Tipo");
        getContentPane().add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 60, -1));

        jLabelDescricao.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelDescricao.setText("Descrição");
        getContentPane().add(jLabelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 280, -1));
        getContentPane().add(jTextFieldNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 560, 30));
        getContentPane().add(jTextFieldFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 280, 30));
        getContentPane().add(jTextFieldDataVencimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 100, 30));

        jLabelFormaPagamento.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelFormaPagamento.setText("Forma de pagamento");
        getContentPane().add(jLabelFormaPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 250, -1));

        jButtonSalvar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSalvar.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 720, 150, 50));

        jLabelValor.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelValor.setText("Valor");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 90, -1));
        getContentPane().add(jTextFieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 100, 30));

        jLabelDataVencimento1.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelDataVencimento1.setText("Data de vencimento");
        getContentPane().add(jLabelDataVencimento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 210, -1));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Pix", "Cartão" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 170, 30));

        jLabelImagemFundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/abstract-silhouette-bodybuilder-gym-logo-white-background-bodybuilder-training-vector-illustration-abstract-silhouette-139642649.jpg"))); // NOI18N
        getContentPane().add(jLabelImagemFundoTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        MenuPrincipalView telaMenuPrincipal = new MenuPrincipalView();
        telaMenuPrincipal.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        JOptionPane.showMessageDialog(null,"Operação cancelada!!");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        JOptionPane.showMessageDialog(null,"Despesa adicionada com sucesso!");
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarDespesasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarDespesasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarDespesasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarDespesasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarDespesasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelAdicionardespesas;
    private javax.swing.JLabel jLabelDataVencimento1;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelFormaPagamento;
    private javax.swing.JLabel jLabelFornecedor;
    private javax.swing.JLabel jLabelImagemFundoTela;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JTextField jTextFieldDataVencimento;
    private javax.swing.JTextField jTextFieldFornecedor;
    private javax.swing.JTextField jTextFieldNomeCompleto;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
