package Lab7;

import java.util.Scanner;

public class MainLab7_3 {
    public static void main(String[] args) {
        //em lười viết thêm kiểm tra điểm có từ 0 đến 10 lắm mà đề cũng không yêu cầu
        MARK[] arr = new MARK[8];
        MARK2 mark = new MARK2();

        System.out.println("1- Nhap danh sach mon hoc\n" +
                           "2- Hien thi danh sach\n" +
                           "3- Diem TB cao nhat\n" +
                           "4- Thoat");



        do {
            System.out.println("\n=========================");
            System.out.print("Ban chon: ");
            Scanner sc = new Scanner(System.in);
            byte choose = sc.nextByte();
            switch (choose){
                case 1:
                    mark.nhapDanhSachMonHoc(arr);
                    break;
                case 2:
                    mark.xuatDanhSachMonHoc(arr);
                    break;
                case 3:
                    System.out.println("Nhung mon co diem tb cao nhat: ");
                    mark.diemTBcaoNhat(arr);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (true);

    }

}
