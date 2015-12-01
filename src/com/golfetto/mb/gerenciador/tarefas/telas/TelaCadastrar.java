package com.golfetto.mb.gerenciador.tarefas.telas;

import com.golfetto.mb.gerenciador.tarefas.classes.Tarefa;
import com.golfetto.mb.gerenciador.tarefas.telas.TelaPrincipal;
import com.golfetto.mb.gerenciador.tarefas.utils.Utils;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import static java.util.Collections.list;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class TelaCadastrar extends javax.swing.JFrame {
    private Object tblTarefas;

    public TelaCadastrar() {
        initComponents();
        
    }
    
    public int prioridade = 0;

    public MaskFormatter Mascara(String Mascara) {
        //função para colocar uma mascara de data no txtPrazo
        MaskFormatter F_Mascara = new MaskFormatter();
        try {
            F_Mascara.setMask(Mascara); //Atribui a mascara  
            F_Mascara.setPlaceholderCharacter(' '); //Caracter para preencimento   
        } catch (Exception excecao) {
            excecao.printStackTrace();
        }
        return F_Mascara;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rdBaixa = new javax.swing.JRadioButton();
        rdMedia = new javax.swing.JRadioButton();
        rdAlta = new javax.swing.JRadioButton();
        cbConcluida = new javax.swing.JCheckBox();
        btnInserir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPrazo = new javax.swing.JFormattedTextField(Mascara("##/##/####"));
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel1.setText("Tarefa:");

        jLabel2.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel2.setText("Descrição (Opicional):");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel3.setText("Prazo");

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel4.setText("Prioridade");

        rdBaixa.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        rdBaixa.setText("Baixa");
        rdBaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBaixaActionPerformed(evt);
            }
        });

        rdMedia.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        rdMedia.setText("Media");
        rdMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMediaActionPerformed(evt);
            }
        });

        rdAlta.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        rdAlta.setText("Alta");
        rdAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdAltaActionPerformed(evt);
            }
        });

        cbConcluida.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        cbConcluida.setText("Concluida");
        cbConcluida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConcluidaActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel5.setText("Uma produção Guillherme Golfetto");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(txtNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbConcluida)
                            .addComponent(rdAlta)
                            .addComponent(rdMedia)
                            .addComponent(rdBaixa)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtPrazo))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdAlta)
                .addGap(18, 18, 18)
                .addComponent(cbConcluida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void rdAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdAltaActionPerformed
        prioridade = 3;
    }//GEN-LAST:event_rdAltaActionPerformed

    private void cbConcluidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConcluidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbConcluidaActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        /*Inicialização dos Objetos necessarios*/
        XStream xstream = new XStream(new DomDriver());
        xstream.autodetectAnnotations(true);
        Tarefa t = new Tarefa();
        Utils u = new Utils();
        /*Povoando a tarefa pelo Form*/
        t.setNome(txtNome.getText());
        t.setDescricao(txtDescricao.getText());
        t.setPrazo(txtPrazo.getText());
        switch (prioridade) {
            case 1:
                t.setPrioridade("Baixa");
                break;
            case 2:
                t.setPrioridade("Media");
                break;
            case 3:
                t.setPrioridade("Alta");
                break;
            default:
                t.setPrioridade("Baixa");
        }
        t.setConcluida(cbConcluida.isEnabled() ? "Sim" : "Não");
        
        list.add(t);
        
        /*Serializando em XML*/
        String xml = xstream.toXML(list);

        /*salvando em .xml*/
        try {
            u.gravar(xml);
            JOptionPane.showMessageDialog(null, "Tarefa Salva com Sucesso");            
            //atualizar a tabela.
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Tarefa");
        }

    }//GEN-LAST:event_btnInserirActionPerformed

    private void rdBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBaixaActionPerformed
        prioridade = 1;
    }//GEN-LAST:event_rdBaixaActionPerformed

    private void rdMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMediaActionPerformed
        prioridade = 2;
    }//GEN-LAST:event_rdMediaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JCheckBox cbConcluida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdAlta;
    private javax.swing.JRadioButton rdBaixa;
    private javax.swing.JRadioButton rdMedia;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPrazo;
    // End of variables declaration//GEN-END:variables
}
