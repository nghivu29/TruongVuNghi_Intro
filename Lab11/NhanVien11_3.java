package Lab11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanVien11_3 implements Serializable {
    private String maSo;
    private String hoTen;
    private int tuoi;
    private int luong;
    static List<NhanVien11_3> list = new ArrayList<>();

    NhanVien11_3(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ma so: ");
        maSo = sc.nextLine();
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Luong: ");
        luong = sc.nextInt();

        list.add(this);
    }

    void hienThi(){
        System.out.println("===NV"+ maSo);
        System.out.println("Ho ten: "+ hoTen);
        System.out.println("Tuoi: "+ tuoi);
        System.out.println("Luong: "+ luong);

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }
}
