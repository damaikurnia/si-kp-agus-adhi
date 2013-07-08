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

import Controller.ConnMySql;
import Controller.ControlData;
import Model.Operator;
import java.sql.Connection;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

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
        jButton3 = new javax.swing.JButton();
        keluar_button = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        buttonTmbhPeg = new javax.swing.JButton();
        buttonEditPeg = new javax.swing.JButton();
        buttonHpsPeg = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        kode_op = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Subversion\\SistemInformasiPensiunPegawai\\picture\\header2.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 180));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        time.setFont(new java.awt.Font("Tahoma", 1, 14));
        time.setText("time");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setText("Selamat Datang,");

        nama_operator.setFont(new java.awt.Font("Tahoma", 0, 18));
        nama_operator.setText("nama");

        pegawai_button.setText("PEGAWAI");
        pegawai_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegawai_buttonActionPerformed(evt);
            }
        });

        Pensiun_Button.setText("PENSIUN");
        Pensiun_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pensiun_ButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Cetak");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        keluar_button.setText("Keluar");
        keluar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(keluar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pegawai_button, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pensiun_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pegawai_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pensiun_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(keluar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        buttonTmbhPeg.setText("Tambah Pegawai");
        buttonTmbhPeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTmbhPegActionPerformed(evt);
            }
        });

        buttonEditPeg.setText("edit Pegawai");

        buttonHpsPeg.setText("Hapus Pegawai");

        buttonSearch.setText("Pencarian Pegawai");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHpsPeg, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTmbhPeg, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditPeg, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(buttonTmbhPeg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEditPeg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonHpsPeg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        kode_op.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        kode_op.setForeground(new java.awt.Color(255, 255, 255));
        kode_op.setText("id");
        kode_op.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(kode_op)
                        .addGap(285, 285, 285)
                        .addComponent(jLabel2))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nama_operator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                        .addComponent(time))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(time)
                            .addComponent(nama_operator, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(kode_op, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Connection kon = null;
            String reportSource = "";
            try {
                kon = ConnMySql.getConnections();
            } catch (Exception ex) {
//                Logger.getLogger(FrameOperator.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "terjadi gagal koneksi ke Database \n Coba cek koneksi ke Database");
            }
            reportSource = "./Cetak/CoverBUP.jasper";
            Map<String, Object> params = new HashMap<String, Object>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, params, kon);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void keluar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_buttonActionPerformed
        int status = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin keluar", "Konfirmasi keluar",
                JOptionPane.OK_CANCEL_OPTION);
        if (status == 0) {
            System.exit(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_keluar_buttonActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonTmbhPegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTmbhPegActionPerformed
        if (buttonTmbhPeg.getText().startsWith("P")) {
            this.dispose();
            ProsesPensiun PP = new ProsesPensiun();
            PP.setVisible(true);
        } else if (buttonTmbhPeg.getText().startsWith("T")) {
            this.dispose();
            TambahPegawai tmbhPeg = new TambahPegawai();
            tmbhPeg.isiNama(nama_operator.getText(),kode_op.getText());
            tmbhPeg.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTmbhPegActionPerformed
    public void dataOperator(String nama,String id) {
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
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
