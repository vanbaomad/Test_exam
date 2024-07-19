package Constant;

public enum NhomHang {
    DT("Dien tu"),
    DL("Dien lanh"),
    MT("May tinh"),
    TBVP("Thiet bi van Phong");
    public String value;

    public String getValue() {
        return value;
    }

    NhomHang(String s) {
        this.value = value;
    }
}
