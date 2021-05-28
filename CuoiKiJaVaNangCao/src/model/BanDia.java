/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PhongVu
 */
public class BanDia {
    String MaDonHang;
    String MaNV;
    String MaKH;
    String NgayBan;
    int TongTien;

    public BanDia() {
    }

    public BanDia(String MaDonHang, String MaNV, String MaKH, String NgayBan, int TongTien) {
        this.MaDonHang = MaDonHang;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.NgayBan = NgayBan;
        this.TongTien = TongTien;
    }

    public String getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(String MaDonHang) {
        this.MaDonHang = MaDonHang;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    @Override
    public String toString() {
        return "BanDia{" + "MaDonHang=" + MaDonHang + ", MaNV=" + MaNV + ", MaKH=" + MaKH + ", NgayBan=" + NgayBan + ", TongTien=" + TongTien + '}';
    }
    
}
