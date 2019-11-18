package Lab8;

import Lab3.Lab3_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab8_4_failure {
    // chương trình chuẩn hóa kí tự
    String chuanHoa(String string){
        string = string.trim();
        char[] arr = string.toCharArray();
        List<Character> list = new ArrayList<>();

        Lab8_3.arrToList(arr, list);
        removeSpiecal(list);
        removeSpaces(list);
        list.set(0, Character.toUpperCase(list.get(0)));
        string = String.valueOf(list);
//        string = list.toString();

        return string;
    }

    void removeSpaces (List<Character> list){
        for (int i = 0; i < list.size() - 1; i++) {// gỡ khoảng trắng trùng lặp
            if (list.get(i) == list.get(i+1) && list.get(i) == 32){
                list.remove(i);
                i--;
            }
        }
    }

    // hàm này hơi khác với hàm ở lab 8_3 vì nó không gỡ bỏ kí tự khoảng trắng
    void removeSpiecal(List<Character> list){
        for (int i = 0; i < list.size(); i++) {
            if (Lab3_6.kiemTraAlphabet(list.get(i)) == false && list.get(i) != 32){
                list.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can chuan hoa: ");
        String string = sc.nextLine();
        Lab8_4_failure obj = new Lab8_4_failure();
        System.out.println("Chuoi da duoc chuan hoa: "+ obj.chuanHoa(string));

    }

}
