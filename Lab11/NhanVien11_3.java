package Lab11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanVien11_3 implements Serializable {
    private int no = count;
    private String hoTen;
    private int tuoi;
    private int luong;
    static List<NhanVien11_3> list = new ArrayList<>();
    static int count = 1;

    NhanVien11_3(){
        Scanner sc = new Scanner(System.in);

        count++;

        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Luong: ");
        luong = sc.nextInt();

        list.add(this);
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

    public int getNo(){
        return no;
    }
}
