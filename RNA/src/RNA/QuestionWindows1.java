/*Class QuestionWindow1 
 * RNA is free software: you can redistribute it and / or

     modify it under the terms of the GNU General Public License as

     published by the Free Software Foundation (FSF), version 2 of the

     License, or (at your option) any later version.

     This program is distributed in the hope that it will be useful,

     but WITHOUT ANY WARRANTY; without even the implied warranty of fitness for any

     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. View

     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License

     along with this program, if not, write to the Foundation of Software

     Free (FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA */

package RNA; 

import RNA.Operador;
import javax.swing.JOptionPane;

public class QuestionWindows1 extends javax.swing.JDialog {

    public QuestionWindows1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        simP12.setSelected(true);
        simP13.setSelected(true);
        simP14.setSelected(true);
        simP15.setSelected(true);
        simP16.setSelected(true);
        simP17.setSelected(true);
        simP18.setSelected(true);
        p19_1.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        simP17 = new javax.swing.JCheckBox();
        naoP17 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        simP18 = new javax.swing.JCheckBox();
        naoP18 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        p19_1 = new javax.swing.JCheckBox();
        p19_2 = new javax.swing.JCheckBox();
        p19_5 = new javax.swing.JCheckBox();
        p19_3 = new javax.swing.JCheckBox();
        p19_4 = new javax.swing.JCheckBox();
        p19_6 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        naoP12 = new javax.swing.JCheckBox();
        simP12 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        simP13 = new javax.swing.JCheckBox();
        naoP13 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        simP16 = new javax.swing.JCheckBox();
        naoP16 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        naoP14 = new javax.swing.JCheckBox();
        simP14 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        naoP15 = new javax.swing.JCheckBox();
        simP15 = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Questionário - Parte 2/2");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jToggleButton2.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(0, 204, 255));
        jToggleButton2.setText("Resultado");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2);
        jToggleButton2.setBounds(170, 390, 130, 31);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 204, 255));
        jLabel21.setText("que avaliem o estado do");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(80, 40, 170, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 255));
        jLabel12.setText("tronco cerebral?");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(110, 60, 120, 17);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 204, 255));
        jLabel20.setText("Passou por dois exames neurológicos");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(40, 20, 270, 17);

        simP17.setBackground(new java.awt.Color(0, 0, 0));
        simP17.setForeground(new java.awt.Color(0, 204, 255));
        simP17.setText("Sim");
        simP17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP17ActionPerformed(evt);
            }
        });
        jPanel1.add(simP17);
        simP17.setBounds(110, 90, 50, 23);

        naoP17.setBackground(new java.awt.Color(0, 0, 0));
        naoP17.setForeground(new java.awt.Color(0, 204, 255));
        naoP17.setText("Não");
        naoP17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP17ActionPerformed(evt);
            }
        });
        jPanel1.add(naoP17);
        naoP17.setBounds(170, 90, 50, 23);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 204, 255));
        jLabel22.setText("Submeteu-se a exame complementar");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(30, 120, 270, 17);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 204, 255));
        jLabel23.setText("que demonstre a morte ");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(80, 140, 170, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 255));
        jLabel13.setText("encefálica?");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(130, 160, 90, 20);

        simP18.setBackground(new java.awt.Color(0, 0, 0));
        simP18.setForeground(new java.awt.Color(0, 204, 255));
        simP18.setText("Sim");
        simP18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP18ActionPerformed(evt);
            }
        });
        jPanel1.add(simP18);
        simP18.setBounds(110, 190, 50, 23);

        naoP18.setBackground(new java.awt.Color(0, 0, 0));
        naoP18.setForeground(new java.awt.Color(0, 204, 255));
        naoP18.setText("Não");
        naoP18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP18ActionPerformed(evt);
            }
        });
        jPanel1.add(naoP18);
        naoP18.setBounds(170, 190, 50, 23);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 255));
        jLabel14.setText("Qual o tempo de retirada do órgão?");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(50, 220, 260, 17);

        p19_1.setBackground(new java.awt.Color(0, 0, 0));
        p19_1.setForeground(new java.awt.Color(0, 204, 255));
        p19_1.setText("Antes da PC e até 6h fora do corpo");
        p19_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p19_1ActionPerformed(evt);
            }
        });
        jPanel1.add(p19_1);
        p19_1.setBounds(30, 270, 260, 23);

        p19_2.setBackground(new java.awt.Color(0, 0, 0));
        p19_2.setForeground(new java.awt.Color(0, 204, 255));
        p19_2.setText("Antes da PC e até 24h fora do corpo");
        p19_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p19_2ActionPerformed(evt);
            }
        });
        jPanel1.add(p19_2);
        p19_2.setBounds(30, 290, 240, 23);

        p19_5.setBackground(new java.awt.Color(0, 0, 0));
        p19_5.setForeground(new java.awt.Color(0, 204, 255));
        p19_5.setText("Até 30m após PC e até 48h fora do corpo");
        p19_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p19_5ActionPerformed(evt);
            }
        });
        jPanel1.add(p19_5);
        p19_5.setBounds(30, 350, 280, 23);

        p19_3.setBackground(new java.awt.Color(0, 0, 0));
        p19_3.setForeground(new java.awt.Color(0, 204, 255));
        p19_3.setText("Até 6 h após PC e até 7 dias fora do corpo");
        p19_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p19_3ActionPerformed(evt);
            }
        });
        jPanel1.add(p19_3);
        p19_3.setBounds(30, 310, 270, 23);

        p19_4.setBackground(new java.awt.Color(0, 0, 0));
        p19_4.setForeground(new java.awt.Color(0, 204, 255));
        p19_4.setText("Até 6 h após PC e até 5 anos fora do corpo");
        p19_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p19_4ActionPerformed(evt);
            }
        });
        jPanel1.add(p19_4);
        p19_4.setBounds(30, 330, 290, 23);

        p19_6.setBackground(new java.awt.Color(0, 0, 0));
        p19_6.setForeground(new java.awt.Color(0, 204, 255));
        p19_6.setText("Doador vivo");
        p19_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p19_6ActionPerformed(evt);
            }
        });
        jPanel1.add(p19_6);
        p19_6.setBounds(30, 250, 270, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("*PC = Parada Cardíaca");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 370, 120, 14);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("ou doença degenerativa crônica?");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(50, 40, 230, 17);

        naoP12.setBackground(new java.awt.Color(0, 0, 0));
        naoP12.setForeground(new java.awt.Color(0, 204, 255));
        naoP12.setText("Não");
        naoP12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP12ActionPerformed(evt);
            }
        });
        jPanel2.add(naoP12);
        naoP12.setBounds(170, 60, 50, 23);

        simP12.setBackground(new java.awt.Color(0, 0, 0));
        simP12.setForeground(new java.awt.Color(0, 204, 255));
        simP12.setText("Sim");
        simP12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP12ActionPerformed(evt);
            }
        });
        jPanel2.add(simP12);
        simP12.setBounds(110, 60, 50, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Possui identificação e registro hospitalar?");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 160, 283, 17);

        simP13.setBackground(new java.awt.Color(0, 0, 0));
        simP13.setForeground(new java.awt.Color(0, 204, 255));
        simP13.setText("Sim");
        simP13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP13ActionPerformed(evt);
            }
        });
        jPanel2.add(simP13);
        simP13.setBounds(110, 120, 50, 23);

        naoP13.setBackground(new java.awt.Color(0, 0, 0));
        naoP13.setForeground(new java.awt.Color(0, 204, 255));
        naoP13.setText("Não");
        naoP13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP13ActionPerformed(evt);
            }
        });
        jPanel2.add(naoP13);
        naoP13.setBounds(170, 120, 50, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setText("Houve morte encefálica do doador?");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 90, 250, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 255));
        jLabel11.setText("do sistema nervoso central?");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(60, 320, 210, 17);

        simP16.setBackground(new java.awt.Color(0, 0, 0));
        simP16.setForeground(new java.awt.Color(0, 204, 255));
        simP16.setText("Sim");
        simP16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP16ActionPerformed(evt);
            }
        });
        jPanel2.add(simP16);
        simP16.setBounds(110, 340, 50, 23);

        naoP16.setBackground(new java.awt.Color(0, 0, 0));
        naoP16.setForeground(new java.awt.Color(0, 204, 255));
        naoP16.setText("Não");
        naoP16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP16ActionPerformed(evt);
            }
        });
        jPanel2.add(naoP16);
        naoP16.setBounds(170, 340, 50, 23);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 204, 255));
        jLabel17.setText("Doador Possui tumor maligno");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(60, 20, 230, 17);

        naoP14.setBackground(new java.awt.Color(0, 0, 0));
        naoP14.setForeground(new java.awt.Color(0, 204, 255));
        naoP14.setText("Não");
        naoP14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP14ActionPerformed(evt);
            }
        });
        jPanel2.add(naoP14);
        naoP14.setBounds(170, 190, 50, 23);

        simP14.setBackground(new java.awt.Color(0, 0, 0));
        simP14.setForeground(new java.awt.Color(0, 204, 255));
        simP14.setText("Sim");
        simP14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP14ActionPerformed(evt);
            }
        });
        jPanel2.add(simP14);
        simP14.setBounds(110, 190, 50, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 255));
        jLabel9.setText("Motivo da morte cerebral é conhecido?");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 220, 280, 17);

        naoP15.setBackground(new java.awt.Color(0, 0, 0));
        naoP15.setForeground(new java.awt.Color(0, 204, 255));
        naoP15.setText("Não");
        naoP15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP15ActionPerformed(evt);
            }
        });
        jPanel2.add(naoP15);
        naoP15.setBounds(170, 250, 50, 23);

        simP15.setBackground(new java.awt.Color(0, 0, 0));
        simP15.setForeground(new java.awt.Color(0, 204, 255));
        simP15.setText("Sim");
        simP15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP15ActionPerformed(evt);
            }
        });
        jPanel2.add(simP15);
        simP15.setBounds(110, 250, 50, 23);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 204, 255));
        jLabel18.setText("Apresenta hipotermia, hipotensão arterial");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(20, 280, 300, 17);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 255));
        jLabel19.setText("ou está sob efeito de drogas depressoras");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(20, 300, 300, 17);

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 204, 255));
        jToggleButton1.setText("Voltar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1);
        jToggleButton1.setBounds(20, 390, 130, 31);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.dispose();
        QuestionWindows janela = new QuestionWindows(new MainWindow(), true);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        Operador.entradas[11] = simP12.isSelected() ? 1 : 0;
        Operador.entradas[12] = simP13.isSelected() ? 1 : 0;
        Operador.entradas[13] = simP14.isSelected() ? 1 : 0;
        Operador.entradas[14] = simP15.isSelected() ? 1 : 0;
        Operador.entradas[15] = simP16.isSelected() ? 1 : 0;
        Operador.entradas[16] = simP17.isSelected() ? 1 : 0;
        Operador.entradas[17] = simP18.isSelected() ? 1 : 0;

        if (p19_1.isSelected()) {
            Operador.entradas[18] = 0.2;
        } else if (p19_2.isSelected()) {
            Operador.entradas[18] = 0.4;
        } else if (p19_3.isSelected()) {
            Operador.entradas[18] = 0.6;
        } else if (p19_4.isSelected()) {
            Operador.entradas[18] = 0.8;
        } else if (p19_5.isSelected()) {
            Operador.entradas[18] = 1.0;
        } else {
            Operador.entradas[18] = 0;
        }       
        
        JOptionPane.showMessageDialog(null, (Operador.operar()>0.5?"Órgão pode ser doado!!":"Órgão não pode ser doado!!"), "Resultado da Consulta", 1);
        this.dispose();
               
        
        
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void p19_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p19_1ActionPerformed
        p19_1.setSelected(true);
        p19_2.setSelected(false);
        p19_3.setSelected(false);
        p19_4.setSelected(false);
        p19_6.setSelected(false);    
        p19_5.setSelected(false);
// TODO add your handling code here:
    }//GEN-LAST:event_p19_1ActionPerformed

    private void simP12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP12ActionPerformed
        simP12.setSelected(true);
        naoP12.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP12ActionPerformed

    private void simP13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP13ActionPerformed
        simP13.setSelected(true);
        naoP13.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP13ActionPerformed

    private void simP14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP14ActionPerformed
        simP14.setSelected(true);
        naoP14.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP14ActionPerformed

    private void simP15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP15ActionPerformed
        simP15.setSelected(true);
        naoP15.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP15ActionPerformed

    private void simP16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP16ActionPerformed
        simP16.setSelected(true);
        naoP16.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP16ActionPerformed

    private void simP17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP17ActionPerformed
        simP17.setSelected(true);
        naoP17.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP17ActionPerformed

    private void simP18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP18ActionPerformed
        simP18.setSelected(true);
        naoP18.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP18ActionPerformed

    private void naoP12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP12ActionPerformed
        simP12.setSelected(false);
        naoP12.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_naoP12ActionPerformed

    private void naoP13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP13ActionPerformed
        simP13.setSelected(false);
        naoP13.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_naoP13ActionPerformed

    private void naoP14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP14ActionPerformed
        simP14.setSelected(false);
        naoP14.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_naoP14ActionPerformed

    private void naoP15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP15ActionPerformed
        simP15.setSelected(false);
        naoP15.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_naoP15ActionPerformed

    private void naoP16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP16ActionPerformed
        simP16.setSelected(false);
        naoP16.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_naoP16ActionPerformed

    private void naoP17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP17ActionPerformed
        simP17.setSelected(false);
        naoP17.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_naoP17ActionPerformed

    private void naoP18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP18ActionPerformed
        simP18.setSelected(false);
        naoP18.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_naoP18ActionPerformed

    private void p19_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p19_3ActionPerformed
        p19_1.setSelected(false);
        p19_2.setSelected(false);
        p19_3.setSelected(true);
        p19_4.setSelected(false);
        p19_5.setSelected(false);  
        p19_6.setSelected(false);    // TODO add your handling code here:
    }//GEN-LAST:event_p19_3ActionPerformed

    private void p19_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p19_2ActionPerformed
        p19_1.setSelected(false);
        p19_2.setSelected(true);
        p19_3.setSelected(false);
        p19_4.setSelected(false);
        p19_5.setSelected(false);    
        p19_6.setSelected(false);    // TODO add your handling code here:
    }//GEN-LAST:event_p19_2ActionPerformed

    private void p19_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p19_4ActionPerformed
        p19_1.setSelected(false);
        p19_6.setSelected(false);    
        p19_2.setSelected(false);
        p19_3.setSelected(false);
        p19_4.setSelected(true);
        p19_5.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_p19_4ActionPerformed

    private void p19_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p19_5ActionPerformed
        p19_1.setSelected(false);
        p19_2.setSelected(false);
        p19_3.setSelected(false);
        p19_6.setSelected(false);    
        p19_4.setSelected(false);
        p19_5.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_p19_5ActionPerformed

    private void p19_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p19_6ActionPerformed
                p19_1.setSelected(false);
        p19_2.setSelected(false);
        p19_3.setSelected(false);
        p19_4.setSelected(false);
        p19_5.setSelected(false);    
        p19_6.setSelected(true);    
        
    }//GEN-LAST:event_p19_6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JCheckBox naoP12;
    private javax.swing.JCheckBox naoP13;
    private javax.swing.JCheckBox naoP14;
    private javax.swing.JCheckBox naoP15;
    private javax.swing.JCheckBox naoP16;
    private javax.swing.JCheckBox naoP17;
    private javax.swing.JCheckBox naoP18;
    private javax.swing.JCheckBox p19_1;
    private javax.swing.JCheckBox p19_2;
    private javax.swing.JCheckBox p19_3;
    private javax.swing.JCheckBox p19_4;
    private javax.swing.JCheckBox p19_5;
    private javax.swing.JCheckBox p19_6;
    private javax.swing.JCheckBox simP12;
    private javax.swing.JCheckBox simP13;
    private javax.swing.JCheckBox simP14;
    private javax.swing.JCheckBox simP15;
    private javax.swing.JCheckBox simP16;
    private javax.swing.JCheckBox simP17;
    private javax.swing.JCheckBox simP18;
    // End of variables declaration//GEN-END:variables
}
