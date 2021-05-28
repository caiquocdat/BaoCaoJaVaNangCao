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
public class BanDiaDAO {
    public int addTTBan(ChiTietBanDia ee) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="insert into ChiTietHoaDonBan(MaDonHang,MaDia,DonGia,SoLuongMua,GiamGia,ThanhTien) values (?,?,?,?,?,NULL)";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            sttm.setString(1,ee.getMaDonHang());
            sttm.setString(2,ee.getMaDia());
            sttm.setString(3,String.valueOf(ee.getDonGia()));
            sttm.setString(4,String.valueOf(ee.getSoLuongMua()));
            sttm.setString(5,String.valueOf(ee.getGiamGia()));
            
            if (sttm.executeUpdate()>0) {
                System.out.println("Thêm thành công");
                return 1;
            }
            else{
                System.out.println("Thêm thất bái");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }finally{
           sttm.close();
           conn.close();
        }
        return -1;
    }
      public int updateTTBan(ChiTietBanDia ee) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="update ChiTietHoaDonBan set DonGia=?,SoLuongMua=?,GiamGia=?,ThanhTien=NULL where MaDonHang=? and MaDia=?";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            
           
            sttm.setString(1,String.valueOf(ee.getDonGia()));
            sttm.setString(2,String.valueOf(ee.getSoLuongMua()));
             sttm.setString(3,String.valueOf(ee.getGiamGia()));
            sttm.setString(4,ee.getMaDonHang());
             sttm.setString(5,ee.getMaDia());
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
      public int deleteTTBan(String MaDonHang,String MaDia) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="delete ChiTietHoaDonBan where MaDonHang=? and MaDia=?";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            
            sttm.setString(1,MaDonHang);
            sttm.setString(2,MaDia);
            
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
      public List<ChiTietBanDia> getAllDonHang(){
          List<ChiTietBanDia> ls= new ArrayList<>();
          Connection conn=null;
          Statement sttm=null;
          ResultSet rs= null;
          try {
              String sSQL="select MaDonHang,MaDia,DonGia,SoLuongMua,GiamGia,ThanhTien from ChiTietHoaDonBan;";
              conn=DatabaseUtils.getDBConnect();
              sttm=conn.createStatement();
              rs=sttm.executeQuery(sSQL);
              while (rs.next()) {                  
                  ChiTietBanDia ee= new ChiTietBanDia();
                  ee.setMaDonHang(rs.getString(1));
                  ee.setMaDia(rs.getString(2));
                  ee.setDonGia(rs.getInt(3));
                  ee.setSoLuongMua(rs.getInt(4));
                  ee.setGiamGia(rs.getInt(5));
                  ee.setThanhTien(rs.getInt(6));
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
      public int addTTChung(BanDia ee) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="insert into HoaDonBan(MaDonHang,MaNV,MaKH,NgayBan,TongTien) values (?,?,?,NULL,NULL)";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            sttm.setString(1,ee.getMaDonHang());
            sttm.setString(2,ee.getMaNV());
            sttm.setString(3,ee.getMaKH());
            if (sttm.executeUpdate()>0) {
                System.out.println("Thêm thành công");
                return 1;
            }
            else{
                System.out.println("Thêm thất bái");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }finally{
           sttm.close();
           conn.close();
        }
        return -1;
    }
    public List<ThongTinNhanVien> LoadDataToCombobox(){
          List<ThongTinNhanVien> ls= new ArrayList<>();
          Connection conn=null;
          Statement sttm=null;
          ResultSet rs= null;
          try {
              String sSQL="select MaNV from ThongTinCaNhan;";
              conn=DatabaseUtils.getDBConnect();
              sttm=conn.createStatement();
              rs=sttm.executeQuery(sSQL);
              while (rs.next()) {                  
                  ThongTinNhanVien ee= new ThongTinNhanVien();
                  ee.setMaNV(rs.getString(1));
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
      public List<BanDia> LoadDataToTongTien(){
          List<BanDia> ls= new ArrayList<>();
          Connection conn=null;
          Statement sttm=null;
          ResultSet rs= null;
          try {
              String sSQL="select MaDonHang,TongTien from HoaDonBan;";
              conn=DatabaseUtils.getDBConnect();
              sttm=conn.createStatement();
              rs=sttm.executeQuery(sSQL);
              while (rs.next()) {                  
                  BanDia ee= new BanDia();
                  ee.setMaDonHang(rs.getString(1));
                  ee.setTongTien(Integer.valueOf(rs.getString(2)));
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
     public List<BanDia> GiaTriHangCuoi(){
          List<BanDia> ls= new ArrayList<>();
          Connection conn=null;
          Statement sttm=null;
          ResultSet rs= null;
          try {
              String sSQL="SELECT TOP 1 * FROM HoaDonBan ORDER BY MaDonHang DESC ;";
              conn=DatabaseUtils.getDBConnect();
              sttm=conn.createStatement();
              rs=sttm.executeQuery(sSQL);
              while (rs.next()) {                  
                  BanDia ee= new BanDia();
                  ee.setMaDonHang(rs.getString(1));
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
         BanDiaDAO dao = new BanDiaDAO();
         System.out.println("=>"+dao.LoadDataToTongTien());
    }
}
