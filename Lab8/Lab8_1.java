package Lab8;

import java.util.Scanner;

public class Lab8_1 {
    //chương trình nhập vào một chuỗi và một kí tự, xuất ra màn hình số lần xuất hiện của kí tự đó
    short demKiTu(String string, char character){
        char[] arr = string.toCharArray();
        short count = 0;

        for(char i: arr){
            if (i == character) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String string = new String();
        Scanner scanner = new Scanner(System.in);
        Lab8_1 call = new Lab8_1();

        System.out.println("Nhập vào một chuỗi kí tự: ");
        string = scanner.nextLine();
        System.out.println("Nhập vào một kí tự cần kiểm tra: ");
        char c = scanner.next().charAt(0);
        System.out.println("So lan ki tu suat hien trong chuoi la: "+ call.demKiTu(string, c));

    }
}
