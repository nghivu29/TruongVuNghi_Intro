package Lab11;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab11_4 {
    static FileInputStream fileIn;
    static ObjectInputStream objIn;
    static FileOutputStream fileOut;
    static ObjectOutputStream objOut;
    static List<NhanVien11_3> list;

    static void docFile() throws IOException {
        try {
            fileIn = new FileInputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\black cat\\introduce programming\\src\\Lab11\\nhanvien.dat");
            objIn = new ObjectInputStream(fileIn);

            list = (List<NhanVien11_3>) objIn.readObject();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (fileIn != null) fileIn.close();
            if (objIn != null) objIn.close();
        }
    }

    static void showList(){
        for (NhanVien11_3 i: list){
            i.hienThi();
        }
    }

    static void ghiListVaoFile() throws IOException {
        try {
            fileOut = new FileOutputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\black cat\\introduce programming\\src\\Lab11\\nhanvien.dat");
            objOut = new ObjectOutputStream(fileOut);

            objOut.writeObject(list);

        }catch (Exception e){
            System.out.println(e);

        }finally {
            if (fileOut != null) fileOut.close();
            if (objOut != null) objOut.close();
        }
    }

    static void timTheoTen(String ten){
        for (NhanVien11_3 i: list){
            if (ten.equals(i.getHoTen()))
                i.hienThi();
        }
    }

    static void suaLuong(String maSo){
        for (NhanVien11_3 i: list){
            if (maSo.equals(i.getMaSo())){
                System.out.print("Nhap tien luong moi: ");
                int luongMoi = new Scanner(System.in).nextInt();
                i.setLuong(luongMoi);
            }
        }
    }

    static void luongTheoMaSo(String maso){
        for (NhanVien11_3 i: list){
            if (maso.equals(i.getMaSo()))
                System.out.println("Luong cua nhan vien nay la"+ i.getLuong());
        }
    }

    static void sapXep(){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getLuong() < list.get(j).getLuong())
                    Collections.swap(list, i, j);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        char choose;
        String maSo;
        String temp;

        while (true){
            System.out.println("\nCHUONG TRINH QUAN LY DANH SACH NHAN VIEN\n" +
                    "================================================\n" +
                    "1- Xem danh sach nhan vien.\n" +
                    "2- Them 1 nhan vien vao danh sach.\n" +
                    "3- Tim thong tin nhan vien theo ten.\n" +
                    "4- Sua luong cua 1 nhan vien theo ma so.\n" +
                    "5- Xem luong cua 1 nhan vien theo ma so.\n" +
                    "6- Xem danh sach nhan vien sap xep giam dan theo luong.\n" +
                    "0- Thoat chuong trinh.");

            System.out.print("Ban chon: ");
            choose = sc.next().charAt(0);

            switch (choose){
                case '1':
                    docFile();
                    showList();
                    break;

                case '2':
                    list.add(new NhanVien11_3());
                    ghiListVaoFile();
                    break;

                case '3':
                    docFile();
                    System.out.print("Nhap ten can tim: ");
                    temp = sc.nextLine();
                    String ten = sc.nextLine();
                    timTheoTen(ten);
                    break;

                case '4':
                    docFile();
                    System.out.print("Nhap ma so nhan vien: ");
                    temp = sc.nextLine();
                    maSo = sc.nextLine();
                    suaLuong(maSo);
                    ghiListVaoFile();
                    break;

                case '5':
                    docFile();
                    System.out.print("Nhap ma so nhan vien: ");
                    temp = sc.nextLine();
                    maSo = sc.nextLine();
                    luongTheoMaSo(maSo);
                    break;

                case '6':
                    docFile();
                    sapXep();
                    ghiListVaoFile();
                    showList();
                    break;

                case '0':
                    System.exit(0);
                    break;
            }
        }


    }
}
