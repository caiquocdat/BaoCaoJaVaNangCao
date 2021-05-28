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
public class QuanLyKhoDia {
     String MaDia;
    String TenDia;
    int Gia;
    int SoLuongCon;

    public QuanLyKhoDia() {
    }

    public QuanLyKhoDia(String MaDia, String TenDia, int Gia, int SoLuongCon) {
        this.MaDia = MaDia;
        this.TenDia = TenDia;
        this.Gia = Gia;
        this.SoLuongCon = SoLuongCon;
    }

    public String getMaDia() {
        return MaDia;
    }

    public void setMaDia(String MaDia) {
        this.MaDia = MaDia;
    }

    public String getTenDia() {
        return TenDia;
    }

    public void setTenDia(String TenDia) {
        this.TenDia = TenDia;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public int getSoLuongCon() {
        return SoLuongCon;
    }

    public void setSoLuongCon(int SoLuongCon) {
        this.SoLuongCon = SoLuongCon;
    }

    @Override
    public String toString() {
        return "QuanLyKhoDiaDAO{" + "MaDia=" + MaDia + ", TenDia=" + TenDia + ", Gia=" + Gia + ", SoLuongCon=" + SoLuongCon + '}';
    }
}
