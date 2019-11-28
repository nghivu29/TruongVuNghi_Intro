package Lab11;

import java.util.Scanner;

public class NhanVien11_2 {
    private String hoTen;
    private int tuoi;
    private int luong;

    NhanVien11_2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nHo ten: ");
        hoTen = sc.nextLine();
        System.out.print("Tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Luong: ");
        luong = sc.nextInt();
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
}
