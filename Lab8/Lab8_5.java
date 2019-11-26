package Lab8;

import java.util.Scanner;

public class Lab8_5 {
    public static void main(String[] args) {
        while (true) {
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


            }
        }
    }
}
