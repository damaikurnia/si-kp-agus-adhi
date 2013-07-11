/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProsesPensiun.java
 *
 * Created on Jun 23, 2013, 9:15:37 PM
 */
package View;

import Controller.ConnMySql;
import Controller.ControlData;
import Model.Operator;
import Model.PNS;
import TableModel.DataProsesPensiunTableModel;
import TableModel.RataTengah;
import java.awt.Color;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellRenderer;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author a9uszT
 */
public class ProsesPensiun extends javax.swing.JFrame {

    public RataTengah tengah = new RataTengah();

    /** Creates new form ProsesPensiun */
    public ProsesPensiun() {

        initComponents();
        Clock clock = new Clock();
        clock.showDigitalClock(time);
        jenis_label.setVisible(false);
        combo_jenisPensiun.setVisible(false);
        tabel_cari.getColumnModel().getColumn(1).setCellRenderer(tengah);
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
        jPanel4 = new javax.swing.JPanel();
        jenis_label = new javax.swing.JLabel();
        nip_TF = new javax.swing.JTextField();
        button_proses = new javax.swing.JButton();
        combo_jenisPensiun = new javax.swing.JComboBox();
        nip_br1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_cari = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        P_Kode_Label = new javax.swing.JLabel();
        P_Nama_Label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time.setFont(new java.awt.Font("Tahoma", 1, 14));
        time.setText("time");
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jenis_label.setFont(new java.awt.Font("Tahoma", 1, 14));
        jenis_label.setText("Pilih Jenis Pensiun");
        jPanel4.add(jenis_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, 30));

