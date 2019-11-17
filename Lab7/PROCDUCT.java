package Lab7;

import java.util.Scanner;

public class PROCDUCT {
    String tenSanPham;
    int soLuong;
    int giaBan;

    PROCDUCT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSanPham = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.print("Nhap gia ban: ");
        giaBan = sc.nextInt();
        System.out.println("=====================");
    }

    int tinhTongTien(){
        return soLuong * giaBan;
    }

    void hienThi(){
        char c = '|';
        System.out.format("%10c%-20s", c, tenSanPham);
        System.out.format("%c%-20d", c, giaBan);
        System.out.format("%c%-20d", c, soLuong);
        System.out.format("%c%-20d", c, tinhTongTien());
        System.out.println();
    }
}
