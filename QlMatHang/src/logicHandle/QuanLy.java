package logicHandle;

import Enitry.MatHang;
import Enitry.NhanVienBanHang;

import java.util.Scanner;

public class QuanLy {
    private static BangDanhSachBanHang[] danhSachBanHang;
    private static int soLuongBanHang;
    private NhanVienBanHangHandle qlnv;
    private MatHangHandle qlmh;
    public void QuanLyBanHangService(NhanVienBanHangHandle qlnv, MatHangHandle qlmh) {
        this.qlnv = qlnv;
        this.qlmh = qlmh;
        danhSachBanHang = new BangDanhSachBanHang[10];
        soLuongBanHang = 0;
    }
    private static void sapXepTheoTenNhanVien() {
        for (int i = 0; i < soLuongBanHang - 1; i++) {
            for (int j = i + 1; j < soLuongBanHang; j++) {
                if (danhSachBanHang[i].getNhanVien().getHoTen().compareTo(danhSachBanHang[j].getNhanVien().getHoTen()) > 0) {
                    BangDanhSachBanHang temp = danhSachBanHang[i];
                    danhSachBanHang[i] = danhSachBanHang[j];
                    danhSachBanHang[j] = temp;
                }
            }
        }
    }
    private void inDanhSachMatHang() {
        qlmh.printMH();
    }

    private void inDanhSachNhanVien() {
        qlnv.printNV();
    }
    public void nhapDuLieu() {
        qlmh.inputNewMatHang();
        qlnv.inputNV();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap ma nhan vien: ");
            int maNV = scanner.nextInt();
            scanner.nextLine();
            NhanVienBanHang nhanVien = qlnv.findNV(maNV);
            if (nhanVien == null) {
                System.out.println("Khong tim thay nhan vien.");
                continue;
            }

            BangDanhSachBanHang bangDanhSachBanHang = new BangDanhSachBanHang(nhanVien, 5);

            while (true) {
                System.out.print("Nhap mat hang: ");
                int maHang = scanner.nextInt();
                scanner.nextLine();
                MatHang matHang = qlmh.timMatHang(maHang);
                if (matHang == null) {
                    System.out.println("Khong tim thay mat hang.");
                    continue;
                }

                System.out.print("Nhap so luong ban: ");
                int soLuong = scanner.nextInt();
                scanner.nextLine();
                try {
                    bangDanhSachBanHang.addChiTietBanHang(matHang, soLuong);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

        }
    }



}
