/*Class QuestionWindow 
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

import RNA.Operator;

/**
 *
 * @author Marcos
 */
public class QuestionWindows extends javax.swing.JDialog {

    public QuestionWindows(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        simP1.setSelected(true);
        simP2.setSelected(true);
        simP4.setSelected(true);
        simP5.setSelected(true);
        simP6.setSelected(true);
        simP7.setSelected(true);
        simP8.setSelected(true);
        simP9.setSelected(true);
        simP10.setSelected(true);
        simP11.setSelected(true);
        p3figado.setSelected(true);
        p3corneas.setSelected(false);
        p3coracao.setSelected(false);
        p3pulmao.setSelected(false);
        p3ossos.setSelected(false);
        p3medula.setSelected(false);
        p3rins.setSelected(false);
        p3pele.setSelected(false);
        p3valvula.setSelected(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        naoP6 = new javax.swing.JCheckBox();
        simP6 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        simP7 = new javax.swing.JCheckBox();
        naoP7 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        simP10 = new javax.swing.JCheckBox();
        naoP10 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        simP11 = new javax.swing.JCheckBox();
        naoP11 = new javax.swing.JCheckBox();
        naoP8 = new javax.swing.JCheckBox();
        simP8 = new javax.swing.JCheckBox();
        simP9 = new javax.swing.JCheckBox();
        naoP9 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        naoP1 = new javax.swing.JCheckBox();
        simP1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        simP2 = new javax.swing.JCheckBox();
        naoP2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        p3figado = new javax.swing.JCheckBox();
        p3pulmao = new javax.swing.JCheckBox();
        p3corneas = new javax.swing.JCheckBox();
        p3ossos = new javax.swing.JCheckBox();
        p3coracao = new javax.swing.JCheckBox();
        p3medula = new javax.swing.JCheckBox();
        p3valvula = new javax.swing.JCheckBox();
        p3pele = new javax.swing.JCheckBox();
        p3rins = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        simP4 = new javax.swing.JCheckBox();
        naoP4 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        simP5 = new javax.swing.JCheckBox();
        naoP5 = new javax.swing.JCheckBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        p3pancreas = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("RNA/InternationalizationQuestionWindow"); // NOI18N
        setTitle(bundle.getString("QUESTIONÁRIO - PARTE 1/2")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText(bundle.getString("DOADOR MAIOR DE IDADE OU COM AUTORIZAÇÃO?")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 330, 20);

        naoP6.setBackground(new java.awt.Color(0, 0, 0));
        naoP6.setForeground(new java.awt.Color(0, 204, 255));
        naoP6.setText(bundle.getString("NÃO")); // NOI18N
        naoP6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP6ActionPerformed(evt);
            }
        });
        jPanel1.add(naoP6);
        naoP6.setBounds(170, 50, 50, 23);

