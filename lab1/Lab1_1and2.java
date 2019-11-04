package lab1;

import java.util.Scanner;

public class Lab1_1and2 {
    //chuong trinh nhap xuat thong tin ung vien

    static class ungVienSo1{
        String hoTen;
        int namSinh;
        String gioiTinh;
        double chieuCao;
        double canNang;
        String queQuan;
        String chuyenNganh;
        double diemTB;

        void nhap(){
            Scanner ungVien = new Scanner(System.in);

            System.out.print("\t+Nhap ho ten: ");
            hoTen = ungVien.nextLine();
            System.out.print("\t+Nhap nam sinh: ");
            namSinh = ungVien.nextInt();
            System.out.print("\t+Nhap gioi tinh: ");
            gioiTinh = ungVien.next();
            System.out.print("\t+Nhap chieu cao: ");
            chieuCao = ungVien.nextDouble();
            System.out.print("\t+Nhap can nang: ");
            canNang = ungVien.nextDouble();
            String boEnter = ungVien.nextLine();        // doc di mot ki tu \n
            System.out.print("\t+Nhap que quan: ");
            queQuan = ungVien.nextLine();
            System.out.print("\t+Nhap chuyen nganh: ");
            chuyenNganh = ungVien.nextLine();
            System.out.print("\t+Nhap diem TB: ");
            diemTB = ungVien.nextDouble();
        }

        void xuat(){
            System.out.println("\t+Ho ten: " + hoTen);
            System.out.println("\t+Nam sinh: " + namSinh);
            System.out.println("\t+Gioi tinh: " + gioiTinh);
            System.out.println("\t+Chieu cao: " + chieuCao);
            System.out.println("\t+Can nang: " + canNang);
            System.out.println("\t+Que quan: " + queQuan);
            System.out.println("\t+Chuyen nganh: " + chuyenNganh);
            System.out.println("\t+Diem TB: " + diemTB);
        }

        void xuat2(){
            System.out.println(String.format("\t%-20s%-20d%-20s%-20.2f%-20.2f%-20s%-20s%-20.2f", hoTen, namSinh, gioiTinh, chieuCao, canNang, queQuan, chuyenNganh, diemTB));
        }
    }

    static class ungVienSo2 extends ungVienSo1{}
    static class ungVienSo3 extends ungVienSo1{}


    public static void main(String[] args) {
        ungVienSo1 so1 = new ungVienSo1();
        ungVienSo2 so2 = new ungVienSo2();
        ungVienSo3 so3 = new ungVienSo3();

        System.out.println("Chuong trinh nhap xuat thong tin ung vien");
        System.out.println("=========================================");

        System.out.println("****Moi nhap ung vien so 1:");
        so1.nhap();
        System.out.println("****Moi nhap ung vien so 2:");
        so2.nhap();
        System.out.println("****Moi nhap ung vien so 3:");
        so3.nhap();

        System.out.println("==============================");
        System.out.println("Danh sach cac ung vien da nhap");
        System.out.println("==============================");

        //in kieu 1
        System.out.println("****Ung vien so 1");
        so1.xuat();
        System.out.println("****Ung vien so 2");
        so2.xuat();
        System.out.println("****Ung vien so 3");
        so3.xuat();

        //in kieu 2
        String hoTen = "ho ten", namSinh = "nam sinh", chieuCao = "chieu cao", gioiTinh ="gioi tinh", canNang = "can nang", queQuan = "que quan", chuyenNganh = "chuyen nganh", diemTB = "diem TB";
        System.out.println(String.format("\n\nSTT\t%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", hoTen, namSinh, gioiTinh, chieuCao, canNang, queQuan, chuyenNganh, diemTB));
        System.out.println("======================================================================================================================================================================");
        System.out.print("1"); so1.xuat2();
        System.out.print("2"); so2.xuat2();
        System.out.print("3"); so3.xuat2();
    }

}
