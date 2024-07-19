package Enitry;

public class ChiTietBanHang {
    private MatHang matHang;
    private int soLuong;

    public ChiTietBanHang(MatHang matHang, int soLuong) {
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    @Override
    public String toString() {
        return "ChiTietBanHang{" +
                "matHang=" + matHang +
                ", soLuong=" + soLuong +
                '}';
    }
}
