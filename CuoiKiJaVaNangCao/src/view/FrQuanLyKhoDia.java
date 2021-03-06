/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.QuanLyKhoDia;
import model.QuanLyKhoDiaDAO;
import model.ThongTinNhanVien;

/**
 *
 * @author PhongVu
 */
public class FrQuanLyKhoDia extends javax.swing.JFrame {

    /**
     * Creates new form FrQuanLyKhoDia
     */
    QuanLyKhoDiaDAO dao = new QuanLyKhoDiaDAO();
    public void fillDatabase() {
        String [] arr={"MaDia","TenDia","Gia","SoLuongCon"};
        
        DefaultTableModel model = (DefaultTableModel) jTable_quanLyKhoDia.getModel();
        
        model.setRowCount(0);
        for (QuanLyKhoDia ee : dao.getAllDia()) {
            Object dataRow[] = new Object[7];
            dataRow[0] = ee.getMaDia();
            dataRow[1] = ee.getTenDia();
            dataRow[2] = ee.getGia();
            dataRow[3] = ee.getSoLuongCon();
            model.addRow(dataRow);
        }
        
        
    }
    public FrQuanLyKhoDia() {
        initComponents();
        fillDatabase();
        //Dùng để chỉ chọn được một hàng duy nhất khi kích chuột vào jtable
        jTable_quanLyKhoDia.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_quanLyKhoDia = new javax.swing.JTable();
        btn_sua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_xoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_dong1 = new javax.swing.JButton();
        txt_maDia = new javax.swing.JTextField();
        btn_luu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_timKiem = new javax.swing.JTextField();
        txt_tenDia = new javax.swing.JTextField();
        btn_timKiem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_gia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_soLuongCon = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_quanLyKhoDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaDia", "TenDia", "Gia", "SoLuongCon"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        jTable_quanLyKhoDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_quanLyKhoDiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_quanLyKhoDia);

        btn_sua.setText("Sửa");
        btn_sua.setActionCommand("");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHO ĐĨA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_xoa.setText("Xóa");
        btn_xoa.setActionCommand("");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã Đĩa");

        btn_dong1.setText("Đóng");
        btn_dong1.setActionCommand("");
        btn_dong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dong1ActionPerformed(evt);
            }
        });

        btn_luu.setText("Thêm");
        btn_luu.setActionCommand("");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên Đĩa");

        txt_timKiem.setText("Nhập MaDia");
        txt_timKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_timKiemMouseClicked(evt);
            }
        });
        txt_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timKiemActionPerformed(evt);
            }
        });

        btn_timKiem.setText("Tìm kiếm");
        btn_timKiem.setActionCommand("");
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });

        jLabel4.setText("Giá");

        jLabel9.setText("Tìm kiếm");

        jLabel5.setText("Số Lượng Còn");

        btn_them.setText("Nhập mới");
        btn_them.setActionCommand("");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(362, 362, 362)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_timKiem))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(29, 29, 29)
                                    .addComponent(txt_maDia, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_them)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_luu)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_sua)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_xoa)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_dong1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(txt_tenDia, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_soLuongCon, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tenDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txt_soLuongCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_luu)
                    .addComponent(btn_them)
                    .addComponent(btn_xoa)
                    .addComponent(btn_sua)
                    .addComponent(btn_dong1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_quanLyKhoDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_quanLyKhoDiaMouseClicked
        // TODO add your handling code here:
        int i = jTable_quanLyKhoDia.getSelectedRow();
        TableModel model = jTable_quanLyKhoDia.getModel();
        txt_maDia.setText(model.getValueAt(i, 0).toString());
        txt_tenDia.setText(model.getValueAt(i, 1).toString());
        txt_gia.setText(model.getValueAt(i, 2).toString());
        txt_soLuongCon.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTable_quanLyKhoDiaMouseClicked
    public boolean validateForm() {
        if (txt_maDia.getText().isEmpty() || txt_tenDia.getText().isEmpty() || txt_gia.getText().isEmpty() || txt_soLuongCon.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public QuanLyKhoDia getModel() {
        QuanLyKhoDia ee = new QuanLyKhoDia();
        ee.setMaDia(txt_maDia.getText());
        ee.setTenDia(txt_tenDia.getText());
        ee.setGia(Integer.parseInt(txt_gia.getText()));
        ee.setSoLuongCon(Integer.parseInt(txt_soLuongCon.getText()));
        return ee;
    }
    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Thêm", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            if (validateForm()) {
                try {
                    QuanLyKhoDia eeNew = getModel();
                    if (dao.update(eeNew) > 0) {
                        JOptionPane.showMessageDialog(this, "Sửa thành công");
                        fillDatabase();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.toString());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập thông tin!!!");
            }
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Thêm", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION){
            if (txt_maDia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã Nhân Viên");
            } else {
                try {
                    if (txt_maDia.getText().isEmpty() == false) {
                        if(dao.delete(txt_maDia.getText())>0)
                        {
                              JOptionPane.showMessageDialog(this, "Xóa thành công");
                        }
                    }
                    fillDatabase();
                  
                    resetForm();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.toString());
                }}
            }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_dong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dong1ActionPerformed
        // TODO add your handling code here:
        FrTrangChu frTrangChu= new FrTrangChu();
        frTrangChu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_dong1ActionPerformed

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?", "Thêm", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            if (validateForm()) {
                QuanLyKhoDia ee = getModel();
                try {
                    if (dao.add(ee) > 0) {
                        fillDatabase();
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        resetForm();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.toString());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đủ thông tin!!!");
            }
        }

    }//GEN-LAST:event_btn_luuActionPerformed

    private void txt_timKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_timKiemMouseClicked
        // TODO add your handling code here:
        txt_timKiem.setText("");
    }//GEN-LAST:event_txt_timKiemMouseClicked

    private void txt_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timKiemActionPerformed

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
        // TODO add your handling code here:
        if (txt_timKiem.getText().isEmpty()||txt_timKiem.getText().equals("Nhập MaDia")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập MSV");
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable_quanLyKhoDia.getModel();
            model.setRowCount(0);
            for (QuanLyKhoDia ee : dao.getAllDia()) {
                if ((ee.getMaDia().trim()).equals(txt_timKiem.getText())) {

                    Object dataRow[] = new Object[7];
                    dataRow[0] = ee.getMaDia();
                    dataRow[1] = ee.getTenDia();
                    dataRow[2] = ee.getGia();
                    dataRow[3] = ee.getSoLuongCon();
                    model.addRow(dataRow);

                }

            }
            txt_timKiem.setText("");
        }
    }//GEN-LAST:event_btn_timKiemActionPerformed
     private void resetForm() {
        txt_maDia.setText("");
        txt_tenDia.setText("");
        txt_gia.setText("");
        txt_soLuongCon.setText("");
    }
    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        resetForm();

    }//GEN-LAST:event_btn_themActionPerformed

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
            java.util.logging.Logger.getLogger(FrQuanLyKhoDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrQuanLyKhoDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrQuanLyKhoDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrQuanLyKhoDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrQuanLyKhoDia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dong1;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_quanLyKhoDia;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JTextField txt_maDia;
    private javax.swing.JTextField txt_soLuongCon;
    private javax.swing.JTextField txt_tenDia;
    private javax.swing.JTextField txt_timKiem;
    // End of variables declaration//GEN-END:variables
}
