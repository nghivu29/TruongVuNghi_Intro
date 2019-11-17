package Lab8;

import Lab3.Lab3_6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab8_2 {
    // đếm số nguyên âm
    int soNguyenAm(String string){
        char[] arr = string.toCharArray();
        int count = 0;

        for (char i: arr){
            if (Lab3_6.kiemTraNguyenAm(i))
                count++;
        }
        return count;
    }

    int soPhuAm(String string){
        return string.length() - soNguyenAm(string);
    }

    int soTu(String string){
        StringTokenizer word = new StringTokenizer(string);
        return word.countTokens();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lab8_2 object = new Lab8_2();

        System.out.println("Nhập chuỗi: ");
        String string = sc.nextLine();
        System.out.println("Số kí tự trong chuỗi: "+ string.length());
        System.out.println("Số nguyên âm trong chuỗi: "+ object.soNguyenAm(string));
        System.out.println("Số phụ âm trong chuỗi: "+ object.soPhuAm(string));
        System.out.println("Số từ trong chuỗi: "+ object.soTu(string));

    }
}
