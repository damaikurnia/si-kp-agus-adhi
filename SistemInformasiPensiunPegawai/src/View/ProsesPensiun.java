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
import Model.DataMeninggal;
import Model.PNS;
import TableModel.DataProsesPensiunTableModel;
import TableModel.RataTengah;
import java.awt.Color;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        inter_proses_meninggal.setVisible(false);
        cetak_internal.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inter_proses_meninggal = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nama_inter_meninggal = new javax.swing.JTextField();
        NIP_inter_meninggal = new javax.swing.JTextField();
        date_meninggal = new com.toedter.calendar.JDateChooser();
        jk_label = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nm_anggotaKel = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        label_sumai_istri = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pekerjaan = new javax.swing.JTextField();
        batal_internal = new javax.swing.JButton();
        simpan_internal = new javax.swing.JButton();
        cetak_internal = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        no_surat_kematian = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        kabupaten_TF = new javax.swing.JTextField();
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
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        P_Kode_Label = new javax.swing.JLabel();
        P_Nama_Label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inter_proses_meninggal.setVisible(true);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Proses Pensiun Meninggal Dunia");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("Data Keluarga :");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setText("No Surat kematian");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setText("Nama");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        nama_inter_meninggal.setFont(new java.awt.Font("Tahoma", 1, 12));
        nama_inter_meninggal.setEnabled(false);
        jPanel5.add(nama_inter_meninggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, -1));

        NIP_inter_meninggal.setFont(new java.awt.Font("Tahoma", 1, 12));
        NIP_inter_meninggal.setEnabled(false);
        jPanel5.add(NIP_inter_meninggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 170, -1));
        jPanel5.add(date_meninggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 170, -1));

        jk_label.setFont(new java.awt.Font("Tahoma", 1, 12));
        jk_label.setText("....");
        jPanel5.add(jk_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 80, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("NIP");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setText("Data");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel12.setText("Nama");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 20));

        nm_anggotaKel.setFont(new java.awt.Font("Tahoma", 1, 12));
        nm_anggotaKel.setEnabled(false);
        jPanel5.add(nm_anggotaKel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 170, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setText("Kabupaten");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 20));

        alamat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        alamat.setEnabled(false);
        jPanel5.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 350, -1));

        label_sumai_istri.setFont(new java.awt.Font("Tahoma", 1, 12));
        label_sumai_istri.setText("....");
        jPanel5.add(label_sumai_istri, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel14.setText("Pekerjaan");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 20));

        pekerjaan.setFont(new java.awt.Font("Tahoma", 1, 12));
        pekerjaan.setEnabled(false);
        jPanel5.add(pekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 350, -1));

        batal_internal.setText("Batal");
        batal_internal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batal_internalActionPerformed(evt);
            }
        });
        jPanel5.add(batal_internal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        simpan_internal.setText("Simpan");
        simpan_internal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_internalActionPerformed(evt);
            }
        });
        jPanel5.add(simpan_internal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        cetak_internal.setText("Cetak");
        jPanel5.add(cetak_internal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel15.setText("Tanggal meninggal");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        no_surat_kematian.setFont(new java.awt.Font("Tahoma", 1, 12));
        jPanel5.add(no_surat_kematian, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel18.setText("Alamat");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 20));

        kabupaten_TF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kabupaten_TF.setEnabled(false);
        jPanel5.add(kabupaten_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 270, -1));

        javax.swing.GroupLayout inter_proses_meninggalLayout = new javax.swing.GroupLayout(inter_proses_meninggal.getContentPane());
        inter_proses_meninggal.getContentPane().setLayout(inter_proses_meninggalLayout);
        inter_proses_meninggalLayout.setHorizontalGroup(
            inter_proses_meninggalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        inter_proses_meninggalLayout.setVerticalGroup(
            inter_proses_meninggalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter_proses_meninggalLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(inter_proses_meninggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 570, 440));

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

        jPanel4.setBackground(new java.awt.Color(102, 51, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jenis_label.setFont(new java.awt.Font("Tahoma", 1, 14));
        jenis_label.setText("Pilih Jenis Pensiun");
        jPanel4.add(jenis_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, 30));

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
        combo_jenisPensiun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Jenis--", "B U P", "A P S", "Meninggal Dunia" }));
        combo_jenisPensiun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_jenisPensiunActionPerformed(evt);
            }
        });
        jPanel4.add(combo_jenisPensiun, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 230, -1));

        nip_br1.setFont(new java.awt.Font("Tahoma", 1, 14));
        nip_br1.setText("Masukan NIP");
        jPanel4.add(nip_br1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel2.setText("Data Pegawai yang diproses");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        tabel_cari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "N I P", "NAMA"
            }
        ));
        jScrollPane1.setViewportView(tabel_cari);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 520, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIcture/wall1.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 210));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 560, 230));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18));
        jLabel3.setText("Proses Pensiun Pegawai");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        exit_button.setText("Keluar");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });
        jPanel3.add(exit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, -1, -1));

        jLabel5.setText("Selamat Datang,");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        P_Kode_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P_Kode_Label.setText("Kode");
        jPanel3.add(P_Kode_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 10, -1));

        P_Nama_Label.setText("Nama");
        jPanel3.add(P_Nama_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, -1));

        jLabel8.setText("-");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIcture/wall1.jpg"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 870, 360));

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
        } else if (kat.matches("Meninggal Dunia")) {
            int a = tabel_cari.getColumnCount();
            int row = tabel_cari.getRowCount();
            for (int i = 0; i < row; i++) {
                try {
                    String NIP = tabel_cari.getValueAt(i, 0).toString();
                    String Nama = tabel_cari.getValueAt(i, 1).toString();
                    String jk = ControlData.getKoneksi().cariJK(NIP);
                    String nmAnggotakel = ControlData.getKoneksi().cariAnggotaKel(NIP);
                    String alamatKel = ControlData.getKoneksi().cariAlamat(NIP);
                    String Pekerjaan = ControlData.getKoneksi().cariPekerjaan(NIP);
                    NIP_inter_meninggal.setText(NIP);
                    nama_inter_meninggal.setText(Nama);
                    if (jk.matches("L")) {
                        jk_label.setText("Almarhum");
                        label_sumai_istri.setText("Istri");
                    } else {
                        jk_label.setText("Almarhumah");
                        label_sumai_istri.setText("Suami");
                    }
                    nm_anggotaKel.setText(nmAnggotakel);
                    alamat.setText(alamatKel);
                    pekerjaan.setText(Pekerjaan);
                } catch (Exception ex) {
                    Logger.getLogger(ProsesPensiun.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            inter_proses_meninggal.setVisible(true);
            date_meninggal.setRequestFocusEnabled(rootPaneCheckingEnabled);
        }

    }//GEN-LAST:event_combo_jenisPensiunActionPerformed

    private void nip_TFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nip_TFKeyReleased
        inputAngka(nip_TF.getText());
        nip_TF.setBackground(Color.white);
    }//GEN-LAST:event_nip_TFKeyReleased

    private void batal_internalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batal_internalActionPerformed
        inter_proses_meninggal.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_batal_internalActionPerformed

    private void simpan_internalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_internalActionPerformed
        try {
            String no = no_surat_kematian.getText();
            String nama = nama_inter_meninggal.getText();
            String nip = NIP_inter_meninggal.getText();
            Date tgl = date_meninggal.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = sdf.format(tgl);
            String angg_nama = nm_anggotaKel.getText();
            String angg_alamat = alamat.getText();
            String angg_pekerjaan = pekerjaan.getText();
            String kab=kabupaten_TF.getText();
            DataMeninggal dm = new DataMeninggal(no, nama, nip, tanggal, angg_nama, angg_alamat, angg_pekerjaan,kab);
            ControlData.getKoneksi().insertDataMeninggal(dm);
            JOptionPane.showMessageDialog(rootPane, "data disimpan");
            simpan_internal.setEnabled(false);
            cetak_internal.setEnabled(true);
            batal_internal.setText("Keluar");
            // TODO add your handling code here:
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "data gagal disimpan");
            Logger.getLogger(ProsesPensiun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_simpan_internalActionPerformed
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
    private javax.swing.JTextField NIP_inter_meninggal;
    private javax.swing.JLabel P_Kode_Label;
    private javax.swing.JLabel P_Nama_Label;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton batal_internal;
    private javax.swing.JButton button_proses;
    private javax.swing.JButton cetak_internal;
    private javax.swing.JComboBox combo_jenisPensiun;
    private com.toedter.calendar.JDateChooser date_meninggal;
    private javax.swing.JButton exit_button;
    private javax.swing.JInternalFrame inter_proses_meninggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jenis_label;
    private javax.swing.JLabel jk_label;
    private javax.swing.JTextField kabupaten_TF;
    private javax.swing.JLabel label_sumai_istri;
    private javax.swing.JTextField nama_inter_meninggal;
    private javax.swing.JTextField nip_TF;
    private javax.swing.JLabel nip_br1;
    private javax.swing.JTextField nm_anggotaKel;
    private javax.swing.JTextField no_surat_kematian;
    private javax.swing.JTextField pekerjaan;
    private javax.swing.JButton simpan_internal;
    private javax.swing.JTable tabel_cari;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
