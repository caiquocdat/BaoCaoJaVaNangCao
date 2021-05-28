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
public class QuanLyKhoDiaDAO {
    public int add(QuanLyKhoDia ee) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="insert into QuanLyDiaTrongKho(MaDia,TenDia,Gia,SoLuongCon) values (?,?,?,?)";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            sttm.setString(1,ee.getMaDia());
            sttm.setString(2,ee.getTenDia());
            sttm.setString(3,String.valueOf(ee.getGia()));
            sttm.setString(4,String.valueOf(ee.getSoLuongCon()));
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
      public int update(QuanLyKhoDia ee) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="update QuanLyDiaTrongKho set TenDia=?,Gia=?,SoLuongCon=? where MaDia=?";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            
            sttm.setString(1,ee.getTenDia());
            sttm.setString(2,String.valueOf(ee.getGia()));
            sttm.setString(3,String.valueOf(ee.getSoLuongCon()));
            sttm.setString(4,ee.getMaDia());
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
      public int delete(String MaDia) throws SQLException{
        Connection conn= null;
        PreparedStatement sttm=null;
        try {
            String sSQL="delete QuanLyDiaTrongKho where MaDia=?";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(sSQL);
            
            sttm.setString(1,MaDia);
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
      public List<QuanLyKhoDia> getAllDia(){
          List<QuanLyKhoDia> ls= new ArrayList<>();
          Connection conn=null;
          Statement sttm=null;
          ResultSet rs= null;
          try {
              String sSQL="select * from QuanLyDiaTrongKho;";
              conn=DatabaseUtils.getDBConnect();
              sttm=conn.createStatement();
              rs=sttm.executeQuery(sSQL);
              while (rs.next()) {                  
                  QuanLyKhoDia ee= new QuanLyKhoDia();
                  ee.setMaDia(rs.getString(1));
                  ee.setTenDia(rs.getString(2));
                  ee.setGia(rs.getInt(3));
                  ee.setSoLuongCon(rs.getInt(4));
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