        nip_TF.setFont(new java.awt.Font("Tahoma", 0, 12));
        nip_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nip_TFKeyReleased(evt);
            }
        });
        jPanel4.add(nip_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 310, -1));

        button_proses.setText("Proses");
        button_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_prosesActionPerformed(evt);
            }
        });
        jPanel4.add(button_proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        combo_jenisPensiun.setFont(new java.awt.Font("Tahoma", 1, 14));
        combo_jenisPensiun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Jenis--", "B U P", "A P S", "Janda / Duda" }));
        combo_jenisPensiun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_jenisPensiunActionPerformed(evt);
            }
        });
        jPanel4.add(combo_jenisPensiun, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 230, -1));

        nip_br1.setFont(new java.awt.Font("Tahoma", 1, 14));
        nip_br1.setText("Masukan NIP");
        jPanel4.add(nip_br1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel2.setText("Data Pegawai yang diproses");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        tabel_cari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "N I P", "NAMA"
            }
        ));
        jScrollPane1.setViewportView(tabel_cari);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 520, 60));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 540, 290));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18));
        jLabel3.setText("Proses Pensiun Pegawai");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        exit_button.setText("Keluar");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });
        jPanel3.add(exit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, -1, -1));

        jLabel5.setText("Selamat Datang,");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        P_Kode_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P_Kode_Label.setText("Kode");
        jPanel3.add(P_Kode_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 10, -1));

        P_Nama_Label.setText("Nama");
        jPanel3.add(P_Nama_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, -1));

        jLabel8.setText("-");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 870, 400));

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void button_prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_prosesActionPerformed
        try {
            tabel_cari.setVisible(true);
            if (nip_TF.getDocument().getLength() == 0) {
                JOptionPane.showMessageDialog(rootPane, "NIP masih Kosong");
                nip_TF.requestFocus();
                nip_TF.setBackground(Color.pink);
            } else if (nip_TF.getDocument().getLength() < 18) {
                JOptionPane.showMessageDialog(rootPane, "NIP tidak lengkap");
                nip_TF.requestFocus();
                nip_TF.setBackground(Color.pink);
            } else if (nip_TF.getDocument().getLength() > 18) {
                JOptionPane.showMessageDialog(rootPane, "NIP terlalu panjang");
                nip_TF.requestFocus();
                nip_TF.setBackground(Color.pink);
            } else {
                List<PNS> search = ControlData.getKoneksi().SearchPNS(nip_TF.getText());
                if (search.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "data Pegawai tidak ditemukan");
                } else {
                    DataProsesPensiunTableModel dataPensiun = new DataProsesPensiunTableModel(search);
                    tabel_cari.setModel(dataPensiun);
                    int option = JOptionPane.showConfirmDialog(rootPane, "Data ditemukan apakah akan proses \n NIP " + nip_TF.getText(), "tanya", JOptionPane.OK_CANCEL_OPTION);
                    if (option == 0) {
                        jenis_label.setVisible(true);
                        combo_jenisPensiun.setVisible(true);
                        button_proses.setEnabled(false);
                        nip_TF.setEditable(false);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(rootPane, "Tidak dapat koneksi ke Database \n"
                    + "cek settingan dahulu");
        }

        // TODO add your handling code here:
}//GEN-LAST:event_button_prosesActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
//       System.out.println(P_Nama_Label.getText().toUpperCase());
        int status = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin keluar", "Konfirmasi keluar",
                JOptionPane.OK_CANCEL_OPTION);
        if (status == 0) {
            this.dispose();
            FrameOperator FO = new FrameOperator();
            FO.dataOperator(P_Nama_Label.getText(), P_Kode_Label.getText());
            FO.setVisible(true);

        }
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void combo_jenisPensiunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_jenisPensiunActionPerformed
        String kat = (String) combo_jenisPensiun.getSelectedItem();
        if (kat.matches("B U P")) {
            // try {
            try {
                boolean status = ControlData.getKoneksi().StatusGuru(nip_TF.getText());
                int age = ControlData.getKoneksi().cek_BUP(nip_TF.getText());
                if (status == true) {
                    if (age >= 59) {
                        cetakBUP(nip_TF.getText());
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "umur dibawah batas BUP", "", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    if (age >= 55) {
                        cetakBUP(nip_TF.getText());
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "umur dibawah batas BUP", "", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } catch (Exception ex) {
                //Logger.getLogger(ProsesPensiun.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
            }
        } else if (kat.matches("A P S")) {
            cetakAPS(nip_TF.getText());
        }
    }//GEN-LAST:event_combo_jenisPensiunActionPerformed

    private void nip_TFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nip_TFKeyReleased
        inputAngka(nip_TF.getText());
        nip_TF.setBackground(Color.white);
    }//GEN-LAST:event_nip_TFKeyReleased
    private JasperPrint multipageLinking(JasperPrint page1, JasperPrint page2) {
        List<JRPrintPage> pages = page2.getPages();
        for (int count = 0; count < pages.size(); count++) {
            page1.addPage(pages.get(count));
        }
        return page1;
    }

    private void inputAngka(String angka) {
        if (!angka.matches("[0-9]*")) {
            JOptionPane.showMessageDialog(rootPane, "masukan angka", "peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void isiNIP(String id) {
        nip_TF.setText(id);
        nip_TF.setEnabled(false);
    }

    public void dataOperator(String nama, String id) {
        P_Nama_Label.setText(nama);
        P_Kode_Label.setText(id);
    }

    private void cetakBUP(String nip) {
        Connection kon = null;
        try {
            if (kon == null) {
                JOptionPane.showMessageDialog(rootPane, "cek koneksi database", "", JOptionPane.WARNING_MESSAGE);
            } else {
                kon = ConnMySql.getConnections();
                Map reportparametermap1 = new HashMap();

                reportparametermap1.put("NIP", nip);
                String reportSource = "./Cetak/CoverBUP.jasper";
                String reportSource2 = "./Cetak/Surat_keterangan.jasper";
                String reportSource3 = "./Cetak/Badan_Administrasi.jasper";
                String reportSource4 = "./Cetak/SP-4A.jasper";
                String reportSource5 = "./Cetak/Surat_keterangan.jasper";
                String reportSource6 = "./Cetak/Surat_keterangan_tidak_kena_hukuman.jasper";
                String reportSource7 = "./Cetak/Surat_permohonan_berhenti.jasper";
                String reportSource8 = "./Cetak/Surat_usul_permohonan.jasper";
                String reportSource9 = "./Cetak/Daftar-Susunan_keluarga.jasper";


                JasperPrint firstjasperprint = new JasperPrint();
                firstjasperprint = JasperFillManager.fillReport(reportSource, reportparametermap1, kon);

                JasperPrint secondjasperprint = new JasperPrint();
                secondjasperprint = JasperFillManager.fillReport(reportSource2, reportparametermap1, kon);

//            JasperPrint thirdjasperprint = new JasperPrint();
//            thirdjasperprint = JasperFillManager.fillReport(reportSource3, reportparametermap1, kon);

                JasperPrint fourthjasperprint = new JasperPrint();
                fourthjasperprint = JasperFillManager.fillReport(reportSource4, reportparametermap1, kon);

                JasperPrint fifthjasperprint = new JasperPrint();
                fifthjasperprint = JasperFillManager.fillReport(reportSource5, reportparametermap1, kon);

                JasperPrint sixthjasperprint = new JasperPrint();
                sixthjasperprint = JasperFillManager.fillReport(reportSource6, reportparametermap1, kon);

                JasperPrint seventhjasperprint = new JasperPrint();
                seventhjasperprint = JasperFillManager.fillReport(reportSource7, reportparametermap1, kon);
                JasperPrint eighthjasperprint = new JasperPrint();
                eighthjasperprint = JasperFillManager.fillReport(reportSource8, reportparametermap1, kon);

                JasperPrint ninethjasperprint = new JasperPrint();
                ninethjasperprint = JasperFillManager.fillReport(reportSource9, reportparametermap1, kon);

                JasperPrint firstsecondlinked = multipageLinking(firstjasperprint, secondjasperprint);
//            JasperPrint firstsecondthirdlinked = multipageLinking(firstsecondlinked, thirdjasperprint);
                //JasperPrint fourthlinked = multipageLinking(firstsecondthirdlinked, fourthjasperprint);
                JasperPrint fourthlinked = multipageLinking(firstsecondlinked, fourthjasperprint);
                JasperPrint fifthLinked = multipageLinking(fourthlinked, fifthjasperprint);
                JasperPrint sixthLinked = multipageLinking(fifthLinked, sixthjasperprint);
                JasperPrint seventhLinked = multipageLinking(sixthLinked, seventhjasperprint);
                JasperPrint eighthLinked = multipageLinking(seventhLinked, eighthjasperprint);
                JasperPrint ninethLinked = multipageLinking(eighthLinked, ninethjasperprint);

                JasperViewer.viewReport(ninethLinked, false);

                Map<String, Object> params = new HashMap<String, Object>();
                params.put("NIP", nip);
                JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource3, params, kon);
                JasperViewer.viewReport(jasperPrint, false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void cetakAPS(String nip) {
        Connection kon = null;
        try {
            kon = ConnMySql.getConnections();
            Map reportparametermap1 = new HashMap();

            reportparametermap1.put("NIP", nip);
            String reportSource = "./Cetak/CoverAPS.jasper";
            String reportSource2 = "./Cetak/Surat_keterangan.jasper";
            String reportSource3 = "./Cetak/Badan_Administrasi.jasper";
            String reportSource4 = "./Cetak/SP-4A.jasper";
            String reportSource5 = "./Cetak/Surat_keterangan.jasper";
            String reportSource6 = "./Cetak/Surat_keterangan_tidak_kena_hukuman.jasper";
            String reportSource7 = "./Cetak/Surat_permohonan_berhenti_APS.jasper";
            String reportSource8 = "./Cetak/Surat_usul_permohonan_APS.jasper";
            String reportSource9 = "./Cetak/Daftar-Susunan_keluarga.jasper";


            JasperPrint firstjasperprint = new JasperPrint();
            firstjasperprint = JasperFillManager.fillReport(reportSource, reportparametermap1, kon);

            JasperPrint secondjasperprint = new JasperPrint();
            secondjasperprint = JasperFillManager.fillReport(reportSource2, reportparametermap1, kon);

//            JasperPrint thirdjasperprint = new JasperPrint();
//            thirdjasperprint = JasperFillManager.fillReport(reportSource3, reportparametermap1, kon);

            JasperPrint fourthjasperprint = new JasperPrint();
            fourthjasperprint = JasperFillManager.fillReport(reportSource4, reportparametermap1, kon);

            JasperPrint fifthjasperprint = new JasperPrint();
            fifthjasperprint = JasperFillManager.fillReport(reportSource5, reportparametermap1, kon);

            JasperPrint sixthjasperprint = new JasperPrint();
            sixthjasperprint = JasperFillManager.fillReport(reportSource6, reportparametermap1, kon);

            JasperPrint seventhjasperprint = new JasperPrint();
            seventhjasperprint = JasperFillManager.fillReport(reportSource7, reportparametermap1, kon);
            JasperPrint eighthjasperprint = new JasperPrint();
            eighthjasperprint = JasperFillManager.fillReport(reportSource8, reportparametermap1, kon);

            JasperPrint ninethjasperprint = new JasperPrint();
            ninethjasperprint = JasperFillManager.fillReport(reportSource9, reportparametermap1, kon);

            JasperPrint firstsecondlinked = multipageLinking(firstjasperprint, secondjasperprint);
//            JasperPrint firstsecondthirdlinked = multipageLinking(firstsecondlinked, thirdjasperprint);
            //JasperPrint fourthlinked = multipageLinking(firstsecondthirdlinked, fourthjasperprint);
            JasperPrint fourthlinked = multipageLinking(firstsecondlinked, fourthjasperprint);
            JasperPrint fifthLinked = multipageLinking(fourthlinked, fifthjasperprint);
            JasperPrint sixthLinked = multipageLinking(fifthLinked, sixthjasperprint);
            JasperPrint seventhLinked = multipageLinking(sixthLinked, seventhjasperprint);
            JasperPrint eighthLinked = multipageLinking(seventhLinked, eighthjasperprint);
            JasperPrint ninethLinked = multipageLinking(eighthLinked, ninethjasperprint);

            JasperViewer.viewReport(ninethLinked, false);

            Map<String, Object> params = new HashMap<String, Object>();
            params.put("NIP", nip);
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource3, params, kon);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ProsesPensiun().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel P_Kode_Label;
    private javax.swing.JLabel P_Nama_Label;
    private javax.swing.JButton button_proses;
    private javax.swing.JComboBox combo_jenisPensiun;
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jenis_label;
    private javax.swing.JTextField nip_TF;
    private javax.swing.JLabel nip_br1;
    private javax.swing.JTable tabel_cari;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
