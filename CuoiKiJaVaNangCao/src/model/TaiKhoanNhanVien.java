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
public class TaiKhoanNhanVien {
    String MaNV;
    String MatKhau;

    public TaiKhoanNhanVien() {
    }

    public TaiKhoanNhanVien(String MaNV, String MatKhau) {
        this.MaNV = MaNV;
        this.MatKhau = MatKhau;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    @Override
    public String toString() {
        return "TaiKhoanNhanVien{" + "MaNV=" + MaNV + ", MatKhau=" + MatKhau + '}';
    }
    
    
}
