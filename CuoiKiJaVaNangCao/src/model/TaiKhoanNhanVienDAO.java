/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PhongVu
 */
public class TaiKhoanNhanVienDAO {
    public int add(TaiKhoanNhanVien ee) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="insert into QuanLyTaiKhoanNhanVien(MaNV,MatKhau,NgayTao) values (?,?,NULL)";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            sttm.setString(1,ee.getMaNV());
            sttm.setString(2,ee.getMatKhau());
            if (sttm.executeUpdate()>0) {
                System.out.println("Đăng kí thành công");
                return 1;
            }
            else{
                System.out.println("Đăng kí thất bại");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }finally{
           sttm.close();
           conn.close();
        }
        return -1;
    }
     public int update(TaiKhoanNhanVien ee) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="update QuanLyTaiKhoanNhanVien set MatKhau=?,NgayTao=NULL where MaNV=?";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            
            sttm.setString(1,ee.getMatKhau());
            sttm.setString(2,ee.getMaNV());
            if (sttm.executeUpdate()>0) {
                System.out.println("Đổi mật khẩu thành công");
                return 1;
            }
            else{
                System.out.println("Đổi mật khẩu thất bại");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }finally{
           sttm.close();
           conn.close();
        }
        return -1;
    }
     public List<TaiKhoanNhanVien> getAllNV(){
          List<TaiKhoanNhanVien> ls= new ArrayList<>();
          Connection conn=null;
          Statement sttm=null;
          ResultSet rs= null;
          try {
              String sSQL="select * from QuanLyTaiKhoanNhanVien;";
              conn=DatabaseUtils.getDBConnect();
              sttm=conn.createStatement();
              rs=sttm.executeQuery(sSQL);
              while (rs.next()) {                  
                  TaiKhoanNhanVien ee= new TaiKhoanNhanVien();
                  ee.setMaNV(rs.getString(1));
                  ee.setMatKhau(rs.getString(2));
                  ls.add(ee);
              }
          } catch (Exception e) {
              System.out.println("Error: "+e.toString());
          }finally{
              try {
                  rs.close();
                  sttm.close();
                  conn.close();
              } catch (Exception e) {
              }
          }
          return ls;
      }
    public static void main(String[] args) throws SQLException {
     TaiKhoanNhanVienDAO dao= new TaiKhoanNhanVienDAO();
     TaiKhoanNhanVien ee= new TaiKhoanNhanVien("NV03","123456");
     //Them
     dao.add(ee);
    }
}
