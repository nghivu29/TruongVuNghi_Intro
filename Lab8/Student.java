package Lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Lab8_4 {
    String name;
    int age;
    static int count;
    int no = count + 1;
    static List<Student> list = new ArrayList<>();

    Student() {
        count++;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    Student(String name) {
        this(name, -1);
    }

    static boolean addStudent(String name) {
        Student student = new Student(name);

        if (list.add(student))
            return true;
        return false;
    }

    static boolean checkStudent(String nameStudent) {
        if (list.size() > 0) {
            for (Student i : list) {
                if (i.name.contains(nameStudent)){
                    System.out.println("Hoc vien do la: ");
                       i.showStudent();
                }

            }
        }
        return false;
    }

    static boolean showListStudent() {
        if (list.size() > 0) {
            for (Student i : list) {
                System.out.println(i.no + ". " + i.name);
            }
            return true;
        }

        return false;
    }

    boolean showStudent() {
        if (hasStudent()) {
            System.out.println(no + ". " + name);
            return true;
        }
        return false;
    }

    boolean hasStudent() {
        if (name == null)
            return false;
        return true;
    }

    static void standardizeListStudent() {
        for (Student i : list) {
            i.name = standardize(i.name);
        }
    }

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


            String nameStudent = null;
            switch (choose){
                case '1':
                    System.out.print("Nhap ten hoc vien moi: ");
                    nameStudent = sc.nextLine();
                    addStudent(nameStudent);
                    break;
                case '2':
                    System.out.print("Nhap ten hoc sinh can tim: ");
                    nameStudent = sc.nextLine();
                    checkStudent(nameStudent);
                    break;
                case '3':
                    standardizeListStudent();
                    System.out.println("Tat ca cac ten hoc vien da duoc chuan hoa.");
                    break;
                case '4':
                    System.out.println("Hien thi danh sach hoc vien: ");
                    showListStudent();
                    break;
                case '0':
                    System.exit(0);
                    break;
            }




        }
    }
}
