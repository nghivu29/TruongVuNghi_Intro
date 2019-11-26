package Lab9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lab9_5 {
    public static void main(String[] args) {
        char choose;
        String tenSanPham;
        int gia;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChuong trinh quan ly danh sách sản phẩm SHOP ABC\n" +
                    "================================================\n" +
                    "1- khoi tao danh sach.\n" +
                    "2- them 1 san pham vao danh sach.\n" +
                    "3- xoa 1 san pham ra khoi danh sach.\n" +
                    "4- duyet danh sach.(va in ra danh sach)\n" +
                    "5- tim thong san pham theo ten.\n" +
                    "6- tim thong tin san pham theo gia.\n" +
                    "7- tim thong tin san pham theo khoang gia.\n" +
                    "8- sap xep danh sach giam dan theo gia ban.\n" +
                    "0- thoat chuong trinh");
            System.out.print("Ban chon: ");
            choose = new Scanner(System.in).next().charAt(0);

            switch (choose) {
                case '1':// xoa danh sach cu va bat dau voi danh sach moi thay vi khoi tao 1 danh sach moi
                    PRODUCT.resetListProduct();
                    System.out.println("Da tao danh sach moi.");
                    break;

                case '2':
                    PRODUCT newProduct = new PRODUCT();
                    break;

                case '3':
                    System.out.print("Nhap ten san pham can xoa: ");
                    tenSanPham = sc.nextLine();
                    PRODUCT.deleteProduct(tenSanPham);
                    break;

                case '4':
                    PRODUCT.showList();
                    break;

                case '5':
                    System.out.print("Nhap ten san pham can tim: ");
                    tenSanPham = sc.nextLine();
                    PRODUCT.searchProduct(tenSanPham);
                    break;

                case '6':
                    System.out.print("Nhap gia: ");
                    gia = sc.nextInt();
                    PRODUCT.searchProduct(gia);
                    break;

                case '7':
                    case7();
                    break;

                case '8':
                    PRODUCT.sort();
                    break;

                case '0':
                    System.exit(0);
            }
        }
    }

    static void case7(){
        char choose;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Chon muc gia:\n" +
                "1. 0 - 100 000 VND\n" +
                "2. 100 000 - 1 000 000 VND\n" +
                "3. 1 000 000 - 10 000 000 VND");
        System.out.print("Ban chon: ");
        choose = sc.next().charAt(0);

        switch (choose){
            case '1':
                for (PRODUCT i: PRODUCT.danhSachSanPham){
                    if (i.getGia() >= 0 && i.getGia() <= 100000) {
                        i.showInfor();
                        count++;
                    }
                }
                if (count == 0) System.out.println("Khong tim thay san pham phu hop");
                break;

            case '2':
                for (PRODUCT i: PRODUCT.danhSachSanPham){
                    if (i.getGia() >= 100000 && i.getGia() <= 1000000){
                        i.showInfor();
                        count++;
                    }
                }
                if (count == 0) System.out.println("Khong tim thay san pham phu hop");
                break;

            case '3':
                for (PRODUCT i: PRODUCT.danhSachSanPham){
                    if (i.getGia() >= 1000000 && i.getGia() <= 1000000) {
                        i.showInfor();
                        count++;
                    }
                }
                if (count == 0) System.out.println("Khong tim thay san pham phu hop");
                break;
        }

    }
}
