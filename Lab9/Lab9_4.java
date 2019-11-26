package Lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab9_4 {
    //error case 5, 6, 7, 9

    public static void main(String[] args) {
        //var
        List<Student> list = null;
        Scanner sc = new Scanner(System.in);
        int choose;
        boolean hasList = false;
        String error;

        do {
            System.out.println("\nChuong trinh quan ly danh sach sinh vien su dung ArrayList\n" +
                    "================================================\n" +
                    "1- khoi tao danh sach.\n" +
                    "2- them 1 sinh vien vao danh sach.\n" +
                    "3- duyet danh sach.(va in ra danh sach)\n" +
                    "4- tim thong tin sinh vien theo ten sinh vien.\n" +
                    "5- sua diem cho sinh vien.\n" +
                    "6- danh sach sinh vien duoc nhan hoc bong\n" +
                    "7- xem diem cua sinh vien.\n" +
                    "8- sap xep danh sach giam dan theo DTB\n" +
                    "9- sap xep danh sach giam dan theo DTB, tang dan theo ten\n" +
                    "0- thoat chuong trinh\n");

            System.out.print("Choose: ");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    if (hasList == false){
                        list = new ArrayList<>();
                        System.out.println("Danh sach hoc sinh da duoc khoi tao.");
                        hasList = true;
                    }else System.out.println("Danh sach nay da duoc khoi tao truoc do.");
                    break;

                case 2:
                    try {
                        Student newStudent = new Student();
                        list.add(newStudent);
                        newStudent.input_student();
                    }catch (Exception e){
                        System.out.println("Co ve ban chua khoi tao danh sach");
                    }
                    break;

                case 3:
                    Student.showListStudent(list);
                    break;

                case 4:
                    System.out.print("Nhap ten hoc sinh can tim: ");
                    error = sc.nextLine();
                    String name = sc.nextLine();
                    Student temp = Student.searchStudent(name, list);

                    if (temp != null){
                        System.out.println("Co phai y ban la:");
                        temp.output_student();
                    }else System.out.println("Khong tim thay hoc sinh nay.");

                    break;

                case 5:
                    System.out.print("Nhap ma sinh vien: ");
                    error = sc.nextLine();
                    String code = sc.nextLine();
                    Student student = Student.searchCode(code, list);

                    if (student != null){
                        System.out.println("Sua diem co sinh vien: "+ student.s_name);
                        System.out.print("Nhap diem TB moi: ");
                        float newMark = sc.nextFloat();
                        student.set_mark(newMark);
                        System.out.println("Diem TB da duoc doi");
                    }else System.out.println("Khong tim thay sinh vien co ma SV nay");
                    break;

                case 6:
                    List<Student> listSchoolaship = Student.listSchoolarship(list);

                    if (listSchoolaship.size() > 0) {
                        System.out.println("Danh sach hoc vien duoc nhan hoc bong: ");
                        for (Student i: listSchoolaship)
                            System.out.println(" -"+ i.s_name);
                    }
                    else System.out.println("Khong co sinh vien nao duoc nhan hoc bong ");

                    break;

                case 7:
                    System.out.print("Nhap ma sinh vien: ");
                    error = sc.nextLine();
                    String code2 = sc.nextLine();
                    Student student2 = Student.searchCode(code2, list);

                    if (student2 != null)
                        System.out.println("Diem TB: "+ student2.s_mark);
                    else System.out.println("Khong tim thay hoc vien nay");
                    break;

                case 8:
                    Student.listD(list);
                    System.out.println("Da sap xep");
                    break;

                case 9:// sap xep se phan biet chu thuong va chu hoa (hoa truoc thuong sau)
                    try {
                        Student.listDT(list);
                        System.out.println("Da sap xep");
                    }catch (Exception e){
                        System.out.println("Tam thoi khong the sap sep hay thu lai");
                    }
                    break;

                case 0:
                    System.out.println("CAM ON BAN DA SU DUNG CHUONG TRINH. HEN GAP LAI!");
                    System.exit(0);

            }

        }while (true);
    }
}
