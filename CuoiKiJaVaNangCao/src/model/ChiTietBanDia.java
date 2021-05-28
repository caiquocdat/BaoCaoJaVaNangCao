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
public class ChiTietBanDia {
    String MaDonHang;
    String MaDia;
    int DonGia;
    int SoLuongMua;
    int GiamGia;
    int ThanhTien;
    public ChiTietBanDia() {
    }

    public ChiTietBanDia(String MaDonHang, String MaDia, int DonGia, int SoLuongMua, int GiamGia,int ThanhTien) {
        this.MaDonHang = MaDonHang;
        this.MaDia = MaDia;
        this.DonGia = DonGia;
        this.SoLuongMua = SoLuongMua;
        this.GiamGia = GiamGia;
        this.ThanhTien = ThanhTien;
    }

    public String getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(String MaDonHang) {
        this.MaDonHang = MaDonHang;
    }

    public String getMaDia() {
        return MaDia;
    }

    public void setMaDia(String MaDia) {
        this.MaDia = MaDia;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuongMua() {
        return SoLuongMua;
    }

    public void setSoLuongMua(int SoLuongMua) {
        this.SoLuongMua = SoLuongMua;
    }

    public int getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(int GiamGia) {
        this.GiamGia = GiamGia;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    @Override
    public String toString() {
        return "ChiTietBanDia{" + "MaDonHang=" + MaDonHang + ", MaDia=" + MaDia + ", DonGia=" + DonGia + ", SoLuongMua=" + SoLuongMua + ", GiamGia=" + GiamGia + ", ThanhTien=" + ThanhTien + '}';
    }

    
    
}
