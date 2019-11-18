package Lab8;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab8_5 {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("\n\n+---------------------------------------------------------+\n" +
                    "|                     Menu                                |\n" +
                    "+---------------------------------------------------------+\n" +
                    "|  1. Nhap them mot hoc vien moi                          |\n" +
                    "|  2. Tim kiem hoc vien                                   |\n" +
                    "|  3. Chuan hoa ten hoc vien                              |\n" +
                    "|  4. Hien thi danh sach hoc vien                         |\n" +
                    "|  0. Thoat chuong trinh                                  |\n" +
                    "+---------------------------------------------------------+\n" +
                    "   Moi ban chon: ");
            char choose = sc.next().charAt(0);
            String enter = sc.nextLine();
            System.out.println("==============================================");


            String name;
            switch (choose){

                case '1':
                    System.out.print("Nhap ten hoc vien moi: ");
                    name = sc.nextLine();
                    hocVien newStuden = new hocVien(name);
                    QuanLiHocVien.listHocVien.add(newStuden);
                    break;
                case '2'://sai cả so sánh đối tượng và trả về đối tượng
                    System.out.print("Nhap ten hoc vien can tim: ");
                    name = sc.nextLine();
                    System.out.print("Hoc vien do la: ");
                    hocVien toCheck = (hocVien) QuanLiHocVien.checkStudent(name);
                    System.out.println(toCheck.getName());
                    break;
                case '3':
                    for (hocVien i: QuanLiHocVien.listHocVien){
                        i.setName(Lab8_4.standardize(i.getName()));
                    }
                    System.out.println("Ten cua tat ca hoc vien da duoc chuan hoa.");
                    break;
                case '4':
                    System.out.println("Hien thi danh sach tat ca hoc vien:");
                    QuanLiHocVien toShow = new QuanLiHocVien();
                    toShow.showListStudent();
                    break;
                case '0':
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0);
            }
        }

    }
}
