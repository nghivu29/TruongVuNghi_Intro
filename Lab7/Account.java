package Lab7;

public class Account {
    private int soTaiKhoang;
    private String tenChuTaiKhoang;
    private double soDu;
    private double laiXuat = 0.045;

    Account(String tenChuTaiKhoang, int soTaiKhoang, double soDu){
        this.tenChuTaiKhoang = tenChuTaiKhoang;
        this.soTaiKhoang = soTaiKhoang;
        this.soDu = soDu;
    }

    public void doiTen(String tenChuTaiKhoang){
        this.tenChuTaiKhoang = tenChuTaiKhoang;
    }

    public void goiTien(int soTienCanGui){
        if (soTienCanGui < 0)
            System.out.println("So tien gui vao khong hop le. ");
        else this.soDu += soTienCanGui;
    }

    public void rutTien(int soTienCanRut){
        if (soTienCanRut < 0)
            System.out.println("So tien rut khong hop le. ");
        if (soTienCanRut > soDu)
            System.out.println("Giao dich rut tien khong duoc thuc hien.");
        else soDu -= soTienCanRut;
    }

    public void congLai(){
        soDu *= (1 + laiXuat);
    }

    public int Get_SoTaiKhoan(){
        return soTaiKhoang;
    }

    public double Get_SoDu(){
        return soDu;
    }


}
