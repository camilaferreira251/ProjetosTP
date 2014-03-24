package RNA;



import RNA.Operador;
import javax.swing.JOptionPane;

public class JanelaTreinamento extends javax.swing.JDialog {

    JanelaPrincipal pai;

    public JanelaTreinamento(java.awt.Frame parent, boolean modal, JanelaPrincipal principal) {
        super(parent, modal);
        initComponents();
        pai = principal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jTextField2 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boxBias = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        seletorFuncao = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        seletorIntervalo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botaoTreinar = new javax.swing.JToggleButton();
        botaoVoltar = new javax.swing.JToggleButton();
        sliderTaxa = new javax.swing.JSlider();
        sliderMomento = new javax.swing.JSlider();
        boxIteracoes = new javax.swing.JTextField();
        boxErro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("Bias");

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0.#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField4ActionPerformed(evt);
            }
        });

        jTextField2.setText("jTextField1");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Taxa de Aprendizado");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Momento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Bias");

        boxBias.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Funcao");

        seletorFuncao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sigmoide", "Tangente Hiperbolica" }));
        seletorFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seletorFuncaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Intervalo");

        seletorIntervalo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0 a 1", "-1 a 1", "-1 a 0" }));
        seletorIntervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seletorIntervaloActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("Iterações");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Erro");

        botaoTreinar.setBackground(new java.awt.Color(0, 0, 0));
        botaoTreinar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoTreinar.setForeground(new java.awt.Color(0, 204, 255));
        botaoTreinar.setText("Treinar");
        botaoTreinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTreinarActionPerformed(evt);
            }
        });

        botaoVoltar.setBackground(new java.awt.Color(0, 0, 0));
        botaoVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(0, 204, 255));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        sliderTaxa.setBackground(new java.awt.Color(0, 0, 0));
        sliderTaxa.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        sliderTaxa.setForeground(new java.awt.Color(0, 204, 255));
        sliderTaxa.setMajorTickSpacing(20);
        sliderTaxa.setMinorTickSpacing(10);
        sliderTaxa.setPaintTicks(true);

        sliderMomento.setBackground(new java.awt.Color(0, 0, 0));
        sliderMomento.setMajorTickSpacing(20);
        sliderMomento.setMinorTickSpacing(10);
        sliderMomento.setPaintTicks(true);

        boxIteracoes.setText("15000");

        boxErro.setText("0.05");

        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setText("0");

        jLabel11.setForeground(new java.awt.Color(0, 204, 255));
        jLabel11.setText("0");

        jLabel13.setForeground(new java.awt.Color(0, 204, 255));
        jLabel13.setText("1");

        jLabel12.setForeground(new java.awt.Color(0, 204, 255));
        jLabel12.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seletorFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botaoTreinar)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sliderTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel13))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sliderMomento, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel12)))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(128, 128, 128)
                                .addComponent(boxBias))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(seletorIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boxErro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxIteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(botaoVoltar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1))
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel13)
                    .addComponent(sliderTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderMomento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel11))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(boxBias, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(seletorFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(seletorIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(boxIteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(boxErro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoTreinar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField4ActionPerformed

    private void botaoTreinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTreinarActionPerformed


        try {
            if (Double.parseDouble(boxErro.getText()) >= 0.1) {
                if (JOptionPane.showConfirmDialog(null, "Erro inserido relativamente alto. \nDeseja Continuar?", "Treinamento Finalizado!", 1) == 0) {
                    Operador.treinar((double) (sliderTaxa.getValue() / 100.0), (double) (sliderMomento.getValue() / 100.0), boxBias.isSelected() ? 1 : 0, seletorFuncao.getSelectedIndex(), seletorIntervalo.getSelectedIndex(), Integer.parseInt(boxIteracoes.getText()), Double.parseDouble(boxErro.getText()));
                    if (Operador.teste() >= 0) {
                        pai.getBotaoUtilizar().setEnabled(true);
                        pai.getBotaoUtilizar().setText("Utilizar");
                        pai.getTextoUtilizar().setText("");
                    } else {
                        pai.getBotaoUtilizar().setEnabled(false);
                        pai.getBotaoUtilizar().setText("*Utilizar");
                    }

                    JOptionPane.showMessageDialog(null, (Operador.teste() < 0 ? "Treinamento Falhou!" : ("Teste realizado para 86 entradas distintas. \nIterações realizadas: " + Operador.iteracoesFeitas + "\nErro mínimo alcançado: " + Operador.calcErro + "\nResultados incorretos: ") + Operador.teste()), "Treinamento Finalizado!", 1);
                    this.dispose();
                }
            } else {
                Operador.treinar((double) (sliderTaxa.getValue() / 100.0), (double) (sliderMomento.getValue() / 100.0), boxBias.isSelected() ? 1 : 0, seletorFuncao.getSelectedIndex(), seletorIntervalo.getSelectedIndex(), Integer.parseInt(boxIteracoes.getText()), Double.parseDouble(boxErro.getText()));
                if (Operador.teste() >= 0) {
                    pai.getBotaoUtilizar().setEnabled(true);
                    pai.getBotaoUtilizar().setText("Utilizar");
                    pai.getTextoUtilizar().setText("");
                } else {
                    pai.getBotaoUtilizar().setEnabled(false);
                    pai.getBotaoUtilizar().setText("*Utilizar");
                }

                JOptionPane.showMessageDialog(null, (Operador.teste() < 0 ? "Treinamento Falhou!" : ("Teste realizado para 86 entradas distintas. \nIterações realizadas: " + Operador.iteracoesFeitas + "\nErro mínimo alcançado: " + Operador.calcErro + "\nResultados incorretos: ") + Operador.teste()), "Treinamento Finalizado!", 1);
                this.dispose();
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_botaoTreinarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void seletorFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seletorFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seletorFuncaoActionPerformed

    private void seletorIntervaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seletorIntervaloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seletorIntervaloActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoTreinar;
    private javax.swing.JToggleButton botaoVoltar;
    private javax.swing.JCheckBox boxBias;
    private javax.swing.JTextField boxErro;
    private javax.swing.JTextField boxIteracoes;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox seletorFuncao;
    private javax.swing.JComboBox seletorIntervalo;
    private javax.swing.JSlider sliderMomento;
    private javax.swing.JSlider sliderTaxa;
    // End of variables declaration//GEN-END:variables
}
