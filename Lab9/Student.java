package Lab9;

import javax.sound.midi.Soundbank;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student {

    String s_code;
    String s_name;
    int s_age;
    float s_mark;

    //tao mot danh sach hoc bong tu danh sach sinh vien
    static List<Student> listSchoolarship(List<Student> list){
        List<Student> listSchoolarship = new ArrayList<>();

        for (Student i: list){
            if (i.s_mark >= 8){
                listSchoolarship.add(i);
            }
        }
        return listSchoolarship;
    }

    static Student searchCode(String code, List<Student> list){
        for(Student i: list){
            if (i.s_code.equals(code))
                return i;
        }

        return null;
    }

    final static boolean showListStudent(List<Student> list) {
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("***STT " + (i+1));
                System.out.println("Ma sinh vien: " + list.get(i).s_code);
                System.out.println("Ten: " + list.get(i).s_name);
                System.out.println("Tuoi: " + list.get(i).s_age);
                System.out.println("Diem TB: " + list.get(i).s_mark);

            }
            return true;
        }

        return false;
    }

    final static Student searchStudent(String s_name ,List<Student> list){
        for (Student i: list){
            if (i.s_name.contains(s_name))
                return i;
        }

        return null;
    }

    //xap xep danh sach sinh ven theo thu tu diem giam dan
    static List<Student> listD(List<Student> list){
        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (list.get(j).s_mark > list.get(j-1).s_mark)
                    Collections.swap(list, j, j - 1);
            }
        }

        return list;
    }

    private static boolean S1truocS2(String s1, String s2){
        String temp;

            for (int i = 0; i < s1.length() || i < s2.length(); i++)
                if (s1.charAt(i) < s2.charAt(i))
                    return true;

        return false;
    }

   /* private static void sortAbc(List<Student> list, int beginIndex, int endIndex){
        for (int i = beginIndex; i < endIndex; i++) {
            for (int j = i + 1; j <= endIndex; j++) {
                if (S1truocS2(list.get(i).s_name, list.get(j).s_name) == false)
                    Collections.swap(list, i, j);
            }
        }
    }*/

    //danh sach sinh vien theo diem giam dan va theo alpha neu diem bang nhau
    static List<Student> listDT(List<Student> list){
        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (list.get(j).s_mark > list.get(j-1).s_mark)
                    Collections.swap(list, j, j - 1);
                if (list.get(j).s_mark == list.get(j-1).s_mark){
                    if (S1truocS2(list.get(j).s_name, list.get(j-1).s_name))
                        Collections.swap(list, j, j-1);
                }
            }
        }

        return list;
    }

    public void input_student()//nhập thông tin 1 sinh viên
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        s_code = sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        s_name = sc.nextLine();
        System.out.print("Nhap tuoi sinh vien: ");
        s_age = sc.nextInt();
        System.out.print("Nhap diem sinh vien: ");
        s_mark = sc.nextInt();
    }

    public void output_student()//xuất thông tin 1 sinh viên
    {
        System.out.println("Ma sinh vien: " + s_code);
        System.out.println("Ten: " + s_name);
        System.out.println("Tuoi: " + s_age);
        System.out.println("Diem TB:" + s_mark);
    }

    //kiểm tra xem sinh viên có được học bổng không (nếu s_mark>8)?
    public boolean check_scholarship() {
        if (s_mark > 8)
            return true;
        return false;
    }

    public String get_name()//trả về tên sinh viên
    {
        return s_name;
    }

    public String get_code()//trả về mã sinh viên
    {
        return s_code;
    }

    public Float get_mark()//trả về ĐTB của sinh viên
    {
        return s_mark;
    }

    public void set_mark(float newMark)//sửa điểm cho sinh viên
    {
        s_mark = newMark;
    }

    public void set_code(String newCode) {
        s_code = newCode;
    }

    public void set_name(String newName) {
        s_name = newName;
    }

    public void set_age(int newAge) {
        s_age = newAge;
    }


}
