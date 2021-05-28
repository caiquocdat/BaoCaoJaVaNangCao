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
public class ThongTinNhanVien {
    String MaNV;
    String TenNV;
    String NgaySinh;
    String GioiTinh;

    public ThongTinNhanVien() {
    }

    public ThongTinNhanVien(String MaNV, String TenNV, String NgaySinh, String GioiTinh) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    @Override
    public String toString() {
        return "ThongTinNhanVien{" + "MaNV=" + MaNV + ", TenNV=" + TenNV + ", NgaySinh=" + NgaySinh + ", GioiTinh=" + GioiTinh + '}';
    }
    
}
