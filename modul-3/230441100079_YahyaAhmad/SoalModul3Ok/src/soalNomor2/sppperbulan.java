/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package soalNomor2;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class sppperbulan extends javax.swing.JFrame {

    /**
     * Creates new form sppperbulan
     */
    Icon iconSukses = new javax.swing.ImageIcon(getClass().getResource("sukses.png"));
    Icon iconClose = new javax.swing.ImageIcon(getClass().getResource("close.png"));
    Icon iconWarning = new javax.swing.ImageIcon(getClass().getResource("warning.png"));
    public sppperbulan() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        roundedPanel1 = new soalmodul3ok.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roundedPanel2 = new soalmodul3ok.RoundedPanel();
        roundedPanel3 = new soalmodul3ok.RoundedPanel();
        roundedPanel4 = new soalmodul3ok.RoundedPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        januari = new javax.swing.JRadioButton();
        februari = new javax.swing.JRadioButton();
        maret = new javax.swing.JRadioButton();
        april = new javax.swing.JRadioButton();
        mei = new javax.swing.JRadioButton();
        juni = new javax.swing.JRadioButton();
        juli = new javax.swing.JRadioButton();
        agustus = new javax.swing.JRadioButton();
        september = new javax.swing.JRadioButton();
        oktober = new javax.swing.JRadioButton();
        november = new javax.swing.JRadioButton();
        desember = new javax.swing.JRadioButton();
        jmlspp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(56, 75, 112));
        jPanel1.setForeground(new java.awt.Color(56, 75, 112));
        jPanel1.setLayout(new java.awt.BorderLayout());

        roundedPanel1.setForeground(new java.awt.Color(252, 250, 238));
        roundedPanel1.setRoundBottomRight(75);
        roundedPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Poppins Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 75, 112));
        jLabel1.setText("SPP \"SEKOLAH MAJU JAYA, MUNDUR TIDAK MUNGKIN\"");
        roundedPanel1.add(jLabel1, new java.awt.GridBagConstraints());

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 75, 112));
        jLabel2.setText("Jl. Pademangan Timur VIII GG D RT 016/RW 010 Pademangan Timur Jakarta Utara");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        roundedPanel1.add(jLabel2, gridBagConstraints);

        jPanel1.add(roundedPanel1, java.awt.BorderLayout.PAGE_START);

        roundedPanel2.setBackground(new java.awt.Color(56, 75, 112));
        roundedPanel2.setForeground(new java.awt.Color(56, 75, 112));

        roundedPanel3.setForeground(new java.awt.Color(252, 250, 238));
        roundedPanel3.setRoundBottomLeft(75);
        roundedPanel3.setRoundBottomRight(75);
        roundedPanel3.setRoundTopLeft(75);
        roundedPanel3.setRoundTopRight(75);

        roundedPanel4.setForeground(new java.awt.Color(60, 61, 55));
        roundedPanel4.setRoundBottomLeft(75);
        roundedPanel4.setRoundBottomRight(75);
        roundedPanel4.setRoundTopLeft(75);
        roundedPanel4.setRoundTopRight(75);

        jLabel6.setFont(new java.awt.Font("Futura", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hasil Perhitungan SPP");
        roundedPanel4.add(jLabel6);

        jScrollPane1.setFont(new java.awt.Font("Futura Bk BT", 0, 8)); // NOI18N

        jTable1.setBackground(new java.awt.Color(252, 250, 238));
        jTable1.setFont(new java.awt.Font("Futura Bk BT", 0, 10)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 31, 63));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Status", "Hutang", "Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Ags", "Sep", "Okt", "Nov", "Des"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        roundedPanel4.add(jScrollPane1);

        jLabel3.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 75, 112));
        jLabel3.setText("Masukkan Nama");

        jLabel4.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(56, 75, 112));
        jLabel4.setText("Pilih Bulan Bayar SPP");

        jLabel5.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 75, 112));
        jLabel5.setText("Masukkan Jumlah SPP");

        jButton1.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        jButton1.setText("Kirim");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        januari.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        januari.setForeground(new java.awt.Color(56, 75, 112));
        januari.setText("Januari");
        januari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                januariActionPerformed(evt);
            }
        });

        februari.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        februari.setForeground(new java.awt.Color(56, 75, 112));
        februari.setText("Februari");
        februari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                februariActionPerformed(evt);
            }
        });

        maret.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        maret.setForeground(new java.awt.Color(56, 75, 112));
        maret.setText("Maret");
        maret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maretActionPerformed(evt);
            }
        });

        april.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        april.setForeground(new java.awt.Color(56, 75, 112));
        april.setText("April");
        april.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprilActionPerformed(evt);
            }
        });

        mei.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        mei.setForeground(new java.awt.Color(56, 75, 112));
        mei.setText("Mei");
        mei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meiActionPerformed(evt);
            }
        });

        juni.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        juni.setForeground(new java.awt.Color(56, 75, 112));
        juni.setText("Juni");
        juni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juniActionPerformed(evt);
            }
        });

        juli.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        juli.setForeground(new java.awt.Color(56, 75, 112));
        juli.setText("Juli");
        juli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juliActionPerformed(evt);
            }
        });

        agustus.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        agustus.setForeground(new java.awt.Color(56, 75, 112));
        agustus.setText("Agustus");
        agustus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agustusActionPerformed(evt);
            }
        });

        september.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        september.setForeground(new java.awt.Color(56, 75, 112));
        september.setText("September");
        september.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                septemberActionPerformed(evt);
            }
        });

        oktober.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        oktober.setForeground(new java.awt.Color(56, 75, 112));
        oktober.setText("Oktober");
        oktober.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oktoberActionPerformed(evt);
            }
        });

        november.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        november.setForeground(new java.awt.Color(56, 75, 112));
        november.setText("November");
        november.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novemberActionPerformed(evt);
            }
        });

        desember.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        desember.setForeground(new java.awt.Color(56, 75, 112));
        desember.setText("Desember");
        desember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desemberActionPerformed(evt);
            }
        });

        jmlspp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlsppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel3Layout.createSequentialGroup()
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton1))
                    .addGroup(roundedPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundedPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)
                                .addComponent(nama))
                            .addGroup(roundedPanel3Layout.createSequentialGroup()
                                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(roundedPanel3Layout.createSequentialGroup()
                                        .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(januari)
                                            .addComponent(februari)
                                            .addComponent(maret)
                                            .addComponent(april)
                                            .addComponent(mei)
                                            .addComponent(juni))
                                        .addGap(55, 55, 55)
                                        .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(desember)
                                            .addComponent(november)
                                            .addComponent(oktober)
                                            .addComponent(september)
                                            .addComponent(agustus)
                                            .addComponent(juli))))
                                .addGap(0, 188, Short.MAX_VALUE))
                            .addGroup(roundedPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jmlspp)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(januari)
                    .addComponent(juli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(februari)
                    .addComponent(agustus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maret)
                    .addComponent(september))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(april)
                    .addComponent(oktober))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mei)
                    .addComponent(november))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(juni)
                    .addComponent(desember))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jmlspp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(47, 47, 47))
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundedPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(roundedPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(roundedPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(roundedPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(nama.getText().isEmpty() && jmlspp.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Isi Dulu Bro", "Warning!", JOptionPane.WARNING_MESSAGE, iconWarning);
        }
        if(!januari.isSelected() && !februari.isSelected() && !maret.isSelected() && !april.isSelected() 
                && !mei.isSelected() &&!juni.isSelected() && !juli.isSelected() && !agustus.isSelected() 
                && !september.isSelected() && !oktober.isSelected() && !november.isSelected() && !desember.isSelected()) {
            JOptionPane.showMessageDialog(this, "Pilih dulu mau bayar yang mana", "Warning!", JOptionPane.WARNING_MESSAGE, iconWarning);
        }
        try{
            DefaultTableModel untuktable = (DefaultTableModel) jTable1.getModel();
            String name = nama.getText();
            String Status = "Nunggak";
            int utang = 0;
            int sppbulannya = Integer.parseInt(jmlspp.getText());
            
            int untuksemuabulan = 0;
            
        if (januari.isSelected()) {
            untuksemuabulan++;
        }
        
        if (februari.isSelected()) {
            untuksemuabulan++;
        }
        
        if (maret.isSelected()) {
            untuksemuabulan++;
        }
        
        if (april.isSelected()){
            untuksemuabulan++;
        }
        
        if (mei.isSelected()){
            untuksemuabulan++;
        }
        
        if (juni.isSelected()){
            untuksemuabulan++;
        }
        if (juli.isSelected()){
            untuksemuabulan++;
        }
        if (agustus.isSelected()){
            untuksemuabulan++;
        }
        
        if (september.isSelected()){
            untuksemuabulan++;
        }
        if (oktober.isSelected()){
            untuksemuabulan++;
        }
        if (november.isSelected()){
            untuksemuabulan++;
        }
        if (desember.isSelected()){
            untuksemuabulan++;
        }
        
        if (untuksemuabulan == 12) {
            Status = "lunas";
        }
        utang = sppbulannya * (12 - untuksemuabulan);
        
        Object[] rowData = new Object[15];
        rowData[0] = name;
        rowData[1] = Status;
        rowData[2] = utang;
        rowData[3] = januari.isSelected();
        rowData[4] = februari.isSelected();
        rowData[5] = maret.isSelected();
        rowData[6] = april.isSelected();
        rowData[7] = mei.isSelected();
        rowData[8] = juni.isSelected();
        rowData[9] = juli.isSelected();
        rowData[10] = agustus.isSelected();
        rowData[11] = september.isSelected();
        rowData[12] = oktober.isSelected();
        rowData[13] = november.isSelected();
        rowData[14] = desember.isSelected();
        
        untuktable.addRow(rowData);
        
        nama.setText("");
        jmlspp.setText("");
        januari.setSelected(false);
        februari.setSelected(false);
        maret.setSelected(false);
        april.setSelected(false);
        mei.setSelected(false);
        juni.setSelected(false);
        juli.setSelected(false);
        agustus.setSelected(false);
        september.setSelected(false);
        oktober.setSelected(false);
        november.setSelected(false);
        desember.setSelected(false);
            
        JOptionPane.showMessageDialog(this, "Data Berhasil Ditambah", "Message", JOptionPane.WARNING_MESSAGE, iconSukses);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Masukkan SPP Dalam bentuk angka", "Warning!", JOptionPane.WARNING_MESSAGE, iconWarning);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void januariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_januariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_januariActionPerformed

    private void februariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_februariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_februariActionPerformed

    private void maretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maretActionPerformed

    private void aprilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aprilActionPerformed

    private void meiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meiActionPerformed

    private void juniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juniActionPerformed

    private void juliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juliActionPerformed

    private void agustusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agustusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agustusActionPerformed

    private void septemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_septemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_septemberActionPerformed

    private void oktoberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oktoberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oktoberActionPerformed

    private void novemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novemberActionPerformed

    private void desemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desemberActionPerformed

    private void jmlsppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlsppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmlsppActionPerformed

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
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            UIManager.put( "Button.arc", 999 );
            UIManager.put( "TextComponent.arc", 999 );
            UIManager.put( "CheckBox.arc", 999 );
            UIManager.put( "ComboBox.arc", 999 );
            UIManager.put( "Panel.arc", 999 );
            UIManager.put( "Label.arc", 999 );
            }

        catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sppperbulan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton agustus;
    private javax.swing.JRadioButton april;
    private javax.swing.JRadioButton desember;
    private javax.swing.JRadioButton februari;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton januari;
    private javax.swing.JTextField jmlspp;
    private javax.swing.JRadioButton juli;
    private javax.swing.JRadioButton juni;
    private javax.swing.JRadioButton maret;
    private javax.swing.JRadioButton mei;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton november;
    private javax.swing.JRadioButton oktober;
    private soalmodul3ok.RoundedPanel roundedPanel1;
    private soalmodul3ok.RoundedPanel roundedPanel2;
    private soalmodul3ok.RoundedPanel roundedPanel3;
    private soalmodul3ok.RoundedPanel roundedPanel4;
    private javax.swing.JRadioButton september;
    // End of variables declaration//GEN-END:variables
}
