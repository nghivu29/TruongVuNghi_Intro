package Lab11;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Lab11_3 {
    final static void ghiDanhSachDoiTuong(List<NhanVien11_3> list) throws IOException {
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

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

    final static void docDanhSachDoiTuong() throws IOException {
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        List<NhanVien11_3> list = null;

        try {
            fileIn = new FileInputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\black cat\\introduce programming\\src\\Lab11\\nhanvien.dat");
            objIn = new ObjectInputStream(fileIn);

            list =(List<NhanVien11_3>) objIn.readObject();

        }catch (Exception e){
            System.out.println(e);

        }finally {
            if (fileIn != null) fileIn.close();
            if (objIn != null) objIn.close();;
        }

        for (NhanVien11_3 i: list){
            System.out.println("\n===NV"+ i.getMaSo());
            System.out.println("Ho ten: "+ i.getHoTen());
            System.out.println("Tuoi: "+ i.getTuoi());
            System.out.println("Luong: "+ i.getLuong());
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Nhap so luong nhap vien: ");
        int n = new Scanner(System.in).nextInt();
        NhanVien11_3 nhanVienMoi;

        for (int i = 1; i <= n; i++) {
            System.out.println("\n***STT "+ i);
            nhanVienMoi = new NhanVien11_3();
        }

        ghiDanhSachDoiTuong(NhanVien11_3.list);
        System.out.println("\nDoc:");
        docDanhSachDoiTuong();
    }
}
