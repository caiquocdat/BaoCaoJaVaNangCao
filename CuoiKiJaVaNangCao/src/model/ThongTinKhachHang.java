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
public class ThongTinKhachHang {
     String MaKH;
    String TenKH;
    String NgaySinh;
    String GioiTinh;

    public ThongTinKhachHang() {
    }

    public ThongTinKhachHang(String MaKH, String TenKH, String NgaySinh, String GioiTinh) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
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
        return "ThongTinKhachHangDAO{" + "MaKH=" + MaKH + ", TenKH=" + TenKH + ", NgaySinh=" + NgaySinh + ", GioiTinh=" + GioiTinh + '}';
    }
}
