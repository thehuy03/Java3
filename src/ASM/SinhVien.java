package ASM;

public class SinhVien {

    String maSV;
    String hoTen;
    String email;
    String sdt;
    String gioiTinh;
    String diaChi;
    String anh;
    

    Double diemAV,diemTH,diemGDTC,diemTB;
    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV , Double diemAV, Double diemTH, Double diemGDTC,Double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemAV = diemAV;
        this.diemTH = diemTH;
        this.diemGDTC = diemGDTC;
        this.diemTB = diemTB;
    }

    public SinhVien(String maSV, String hoTen, String email, String sdt, String diaChi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    public SinhVien(String maSV, String hoTen, String email, String sdt, String gioiTinh, String diaChi, String anh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.anh = anh;
    }
    
    
}
