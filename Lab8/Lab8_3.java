package Lab8;

import Lab3.Lab3_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab8_3 {
    //chuyển mảng tỉnh thành mảng động
    static void arrToList(char[] arr, List<Character> list){
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }

    //xóa các kí tự đặc biệt
    static void removeSpiecalChar(List<Character> list){
        for (int i = 0; i < list.size(); i++) {
            if (Lab3_6.kiemTraAlphabet(list.get(i)) == false){
                list.remove(i);
                i--;
            }
        }
    }

    //phương thức kiểm tra chuỗi Palindrome
    static boolean palindrome(String string){
        string = string.toLowerCase();  // không phân biệt chữ hoa thường
        char[] arr = string.toCharArray();  // đổi chuổi thành mảng
        List<Character> list = new ArrayList<Character>();
        arrToList(arr, list); // đổi mảng thành list
        removeSpiecalChar(list);// gỡ bỏ các kí tự đặc biệt trong list

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == list.get(list.size() - 1 - i))
                continue;
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String string = sc.nextLine();

        if (palindrome(string))
            System.out.println("Chuỗi vừa nhập là chuỗi Palindrome.");
        else System.out.println("Chuỗi vừa nhập không phải là chuỗi Palindrome.");
    }
}
