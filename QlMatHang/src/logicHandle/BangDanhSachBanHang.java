package logicHandle;

import Enitry.ChiTietBanHang;
import Enitry.MatHang;
import Enitry.NhanVienBanHang;

import java.util.Scanner;

public class BangDanhSachBanHang {
    private NhanVienBanHang nhanVien;
    private ChiTietBanHang[] chiTietBanHangArray;
    private int soLuongChiTiet = 0;

    public BangDanhSachBanHang(NhanVienBanHang nhanVien, int maxMatHang) {
        this.nhanVien = nhanVien;
        this.chiTietBanHangArray = new ChiTietBanHang[maxMatHang];
    }

    public NhanVienBanHang getNhanVien() {
        return nhanVien;
    }

    public void addChiTietBanHang(MatHang matHang, int soLuong) throws Exception {
        if (soLuongChiTiet < chiTietBanHangArray.length) {
            for (int i = 0; i < soLuongChiTiet; i++) {
                if (chiTietBanHangArray[i].getMatHang().getMaHang() == matHang.getMaHang()) {
                    throw new Exception("mat hang da duoc them");
                }
            }
            chiTietBanHangArray[soLuongChiTiet++] = new ChiTietBanHang(matHang, soLuong);
        } else {
            throw new Exception("Khong the them qua 5 mat hang.");
        }
    }

    public ChiTietBanHang[] getChiTietBanHangArray() {
        return chiTietBanHangArray;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nhanVien.toString()).append("\n");
        for (int i = 0; i < soLuongChiTiet; i++) {
            sb.append("  - ").append(chiTietBanHangArray[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
