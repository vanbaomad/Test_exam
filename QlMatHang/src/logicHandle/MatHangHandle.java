package logicHandle;

import Enitry.MatHang;

import java.util.Scanner;

public class MatHangHandle {


    private MatHang[] danhSachMatHang;
    private int soLuongMatHang;
    public int getMatHangLength(){
        return danhSachMatHang.length;
    }
    public void inputNewMatHang(){
        System.out.print("Nhap so luong mat hang them moi");
        int MHcount = new Scanner(System.in).nextInt();
        for (int i = 0; i < MHcount; i++) {
            System.out.println("Nhap dau sach thu "+(i+1));
            MatHang mh = new MatHang();
            mh.infor();
            saveMH(mh);

        }
    }

    public void saveMH(MatHang mh) {
        for (int i = 0; i <getMatHangLength() ; i++) {
                if (danhSachMatHang[i] == null){
                    danhSachMatHang[i] = mh;
                    break;
                }
        }
    }
    public void printMH() {
        System.out.println("Danh sach mat hang:");
        for (int i = 0; i < soLuongMatHang; i++) {
            System.out.println(danhSachMatHang[i]);
        }
    }
    public MatHang timMatHang(int maHang) {
        for (int i = 0; i < soLuongMatHang; i++) {
            if (danhSachMatHang[i].getMaHang() == maHang) {
                return danhSachMatHang[i];
            }
        }
        return null;
    }


}
