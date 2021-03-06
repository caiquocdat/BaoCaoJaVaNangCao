/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import model.TaiKhoanNhanVien;
import model.TaiKhoanNhanVienDAO;

/**
 *
 * @author PhongVu
 */
public class FrDangNhap extends javax.swing.JFrame {

    TaiKhoanNhanVienDAO dao= new TaiKhoanNhanVienDAO();
    /**
     * Creates new form FrDangNhap
     */
    public FrDangNhap() {
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

        jLabel1 = new javax.swing.JLabel();
        btn_dangNhap = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_tenTaiKhoan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_matKhau = new javax.swing.JTextField();
        lb_dangKy = new javax.swing.JLabel();
        lb_doiMatKhau = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng nhập");
        jLabel1.setToolTipText("");

        btn_dangNhap.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_dangNhap.setText("ĐĂNG NHẬP");
        btn_dangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangNhapActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã nhân viên");

        txt_tenTaiKhoan.setForeground(new java.awt.Color(153, 153, 153));
        txt_tenTaiKhoan.setText("Nhập mã nhân viên...");
        txt_tenTaiKhoan.setToolTipText("");
        txt_tenTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tenTaiKhoanMouseClicked(evt);
            }
        });
        txt_tenTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenTaiKhoanActionPerformed(evt);
            }
        });

        jLabel3.setText("Mật khẩu");

        txt_matKhau.setText("******");
        txt_matKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_matKhauMouseClicked(evt);
            }
        });
        txt_matKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matKhauActionPerformed(evt);
            }
        });

        lb_dangKy.setForeground(new java.awt.Color(0, 51, 204));
        lb_dangKy.setText("Chưa có tài khoản, đăng ký ở đây...");
        lb_dangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_dangKyMouseClicked(evt);
            }
        });

        lb_doiMatKhau.setForeground(new java.awt.Color(0, 51, 204));
        lb_doiMatKhau.setText("Quên mật khẩu???");
        lb_doiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_doiMatKhauMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btn_dangNhap))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_tenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_dangKy)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_doiMatKhau))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_tenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_dangKy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_doiMatKhau)
                .addGap(18, 18, 18)
                .addComponent(btn_dangNhap)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tenTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenTaiKhoanActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_txt_tenTaiKhoanActionPerformed

    private void txt_matKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matKhauActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_matKhauActionPerformed

    private void txt_tenTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tenTaiKhoanMouseClicked
        // TODO add your handling code here:
         txt_tenTaiKhoan.setText("");
         txt_tenTaiKhoan.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_tenTaiKhoanMouseClicked

    private void txt_matKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_matKhauMouseClicked
        // TODO add your handling code here:
         txt_matKhau.setText("");
         txt_matKhau.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_matKhauMouseClicked

    private void lb_dangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_dangKyMouseClicked
        // TODO add your handling code here:
        FrDangKi frDangKi= new FrDangKi();
       frDangKi.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_lb_dangKyMouseClicked

    private void lb_doiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_doiMatKhauMouseClicked
        // TODO add your handling code here:
         FrDoiMatKhau frDoiMatKhau= new FrDoiMatKhau();
       frDoiMatKhau.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_lb_doiMatKhauMouseClicked

    private void btn_dangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangNhapActionPerformed
        // TODO add your handling code here:
        if (txt_tenTaiKhoan.getText().isEmpty()||txt_tenTaiKhoan.getText().equals("Nhập mã nhân viên...")||txt_matKhau.getText().isEmpty()||txt_matKhau.getText().equals("******")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin!!!");
        }
        else{
            for (TaiKhoanNhanVien ee : dao.getAllNV()) {
                String maNV=ee.getMaNV().trim();
                if (txt_tenTaiKhoan.getText().equalsIgnoreCase(maNV)&&txt_matKhau.getText().equalsIgnoreCase(ee.getMatKhau())){
                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                     FrTrangChu frTrangChu= new FrTrangChu();
                        frTrangChu.setVisible(true);
                        this.setVisible(false);
                      return;  
                }
            }
            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại");
        }
    }//GEN-LAST:event_btn_dangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(FrDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb_dangKy;
    private javax.swing.JLabel lb_doiMatKhau;
    private javax.swing.JTextField txt_matKhau;
    private javax.swing.JTextField txt_tenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
