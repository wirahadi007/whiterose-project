/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author whiterose
 */
public class daftar extends javax.swing.JFrame {

    /**
     * Creates new form daftar
     */
    public daftar() {
        initComponents();
    }
    public void hapus(){
        nis.setText("");
        nama.setText("");
        alamat.setText("");
        
        nis1.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        nis = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        jurusan = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        daf = new javax.swing.JButton();
        jeke = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nis1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar Terlebih Dahulu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 315, 49));

        nis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nisKeyReleased(evt);
            }
        });
        jPanel1.add(nis, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 220, 36));
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 220, 36));

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        jPanel1.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 220, 50));

        jurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RPL", "AKL", "BDP" }));
        jPanel1.add(jurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 220, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NIS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 118, 36));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NAMA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 118, 36));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("JENIS KELAMIN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 118, 36));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("JURUSAN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 118, 36));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ALAMAT");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 118, 36));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(":");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 31, 26));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(":");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 31, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(":");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 31, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(":");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 31, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(":");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 31, -1));

        daf.setText("DAFTAR");
        daf.setEnabled(false);
        daf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dafActionPerformed(evt);
            }
        });
        jPanel1.add(daf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 106, -1));

        jeke.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "laki-laki", "perempuan" }));
        jPanel1.add(jeke, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 220, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PASSWORD");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 118, 36));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(":");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 31, -1));

        nis1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nis1KeyReleased(evt);
            }
        });
        jPanel1.add(nis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 220, 36));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/many books.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 550, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, -1, 451));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void nisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nisKeyReleased
        if(nis.getText().length()>0){
            daf.setEnabled(true);
        }else{
            daf.setEnabled(false);
        }
    }//GEN-LAST:event_nisKeyReleased

    private void dafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dafActionPerformed
        try {
            String sql = "INSERT INTO daftar VALUES ('"+nis.getText()+"','"+nama.getText()+"','"+jeke.getSelectedItem()+"','"+jurusan.getSelectedItem()+"','"+alamat.getText()+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data tersimpan");
            hapus();
            pinjam_buk p = new pinjam_buk();
            p.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_dafActionPerformed

    private void nis1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nis1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nis1KeyReleased

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
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton daf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jeke;
    private javax.swing.JComboBox jurusan;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nis;
    private javax.swing.JTextField nis1;
    // End of variables declaration//GEN-END:variables
}
