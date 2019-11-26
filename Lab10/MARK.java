package Lab10;

import java.util.Scanner;

public class MARK {
    String TenMonHoc;
    float DiemLT ;
    float DiemTH ;

    public void NhapMonHoc(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten mon hoc: ");
        TenMonHoc = sc.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
        DiemLT = sc.nextFloat();
        System.out.print("Nhap diem thuc hanh: ");
        DiemTH = sc.nextFloat();
    }
    public void XuatMonHoc(){

        System.out.println("THONG TIN VE MON HOC");
        System.out.println("================================");
        System.out.println("Ten mon hoc: "+ TenMonHoc);
        System.out.println("Diem ly thuyet: "+ DiemLT);
        System.out.println("Diem thuc hanh: "+ DiemTH);
        System.out.print("Diem trung binh: " + TinhDTB());
    }
    public float TinhDTB(){
        return (DiemLT + DiemTH) / 2;
    }

    public static void nhapDanhSachMonHoc(MARK[] arr){
        for (int i = 0; i < arr.length; i++) {
            MARK monHoc = new MARK();
            System.out.println("Mon thu "+ (i + 1) + " : ");
            monHoc.NhapMonHoc();
            arr[i] = monHoc;
        }
    }

    public static void xuatDanhSachMonHoc(MARK[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n\nMon thu "+ (i + 1) +" : ");
            arr[i].XuatMonHoc();
        }
    }

    //sap xep theo thu tu giam dan cua diem TB
    static void sort(MARK[] arr){
        MARK temp = null;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].TinhDTB() < arr[j].TinhDTB()) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
