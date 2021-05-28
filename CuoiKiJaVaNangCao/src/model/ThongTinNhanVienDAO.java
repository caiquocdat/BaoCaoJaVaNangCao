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
public class ThongTinNhanVienDAO {
     public int add(ThongTinNhanVien ee) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="insert into ThongTinCaNhan(MaNV,TenNV,NgaySinh,GioiTinh) values (?,?,?,?)";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            sttm.setString(1,ee.getMaNV());
            sttm.setString(2,ee.getTenNV());
            sttm.setString(3,ee.getNgaySinh());
            sttm.setString(4,ee.getGioiTinh());
            if (sttm.executeUpdate()>0) {
                System.out.println("Thêm thành công");
                return 1;
            }
            else{
                System.out.println("Thêm thất bại");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }finally{
           sttm.close();
           conn.close();
        }
        return -1;
    }
      public int update(ThongTinNhanVien ee) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="update ThongTinCaNhan set TenNV=?,NgaySinh=?,GioiTinh=? where MaNV=?";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            
            sttm.setString(1,ee.getTenNV());
            sttm.setString(2,ee.getNgaySinh());
            sttm.setString(3,ee.getGioiTinh());
            sttm.setString(4,ee.getMaNV());
            if (sttm.executeUpdate()>0) {
                System.out.println("Sửa thành công");
                return 1;
            }
            else{
                System.out.println("Sửa thất bại");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }finally{
           sttm.close();
           conn.close();
        }
        return -1;
    }
      public int delete(String MaNV) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="delete ThongTinCaNhan where MaNV=?";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            
            sttm.setString(1,MaNV);
            if (sttm.executeUpdate()>0) {
                System.out.println("Xóa thành công");
                return 1;
            }
            else{
                System.out.println("Xóa thất bại");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }finally{
           sttm.close();
           conn.close();
        }
        return -1;
    }
      public List<ThongTinNhanVien> getAllNV(){
          List<ThongTinNhanVien> ls= new ArrayList<>();
          Connection conn=null;
          Statement sttm=null;
          ResultSet rs= null;
          try {
              String sSQL="select * from ThongTinCaNhan;";
              conn=DatabaseUtils.getDBConnect();
              sttm=conn.createStatement();
              rs=sttm.executeQuery(sSQL);
              while (rs.next()) {                  
                  ThongTinNhanVien ee= new ThongTinNhanVien();
                  ee.setMaNV(rs.getString(1));
                  ee.setTenNV(rs.getString(2));
                  ee.setNgaySinh(rs.getString(3));
                  ee.setGioiTinh(rs.getString(4));
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
      public static void main(String[] args) {
        ThongTinNhanVienDAO dao = new ThongTinNhanVienDAO();
          System.out.println("=>"+dao.getAllNV());
    }
}