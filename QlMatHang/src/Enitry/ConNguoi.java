package Enitry;

public class ConNguoi {
    private String hoTen;
    private String DiaChi;
    private String soDT;

    public ConNguoi(String hoTen, String diaChi, String soDT) {
        this.hoTen = hoTen;
        DiaChi = diaChi;
        this.soDT = soDT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    @Override
    public String toString() {
        return "ConNguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", soDT='" + soDT + '\'' +
                '}';
    }
}