        simP6.setBackground(new java.awt.Color(0, 0, 0));
        simP6.setForeground(new java.awt.Color(0, 204, 255));
        simP6.setText(bundle.getString("SIM")); // NOI18N
        simP6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP6ActionPerformed(evt);
            }
        });
        jPanel1.add(simP6);
        simP6.setBounds(90, 50, 50, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText(bundle.getString("DOADOR COMPATÍVEL?")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 160, 150, 17);

        simP7.setBackground(new java.awt.Color(0, 0, 0));
        simP7.setForeground(new java.awt.Color(0, 204, 255));
        simP7.setText(bundle.getString("SIM")); // NOI18N
        simP7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP7ActionPerformed(evt);
            }
        });
        jPanel1.add(simP7);
        simP7.setBounds(90, 130, 50, 23);

        naoP7.setBackground(new java.awt.Color(0, 0, 0));
        naoP7.setForeground(new java.awt.Color(0, 204, 255));
        naoP7.setText(bundle.getString("NÃO")); // NOI18N
        naoP7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP7ActionPerformed(evt);
            }
        });
        jPanel1.add(naoP7);
        naoP7.setBounds(170, 130, 50, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText(bundle.getString("OU AUTORIZAÇÃO JUDICIAL?")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 100, 170, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText(bundle.getString("PARENTESCO ATÉ 4º GRAU, CONJUGUE")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 80, 240, 20);

        simP10.setBackground(new java.awt.Color(0, 0, 0));
        simP10.setForeground(new java.awt.Color(0, 204, 255));
        simP10.setText(bundle.getString("SIM")); // NOI18N
        simP10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP10ActionPerformed(evt);
            }
        });
        jPanel1.add(simP10);
        simP10.setBounds(90, 330, 50, 23);

        naoP10.setBackground(new java.awt.Color(0, 0, 0));
        naoP10.setForeground(new java.awt.Color(0, 204, 255));
        naoP10.setText(bundle.getString("NÃO")); // NOI18N
        naoP10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP10ActionPerformed(evt);
            }
        });
        jPanel1.add(naoP10);
        naoP10.setBounds(170, 330, 50, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText(bundle.getString("INSUFICIÊNCIA DE MÚLTIPLOS ÓRGÃOS?")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 390, 230, 17);

        simP11.setBackground(new java.awt.Color(0, 0, 0));
        simP11.setForeground(new java.awt.Color(0, 204, 255));
        simP11.setText(bundle.getString("SIM")); // NOI18N
        simP11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP11ActionPerformed(evt);
            }
        });
        jPanel1.add(simP11);
        simP11.setBounds(90, 410, 50, 23);

        naoP11.setBackground(new java.awt.Color(0, 0, 0));
        naoP11.setForeground(new java.awt.Color(0, 204, 255));
        naoP11.setText(bundle.getString("NÃO")); // NOI18N
        naoP11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP11ActionPerformed(evt);
            }
        });
        jPanel1.add(naoP11);
        naoP11.setBounds(170, 410, 50, 23);

        naoP8.setBackground(new java.awt.Color(0, 0, 0));
        naoP8.setForeground(new java.awt.Color(0, 204, 255));
        naoP8.setText(bundle.getString("NÃO")); // NOI18N
        naoP8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP8ActionPerformed(evt);
            }
        });
        jPanel1.add(naoP8);
        naoP8.setBounds(170, 190, 50, 23);

        simP8.setBackground(new java.awt.Color(0, 0, 0));
        simP8.setForeground(new java.awt.Color(0, 204, 255));
        simP8.setText(bundle.getString("SIM")); // NOI18N
        simP8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP8ActionPerformed(evt);
            }
        });
        jPanel1.add(simP8);
        simP8.setBounds(90, 190, 50, 23);

        simP9.setBackground(new java.awt.Color(0, 0, 0));
        simP9.setForeground(new java.awt.Color(0, 204, 255));
        simP9.setText(bundle.getString("SIM")); // NOI18N
        simP9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP9ActionPerformed(evt);
            }
        });
        jPanel1.add(simP9);
        simP9.setBounds(90, 270, 50, 23);

        naoP9.setBackground(new java.awt.Color(0, 0, 0));
        naoP9.setForeground(new java.awt.Color(0, 204, 255));
        naoP9.setText(bundle.getString("NÃO")); // NOI18N
        naoP9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP9ActionPerformed(evt);
            }
        });
        jPanel1.add(naoP9);
        naoP9.setBounds(170, 270, 50, 23);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 255));
        jLabel13.setText(bundle.getString("POSSUI ALGUMA DOENÇA QUE AFETA ")); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 220, 240, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 255));
        jLabel14.setText(bundle.getString("O ÓRGÃO EM QUESTÃO?")); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(70, 240, 170, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 255));
        jLabel16.setText(bundle.getString("POSSUI ALGUMA DOENÇA CONTAGIOSA?")); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(40, 300, 240, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 255));
        jLabel15.setText(bundle.getString("POSSUI INFECÇÃO GENERALIZADA OU ")); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(50, 370, 230, 17);

        jToggleButton2.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(0, 204, 255));
        jToggleButton2.setText(bundle.getString("AVANÇAR")); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2);
        jToggleButton2.setBounds(181, 470, 130, 31);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText(bundle.getString("O DOADOR ESTÁ VIVO?")); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(80, 20, 138, 17);

        naoP1.setBackground(new java.awt.Color(0, 0, 0));
        naoP1.setForeground(new java.awt.Color(0, 204, 255));
        naoP1.setText(bundle.getString("NÃO")); // NOI18N
        naoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP1ActionPerformed(evt);
            }
        });
        jPanel2.add(naoP1);
        naoP1.setBounds(170, 50, 50, 23);

        simP1.setBackground(new java.awt.Color(0, 0, 0));
        simP1.setForeground(new java.awt.Color(0, 204, 255));
        simP1.setText(bundle.getString("SIM")); // NOI18N
        simP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP1ActionPerformed(evt);
            }
        });
        jPanel2.add(simP1);
        simP1.setBounds(90, 50, 50, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText(bundle.getString("QUAL ÓRGÃO DESEJA DOAR?")); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(80, 160, 180, 17);

        simP2.setBackground(new java.awt.Color(0, 0, 0));
        simP2.setForeground(new java.awt.Color(0, 204, 255));
        simP2.setText(bundle.getString("SIM")); // NOI18N
        simP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP2ActionPerformed(evt);
            }
        });
        jPanel2.add(simP2);
        simP2.setBounds(90, 130, 50, 23);

        naoP2.setBackground(new java.awt.Color(0, 0, 0));
        naoP2.setForeground(new java.awt.Color(0, 204, 255));
        naoP2.setText(bundle.getString("NÃO")); // NOI18N
        naoP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP2ActionPerformed(evt);
            }
        });
        jPanel2.add(naoP2);
        naoP2.setBounds(170, 130, 50, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 255));
        jLabel9.setText(bundle.getString("SANIDADE MENTAL?")); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(90, 100, 130, 20);

        p3figado.setBackground(new java.awt.Color(0, 0, 0));
        p3figado.setForeground(new java.awt.Color(0, 204, 255));
        p3figado.setText(bundle.getString("FÍGADO")); // NOI18N
        p3figado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3figadoActionPerformed(evt);
            }
        });
        jPanel2.add(p3figado);
        p3figado.setBounds(50, 200, 70, 23);

        p3pulmao.setBackground(new java.awt.Color(0, 0, 0));
        p3pulmao.setForeground(new java.awt.Color(0, 204, 255));
        p3pulmao.setText(bundle.getString("PULMÃO")); // NOI18N
        p3pulmao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3pulmaoActionPerformed(evt);
            }
        });
        jPanel2.add(p3pulmao);
        p3pulmao.setBounds(130, 200, 70, 23);

        p3corneas.setBackground(new java.awt.Color(0, 0, 0));
        p3corneas.setForeground(new java.awt.Color(0, 204, 255));
        p3corneas.setText(bundle.getString("CÓRNEAS")); // NOI18N
        p3corneas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3corneasActionPerformed(evt);
            }
        });
        jPanel2.add(p3corneas);
        p3corneas.setBounds(50, 230, 70, 23);

        p3ossos.setBackground(new java.awt.Color(0, 0, 0));
        p3ossos.setForeground(new java.awt.Color(0, 204, 255));
        p3ossos.setText(bundle.getString("OSSOS")); // NOI18N
        p3ossos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ossosActionPerformed(evt);
            }
        });
        jPanel2.add(p3ossos);
        p3ossos.setBounds(130, 230, 70, 23);

        p3coracao.setBackground(new java.awt.Color(0, 0, 0));
        p3coracao.setForeground(new java.awt.Color(0, 204, 255));
        p3coracao.setText(bundle.getString("CORAÇÃO")); // NOI18N
        p3coracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3coracaoActionPerformed(evt);
            }
        });
        jPanel2.add(p3coracao);
        p3coracao.setBounds(50, 260, 70, 23);

        p3medula.setBackground(new java.awt.Color(0, 0, 0));
        p3medula.setForeground(new java.awt.Color(0, 204, 255));
        p3medula.setText(bundle.getString("MEDULA ÓSSEA")); // NOI18N
        p3medula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3medulaActionPerformed(evt);
            }
        });
        jPanel2.add(p3medula);
        p3medula.setBounds(130, 290, 120, 23);

        p3valvula.setBackground(new java.awt.Color(0, 0, 0));
        p3valvula.setForeground(new java.awt.Color(0, 204, 255));
        p3valvula.setText(bundle.getString("VALV. CARDÍACA")); // NOI18N
        p3valvula.setToolTipText("");
        p3valvula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3valvulaActionPerformed(evt);
            }
        });
        jPanel2.add(p3valvula);
        p3valvula.setBounds(210, 260, 100, 23);

        p3pele.setBackground(new java.awt.Color(0, 0, 0));
        p3pele.setForeground(new java.awt.Color(0, 204, 255));
        p3pele.setText(bundle.getString("PELE")); // NOI18N
        p3pele.setToolTipText("");
        p3pele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3peleActionPerformed(evt);
            }
        });
        jPanel2.add(p3pele);
        p3pele.setBounds(210, 230, 50, 23);

        p3rins.setBackground(new java.awt.Color(0, 0, 0));
        p3rins.setForeground(new java.awt.Color(0, 204, 255));
        p3rins.setText(bundle.getString("RINS")); // NOI18N
        p3rins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3rinsActionPerformed(evt);
            }
        });
        jPanel2.add(p3rins);
        p3rins.setBounds(210, 200, 50, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setText(bundle.getString("SE ENCONTRA EM PERFEITA ")); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(70, 80, 170, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 255));
        jLabel11.setText(bundle.getString("É GESTANTE?")); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(110, 320, 90, 17);

        simP4.setBackground(new java.awt.Color(0, 0, 0));
        simP4.setForeground(new java.awt.Color(0, 204, 255));
        simP4.setText(bundle.getString("SIM")); // NOI18N
        simP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP4ActionPerformed(evt);
            }
        });
        jPanel2.add(simP4);
        simP4.setBounds(90, 350, 50, 23);

        naoP4.setBackground(new java.awt.Color(0, 0, 0));
        naoP4.setForeground(new java.awt.Color(0, 204, 255));
        naoP4.setText(bundle.getString("NÃO")); // NOI18N
        naoP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP4ActionPerformed(evt);
            }
        });
        jPanel2.add(naoP4);
        naoP4.setBounds(170, 350, 50, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 255));
        jLabel12.setText(bundle.getString("OFERECE RISCO AO FETO?")); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(80, 380, 160, 17);

        simP5.setBackground(new java.awt.Color(0, 0, 0));
        simP5.setForeground(new java.awt.Color(0, 204, 255));
        simP5.setText(bundle.getString("SIM")); // NOI18N
        simP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simP5ActionPerformed(evt);
            }
        });
        jPanel2.add(simP5);
        simP5.setBounds(90, 410, 50, 23);

        naoP5.setBackground(new java.awt.Color(0, 0, 0));
        naoP5.setForeground(new java.awt.Color(0, 204, 255));
        naoP5.setText(bundle.getString("NÃO")); // NOI18N
        naoP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoP5ActionPerformed(evt);
            }
        });
        jPanel2.add(naoP5);
        naoP5.setBounds(170, 410, 50, 23);

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 204, 255));
        jToggleButton1.setText(bundle.getString("MENU")); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1);
        jToggleButton1.setBounds(20, 470, 130, 31);

        p3pancreas.setBackground(new java.awt.Color(0, 0, 0));
        p3pancreas.setForeground(new java.awt.Color(0, 204, 255));
        p3pancreas.setText(bundle.getString("PÂNCREAS")); // NOI18N
        p3pancreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3pancreasActionPerformed(evt);
            }
        });
        jPanel2.add(p3pancreas);
        p3pancreas.setBounds(130, 260, 80, 23);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p3figadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3figadoActionPerformed
        p3figado.setSelected(true);
        p3corneas.setSelected(false);
        p3coracao.setSelected(false);
        p3pulmao.setSelected(false);
        p3ossos.setSelected(false);
        p3medula.setSelected(false);
        p3rins.setSelected(false);
        p3pele.setSelected(false);
        p3valvula.setSelected(false);        // TODO add your handling code here:
        p3pancreas.setSelected(false);

    }//GEN-LAST:event_p3figadoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        Operator.inputs[0] = simP1.isSelected() ? 1 : 0;
        Operator.inputs[1] = simP2.isSelected() ? 1 : 0;
        Operator.inputs[3] = simP4.isSelected() ? 1 : 0;
        Operator.inputs[4] = simP5.isSelected() ? 1 : 0;
        Operator.inputs[5] = simP6.isSelected() ? 1 : 0;
        Operator.inputs[6] = simP7.isSelected() ? 1 : 0;
        Operator.inputs[7] = simP8.isSelected() ? 1 : 0;
        Operator.inputs[8] = simP9.isSelected() ? 1 : 0;
        Operator.inputs[9] = simP10.isSelected() ? 1 : 0;
        Operator.inputs[10] = simP11.isSelected() ? 1 : 0;

        if (p3figado.isSelected()) {
            Operator.inputs[2] = 0.89;
        } else if (p3corneas.isSelected()) {
            Operator.inputs[2] = 0.44;
        } else if (p3coracao.isSelected()) {
            Operator.inputs[2] = 0.11;
        } else if (p3pulmao.isSelected()) {
            Operator.inputs[2] = 0.78;
        } else if (p3ossos.isSelected()) {
            Operator.inputs[2] = 0.22;
        } else if (p3medula.isSelected()) {
            Operator.inputs[2] = 1;
        } else if (p3rins.isSelected()) {
            Operator.inputs[2] = 0.67;
        } else if (p3pele.isSelected()) {
            Operator.inputs[2] = 0;
        } else if (p3pancreas.isSelected()) {
            Operator.inputs[2] = 0.56;
        } else{
            Operator.inputs[2] = 0.33;
        }

        this.dispose();
       QuestionWindows1 janela = new QuestionWindows1(new MainWindow(), true);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.setVisible(true);

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void simP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP2ActionPerformed
        simP2.setSelected(true);
        naoP2.setSelected(false);

    }//GEN-LAST:event_simP2ActionPerformed

    private void simP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP1ActionPerformed
        simP1.setSelected(true);
        naoP1.setSelected(false);
    }//GEN-LAST:event_simP1ActionPerformed

    private void simP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP4ActionPerformed
        simP4.setSelected(true);
        naoP4.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP4ActionPerformed

    private void simP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP5ActionPerformed
        simP5.setSelected(true);
        naoP5.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP5ActionPerformed

    private void simP6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP6ActionPerformed
        simP6.setSelected(true);
        naoP6.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP6ActionPerformed

    private void simP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP7ActionPerformed
        simP7.setSelected(true);
        naoP7.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP7ActionPerformed

    private void simP8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP8ActionPerformed
        simP8.setSelected(true);
        naoP8.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP8ActionPerformed

    private void simP9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP9ActionPerformed
        simP9.setSelected(true);
        naoP9.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP9ActionPerformed

    private void simP10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP10ActionPerformed
        simP10.setSelected(true);
        naoP10.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP10ActionPerformed

    private void simP11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simP11ActionPerformed
        simP11.setSelected(true);
        naoP11.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_simP11ActionPerformed

    private void naoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP1ActionPerformed
        simP1.setSelected(false);
        naoP1.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_naoP1ActionPerformed

    private void naoP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP2ActionPerformed
        simP2.setSelected(false);
        naoP2.setSelected(true);          // TODO add your handling code here:
    }//GEN-LAST:event_naoP2ActionPerformed

    private void naoP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP4ActionPerformed
        simP4.setSelected(false);
        naoP4.setSelected(true);          // TODO add your handling code here:
    }//GEN-LAST:event_naoP4ActionPerformed

    private void naoP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP5ActionPerformed
        simP5.setSelected(false);
        naoP5.setSelected(true);          // TODO add your handling code here:
    }//GEN-LAST:event_naoP5ActionPerformed

    private void naoP6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP6ActionPerformed
        simP6.setSelected(false);
        naoP6.setSelected(true);          // TODO add your handling code here:
    }//GEN-LAST:event_naoP6ActionPerformed

    private void naoP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP7ActionPerformed
        simP7.setSelected(false);
        naoP7.setSelected(true);          // TODO add your handling code here:
    }//GEN-LAST:event_naoP7ActionPerformed

    private void naoP8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP8ActionPerformed
        simP8.setSelected(false);
        naoP8.setSelected(true);          // TODO add your handling code here:
    }//GEN-LAST:event_naoP8ActionPerformed

    private void naoP9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP9ActionPerformed
        simP9.setSelected(false);
        naoP9.setSelected(true);          // TODO add your handling code here:
    }//GEN-LAST:event_naoP9ActionPerformed

    private void naoP10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP10ActionPerformed
        simP10.setSelected(false);
        naoP10.setSelected(true);          // TODO add your handling code here:
    }//GEN-LAST:event_naoP10ActionPerformed

    private void naoP11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoP11ActionPerformed
        simP11.setSelected(false);
        naoP11.setSelected(true);          // TODO add your handling code here:
    }//GEN-LAST:event_naoP11ActionPerformed

    private void p3corneasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3corneasActionPerformed
        p3figado.setSelected(false);
        p3corneas.setSelected(true);
        p3coracao.setSelected(false);
        p3pulmao.setSelected(false);
        p3ossos.setSelected(false);
        p3medula.setSelected(false);
        p3rins.setSelected(false);
        p3pele.setSelected(false);
        p3valvula.setSelected(false);
        p3pancreas.setSelected(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_p3corneasActionPerformed

    private void p3coracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3coracaoActionPerformed
        p3figado.setSelected(false);
        p3corneas.setSelected(false);
        p3coracao.setSelected(true);
        p3pulmao.setSelected(false);
        p3ossos.setSelected(false);
        p3medula.setSelected(false);
        p3rins.setSelected(false);
        p3pele.setSelected(false);
        p3valvula.setSelected(false); 
        p3pancreas.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_p3coracaoActionPerformed

    private void p3pulmaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3pulmaoActionPerformed
        p3figado.setSelected(false);
        p3corneas.setSelected(false);
        p3coracao.setSelected(false);
        p3pulmao.setSelected(true);
        p3ossos.setSelected(false);
        p3medula.setSelected(false);
        p3rins.setSelected(false);
        p3pele.setSelected(false);
        p3valvula.setSelected(false);  
        p3pancreas.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_p3pulmaoActionPerformed

    private void p3ossosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ossosActionPerformed
        p3figado.setSelected(false);
        p3corneas.setSelected(false);
        p3coracao.setSelected(false);
        p3pulmao.setSelected(false);
        p3ossos.setSelected(true);
        p3medula.setSelected(false);
        p3rins.setSelected(false);
        p3pele.setSelected(false);
        p3valvula.setSelected(false);   
        p3pancreas.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_p3ossosActionPerformed

    private void p3medulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3medulaActionPerformed
        p3figado.setSelected(false);
        p3corneas.setSelected(false);
        p3coracao.setSelected(false);
        p3pulmao.setSelected(false);
        p3ossos.setSelected(false);
        p3medula.setSelected(true);
        p3rins.setSelected(false);
        p3pele.setSelected(false);
        p3valvula.setSelected(false);   
        p3pancreas.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_p3medulaActionPerformed

    private void p3rinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3rinsActionPerformed
        p3figado.setSelected(false);
        p3corneas.setSelected(false);
        p3coracao.setSelected(false);
        p3pulmao.setSelected(false);
        p3ossos.setSelected(false);
        p3medula.setSelected(false);
        p3rins.setSelected(true);
        p3pele.setSelected(false);
        p3valvula.setSelected(false); 
        p3pancreas.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_p3rinsActionPerformed

    private void p3peleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3peleActionPerformed
        p3figado.setSelected(false);
        p3corneas.setSelected(false);
        p3coracao.setSelected(false);
        p3pulmao.setSelected(false);
        p3ossos.setSelected(false);
        p3medula.setSelected(false);
        p3rins.setSelected(false);
        p3pancreas.setSelected(false);
        p3pele.setSelected(true);
        p3valvula.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_p3peleActionPerformed

    private void p3valvulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3valvulaActionPerformed
        p3figado.setSelected(false);
        p3corneas.setSelected(false);
        p3coracao.setSelected(false);
        p3pulmao.setSelected(false);
        p3ossos.setSelected(false);
        p3pancreas.setSelected(false);
        p3medula.setSelected(false);
        p3rins.setSelected(false);
        p3pele.setSelected(false);
        p3valvula.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_p3valvulaActionPerformed

    private void p3pancreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3pancreasActionPerformed
               p3figado.setSelected(false);
        p3corneas.setSelected(false);
        p3coracao.setSelected(false);
        p3pulmao.setSelected(false);
        p3ossos.setSelected(false);
        p3medula.setSelected(false);
        p3rins.setSelected(false);
        p3pele.setSelected(false);
        p3valvula.setSelected(false);
        p3pancreas.setSelected(true);
    }//GEN-LAST:event_p3pancreasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JCheckBox naoP1;
    private javax.swing.JCheckBox naoP10;
    private javax.swing.JCheckBox naoP11;
    private javax.swing.JCheckBox naoP2;
    private javax.swing.JCheckBox naoP4;
    private javax.swing.JCheckBox naoP5;
    private javax.swing.JCheckBox naoP6;
    private javax.swing.JCheckBox naoP7;
    private javax.swing.JCheckBox naoP8;
    private javax.swing.JCheckBox naoP9;
    private javax.swing.JCheckBox p3coracao;
    private javax.swing.JCheckBox p3corneas;
    private javax.swing.JCheckBox p3figado;
    private javax.swing.JCheckBox p3medula;
    private javax.swing.JCheckBox p3ossos;
    private javax.swing.JCheckBox p3pancreas;
    private javax.swing.JCheckBox p3pele;
    private javax.swing.JCheckBox p3pulmao;
    private javax.swing.JCheckBox p3rins;
    private javax.swing.JCheckBox p3valvula;
    private javax.swing.JCheckBox simP1;
    private javax.swing.JCheckBox simP10;
    private javax.swing.JCheckBox simP11;
    private javax.swing.JCheckBox simP2;
    private javax.swing.JCheckBox simP4;
    private javax.swing.JCheckBox simP5;
    private javax.swing.JCheckBox simP6;
    private javax.swing.JCheckBox simP7;
    private javax.swing.JCheckBox simP8;
    private javax.swing.JCheckBox simP9;
    // End of variables declaration//GEN-END:variables
}
