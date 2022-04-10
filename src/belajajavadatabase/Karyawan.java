package belajajavadatabase;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Karyawan extends javax.swing.JFrame {
    
    // mengosongkan kolom input
    private void kosongkan() {
        kolom_nik.setEditable(true);
        kolom_nik.setText(null);
        kolom_karyawan.setText(null);
        opsi_jabatan.setSelectedItem(this);
        kolom_alamat.setText(null);
        kolom_email.setText(null);
        kolom_telp.setText(null);
    }
    
    // menampilkan isi data ke tabel
    private void tampil_data() { 
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("no");
        model.addColumn("nik");
        model.addColumn("nama");
        model.addColumn("jabatan");
        model.addColumn("alamat");
        model.addColumn("amail");
        model.addColumn("no_telp");
        
        try {
            int no = 1;
            String sql = "SELECT * FROM karyawan";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()) {
                model.addRow(new Object[] {no++, res.getString(1), res.getString(2), res.getString(3),
                res.getString(4), res.getString(5), res.getString(6)});
            }
            
            tableKaryawan.setModel(model);
        } 
          
        catch (SQLException e) {
            System.out.print("Error " + e.getMessage());
        }
    }
    
    public Karyawan() {
        initComponents();
        tampil_data();
        kosongkan();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kolom_nik = new javax.swing.JTextField();
        kolom_karyawan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        opsi_jabatan = new javax.swing.JComboBox<>();
        kolom_alamat = new javax.swing.JTextField();
        kolom_email = new javax.swing.JTextField();
        kolom_telp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKaryawan = new javax.swing.JTable();
        btn_tambahdata = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnaHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Data Karyawan");

        jLabel2.setText("NIK");

        jLabel3.setText("Nama Karyawan");

        jLabel4.setText("Jabatan");

        jLabel5.setText("Alamat");

        jLabel6.setText("Email");

        jLabel7.setText("No.Telp");

        opsi_jabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT Engineer", "Network Administrator", "Database Administrator" }));

        tableKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKaryawan);

        btn_tambahdata.setText("Tambah Data");
        btn_tambahdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahdataActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnaHapus.setText("Hapus");
        btnaHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaHapusActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 120, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(273, 273, 273))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(kolom_nik)
                                            .addComponent(kolom_karyawan)
                                            .addComponent(opsi_jabatan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(kolom_alamat)
                                            .addComponent(kolom_email)
                                            .addComponent(kolom_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_tambahdata)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSimpan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEdit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnaHapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBatal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKeluar)))
                                .addGap(127, 127, 127))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kolom_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kolom_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(opsi_jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(kolom_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(kolom_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(kolom_telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambahdata)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnaHapus)
                    .addComponent(btnBatal)
                    .addComponent(btnKeluar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // keluar dari form
    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed
    
    // menambah data
    private void btn_tambahdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahdataActionPerformed
        kosongkan();            
    }//GEN-LAST:event_btn_tambahdataActionPerformed

    // menyimpan data
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        try {
            String sql = "INSERT INTO karyawan VALUES ('"+kolom_nik.getText()+"','"+kolom_karyawan.getText()+"','"+opsi_jabatan.getSelectedItem()+"','"+kolom_alamat.getText()+"','"+kolom_email.getText()+"','"+kolom_telp.getText()+"')";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            tampil_data();
            kosongkan();
        }
        
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    // meng edit data dengan mengklik di ke tabel
    private void tableKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKaryawanMouseClicked
        
        int baris = tableKaryawan.rowAtPoint(evt.getPoint());
        String nik = tableKaryawan.getValueAt(baris, 1).toString();
        kolom_nik.setText(nik);
        
        String nama = tableKaryawan.getValueAt(baris, 2).toString();
        kolom_karyawan.setText(nama);
        
        String jabatan = tableKaryawan.getValueAt(baris, 3).toString();
        opsi_jabatan.setSelectedItem(jabatan);
        
        String alamat = tableKaryawan.getValueAt(baris, 4).toString();
        kolom_alamat.setText(alamat);
        
        String email = tableKaryawan.getValueAt(baris, 5).toString();
        kolom_email.setText(email);
        
        String telp = tableKaryawan.getValueAt(baris, 6).toString();
        kolom_telp.setText(telp);   
        
    }//GEN-LAST:event_tableKaryawanMouseClicked

    // meng edit data
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        try {
            String sql = "UPDATE karyawan SET nik = '"+kolom_nik.getText()+"', nama = '"+kolom_karyawan.getText()+"', jabatan = '"+opsi_jabatan.getSelectedItem()+"', alamat = '"+kolom_alamat.getText()+"', email = '"+kolom_email.getText()+"', no_telp = '"+kolom_telp.getText()+"' WHERE nik = '"+kolom_nik.getText()+"'";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.execute();
            JOptionPane.showMessageDialog(null, "Edit data berhasil");
        }
        
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        tampil_data();
        kosongkan();
        
    }//GEN-LAST:event_btnEditActionPerformed

    // menghapus data
    private void btnaHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaHapusActionPerformed
        
        try {
            String sql = "DELETE FROM karyawan WHERE nik = '"+kolom_nik.getText()+"'";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.execute();
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
        }
        
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        tampil_data();
        kosongkan();      
        
    }//GEN-LAST:event_btnaHapusActionPerformed

    // button batal
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        kosongkan();
         
    }//GEN-LAST:event_btnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btn_tambahdata;
    private javax.swing.JButton btnaHapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kolom_alamat;
    private javax.swing.JTextField kolom_email;
    private javax.swing.JTextField kolom_karyawan;
    private javax.swing.JTextField kolom_nik;
    private javax.swing.JTextField kolom_telp;
    private javax.swing.JComboBox<String> opsi_jabatan;
    private javax.swing.JTable tableKaryawan;
    // End of variables declaration//GEN-END:variables
}
