package logicHandle;

import Enitry.NhanVienBanHang;

import java.util.Scanner;

public class NhanVienBanHangHandle {
    private  NhanVienBanHang[] dsnv;
    private int soluongNV;
    public void inputNV(){
        System.out.println("nhap so nhan vien:");
        int n = new Scanner(System.in).nextInt();

        NhanVienBanHang[] nv = new NhanVienBanHang[n];
        for (int i = 0; i < nv.length; i++) {
            System.out.println("nhap thong tin nhan vien thu "+(i+1));
            System.out.println("nhap ho ten: ");
            String hoTen = new Scanner(System.in).nextLine();
            System.out.println("Nhap dia chi: ");
            String diaChi = new Scanner(System.in).nextLine();
            System.out.println("Nhap so dien thoai: ");
            String soDT = new Scanner(System.in).nextLine();
            System.out.println("Ngay ki hop dong: ");
            String ngayKiHD = new Scanner(System.in).nextLine();
            dsnv[i] = new NhanVienBanHang(hoTen,diaChi,soDT,NhanVienBanHang.getMaNVcount(),ngayKiHD);
        }
    }
    public void printNV(){
        for (int i = 0; i < dsnv.length; i++) {
            System.out.println(dsnv[i].toString());
        }
    }
    public NhanVienBanHang findNV(int maNV){
        for (int i = 0; i < soluongNV; i++) {
            if (dsnv[i].getMaNV() == maNV){
                return dsnv[i];
            }
        }
        return null;
    }

}
