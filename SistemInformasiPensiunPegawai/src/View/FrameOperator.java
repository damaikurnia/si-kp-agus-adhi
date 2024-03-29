/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameOperator.java
 *
 * Created on Jun 19, 2013, 10:50:56 AM
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author a9uszT
 */
public class FrameOperator extends javax.swing.JFrame {

    /** Creates new form FrameOperator */
    public FrameOperator() {
        initComponents();
        Clock clock = new Clock();
        clock.showDigitalClock(time);
        disabledButton();
        kode_op.setVisible(false);
    }

    private void disabledButton() {
        buttonEditPeg.setVisible(false);
        buttonHpsPeg.setVisible(false);
        buttonTmbhPeg.setVisible(false);
        buttonSearch.setVisible(false);
    }

    private void enabledButton() {
        buttonEditPeg.setVisible(true);
        buttonHpsPeg.setVisible(true);
        buttonTmbhPeg.setVisible(true);
        buttonSearch.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama_operator = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pegawai_button = new javax.swing.JButton();
        Pensiun_Button = new javax.swing.JButton();
        keluar_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        buttonTmbhPeg = new javax.swing.JButton();
        buttonEditPeg = new javax.swing.JButton();
        buttonHpsPeg = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        kode_op = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIcture/header2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 180));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time.setFont(new java.awt.Font("Tahoma", 1, 14));
        time.setText("time");
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setText("Selamat Datang,");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        nama_operator.setFont(new java.awt.Font("Tahoma", 0, 18));
        nama_operator.setText("nama");
        jPanel3.add(nama_operator, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 51, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pegawai_button.setFont(new java.awt.Font("Tahoma", 1, 12));
        pegawai_button.setText("PEGAWAI");
        pegawai_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegawai_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(pegawai_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 184, 37));

        Pensiun_Button.setFont(new java.awt.Font("Tahoma", 1, 12));
        Pensiun_Button.setText("PENSIUN");
        Pensiun_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pensiun_ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(Pensiun_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 184, 37));

        keluar_button.setFont(new java.awt.Font("Tahoma", 1, 12));
        keluar_button.setText("Keluar");
        keluar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(keluar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 184, 37));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIcture/wall1.jpg"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 200));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 360, 220));

        jPanel5.setBackground(new java.awt.Color(153, 51, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonTmbhPeg.setFont(new java.awt.Font("Tahoma", 1, 12));
        buttonTmbhPeg.setText("Tambah Pegawai");
        buttonTmbhPeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTmbhPegActionPerformed(evt);
            }
        });
        jPanel5.add(buttonTmbhPeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 184, 37));

        buttonEditPeg.setFont(new java.awt.Font("Tahoma", 1, 12));
        buttonEditPeg.setText("Edit Pegawai");
        buttonEditPeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditPegActionPerformed(evt);
            }
        });
        jPanel5.add(buttonEditPeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 184, 37));

        buttonHpsPeg.setFont(new java.awt.Font("Tahoma", 1, 12));
        buttonHpsPeg.setText("Hapus Pegawai");
        buttonHpsPeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHpsPegActionPerformed(evt);
            }
        });
        jPanel5.add(buttonHpsPeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 184, 37));

        buttonSearch.setFont(new java.awt.Font("Tahoma", 1, 12));
        buttonSearch.setText("Pencarian Pegawai");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        jPanel5.add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 184, 37));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIcture/wall1.jpg"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 230));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 350, 250));

        kode_op.setFont(new java.awt.Font("Tahoma", 0, 10));
        kode_op.setForeground(new java.awt.Color(255, 255, 255));
        kode_op.setText("id");
        kode_op.setEnabled(false);
        jPanel3.add(kode_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 22));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIcture/wall2.jpg"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, 340));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 870, 360));

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void pegawai_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegawai_buttonActionPerformed
        buttonTmbhPeg.setText("Tambah Pegawai");
        enabledButton();
        // TODO add your handling code here:
    }//GEN-LAST:event_pegawai_buttonActionPerformed

    private void Pensiun_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pensiun_ButtonActionPerformed
        disabledButton();
        buttonTmbhPeg.setText("Proses Pensiun");
        buttonTmbhPeg.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_Pensiun_ButtonActionPerformed

    private void keluar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_buttonActionPerformed
        int status = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin keluar", "Konfirmasi keluar",
                JOptionPane.OK_CANCEL_OPTION);
        if (status == 0) {
            HomeUtama Home=new HomeUtama();
            Home.setVisible(true);
            this.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_keluar_buttonActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        PencarianPegawai search = new PencarianPegawai();
        this.dispose();
        search.dataOperator(nama_operator.getText(), kode_op.getText());
        search.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonTmbhPegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTmbhPegActionPerformed
        if (buttonTmbhPeg.getText().startsWith("P")) {
            this.dispose();
            ProsesPensiun PP = new ProsesPensiun();
            PP.dataOperator(nama_operator.getText(), kode_op.getText());
            PP.setVisible(true);
        } else if (buttonTmbhPeg.getText().startsWith("T")) {
            this.dispose();
            TambahPegawai tmbhPeg = new TambahPegawai();
            tmbhPeg.isiNama(nama_operator.getText(), kode_op.getText());
            tmbhPeg.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTmbhPegActionPerformed

    private void buttonEditPegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditPegActionPerformed
//        PencarianPegawai pen = new PencarianPegawai("Edit Pegawai");
        PencarianPegawai pen = new PencarianPegawai();
        pen.dataOperator(nama_operator.getText(), kode_op.getText());
        pen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonEditPegActionPerformed

    private void buttonHpsPegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHpsPegActionPerformed
        HapusDataPegawai HDP = new HapusDataPegawai();
        HDP.dataOperatorEditPegawai(nama_operator.getText(), kode_op.getText());
        HDP.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHpsPegActionPerformed
    public void dataOperator(String nama, String id) {
        nama_operator.setText(nama);
        kode_op.setText(id);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrameOperator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pensiun_Button;
    private javax.swing.JButton buttonEditPeg;
    private javax.swing.JButton buttonHpsPeg;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonTmbhPeg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton keluar_button;
    private javax.swing.JLabel kode_op;
    private javax.swing.JLabel nama_operator;
    private javax.swing.JButton pegawai_button;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
