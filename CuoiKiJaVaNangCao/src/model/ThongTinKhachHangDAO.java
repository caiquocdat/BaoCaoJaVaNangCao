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
public class ThongTinKhachHangDAO {
   public int add(ThongTinKhachHang ee) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="insert into ThongTinKhachHang(MaKH,TenKH,NgaySinh,GioiTinh) values (?,?,?,?)";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            sttm.setString(1,ee.getMaKH());
            sttm.setString(2,ee.getTenKH());
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
      public int update(ThongTinKhachHang ee) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="update ThongTinKhachHang set TenKH=?,NgaySinh=?,GioiTinh=? where MaKH=?";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            
            sttm.setString(1,ee.getTenKH());
            sttm.setString(2,ee.getNgaySinh());
            sttm.setString(3,ee.getGioiTinh());
            sttm.setString(4,ee.getMaKH());
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
      public int delete(String MaKH) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="delete ThongTinKhachHang where MaKH=?";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            
            sttm.setString(1,MaKH);
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
      public List<ThongTinKhachHang> getAllKH(){
          List<ThongTinKhachHang> ls= new ArrayList<>();
          Connection conn=null;
          Statement sttm=null;
          ResultSet rs= null;
          try {
              String sSQL="select * from ThongTinKhachHang;";
              conn=DatabaseUtils.getDBConnect();
              sttm=conn.createStatement();
              rs=sttm.executeQuery(sSQL);
              while (rs.next()) {                  
                  ThongTinKhachHang ee= new ThongTinKhachHang();
                  ee.setMaKH(rs.getString(1));
                  ee.setTenKH(rs.getString(2));
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
    
}
