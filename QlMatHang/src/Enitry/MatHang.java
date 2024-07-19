package Enitry;

import Constant.NhomHang;

import java.util.Scanner;

public class MatHang {
    private static int maHangCount= 1000;
    private int maHang;
    private String tenHang;
    private NhomHang nhomHang;
    private double giaBan;
    private int soLuong;

    public MatHang() {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public static int getMaHangCount() {
        return maHangCount;
    }

    public static void setMaHangCount(int maHangCount) {
        MatHang.maHangCount = maHangCount;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public NhomHang getNhomHang() {
        return nhomHang;
    }

    public void setNhomHang(NhomHang nhomHang) {
        this.nhomHang = nhomHang;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "maHang=" + maHang +
                ", tenHang='" + tenHang + '\'' +
                ", nhomHang=" + nhomHang +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                '}';
    }

    public void infor() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap thong tin cua mat hang: ");
        System.out.println("nhap ten mat hang: ");
        String tenHang = sc.nextLine();
        System.out.println("nhap nhom mat hang(DT/DL/MT/TBVP)");
        int choice;
        while (true){
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice<=4){
                break;
            }
            System.out.print("Lua chon khong hop le, vui long chon lai");
        }
        switch (choice){
            case 1:
                this.setNhomHang(NhomHang.DT);
                break;
            case 2:
                this.setNhomHang(NhomHang.DL);
                break;
            case 3:
                this.setNhomHang(NhomHang.MT);
                break;
            case 4:
                this.setNhomHang(NhomHang.TBVP);
                break;
        }
        System.out.println("Nhap gia ban: ");
        double giaban = sc.nextInt();
        System.out.println("nhap so luong: ");
        int soluong = sc.nextInt();
    }
}
