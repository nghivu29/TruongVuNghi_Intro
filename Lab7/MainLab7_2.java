package Lab7;

import java.util.Scanner;

public class MainLab7_2 {
    public static void main(String[] args) {
        PROCDUCT sp1 = new PROCDUCT();
        PROCDUCT sp2 = new PROCDUCT();
        PROCDUCT sp3 = new PROCDUCT();
        PROCDUCT sp4 = new PROCDUCT();
        PROCDUCT sp5 = new PROCDUCT();

        Scanner sc = new Scanner(System.in);
        System.out.println("***sp1:");
        System.out.println("Nhap ten san pham:");
        sp1.tenSanPham = sc.nextLine();
        System.out.println("Nhap don gia: ");
        sp1.giaBan = sc.nextInt();
        System.out.println("Nhap so luong");
        sp1.soLuong = sc.nextInt();

//        System.out.println("***sp2:");
//        System.out.println("Nhap ten san pham:");
//        sp2.tenSanPham = sc.nextLine();
//        System.out.println("Nhap don gia: ");
//        sp2.giaBan = sc.nextInt();
//        System.out.println("Nhap so luong");
//        sp2.soLuong = sc.nextInt();
//
//        System.out.println("***sp3:");
//        System.out.println("Nhap ten san pham:");
//        sp3.tenSanPham = sc.nextLine();
//        System.out.println("Nhap don gia: ");
//        sp3.giaBan = sc.nextInt();
//        System.out.println("Nhap so luong");
//        sp3.soLuong = sc.nextInt();
//
//        System.out.println("***sp4:");
//        System.out.println("Nhap ten san pham:");
//        sp4.tenSanPham = sc.nextLine();
//        System.out.println("Nhap don gia: ");
//        sp4.giaBan = sc.nextInt();
//        System.out.println("Nhap so luong");
//        sp4.soLuong = sc.nextInt();
//
//        System.out.println("***sp5:");
//        System.out.println("Nhap ten san pham:");
//        sp5.tenSanPham = sc.nextLine();
//        System.out.println("Nhap don gia: ");
//        sp5.giaBan = sc.nextInt();
//        System.out.println("Nhap so luong");
//        sp5.soLuong = sc.nextInt();

        sp1.hienThi();
    }
}
