package Enitry;

public class NhanVienBanHang  extends ConNguoi{
    private static int maNVcount = 1000;
    private int MaNV ;
    private String NgayKiHD;


    public NhanVienBanHang(String hoTen, String diaChi, String soDT, int maNV, String ngayKiHD) {
        super(hoTen, diaChi, soDT);
        MaNV = maNVcount++;
        NgayKiHD = ngayKiHD;
    }

    public static int getMaNVcount() {
        return maNVcount;
    }

    public static void setMaNVcount(int maNVcount) {
        NhanVienBanHang.maNVcount = maNVcount;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int maNV) {
        MaNV = maNV;
    }

    public String getNgayKiHD() {
        return NgayKiHD;
    }

    public void setNgayKiHD(String ngayKiHD) {
        NgayKiHD = ngayKiHD;
    }

    @Override
    public String toString() {
        return "NhanVienBanHang{" +
                super.toString()+
                "MaNV=" + MaNV +
                ", NgayKiHD='" + NgayKiHD + '\'' +
                '}';
    }
}
