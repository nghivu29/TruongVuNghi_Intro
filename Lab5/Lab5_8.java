package Lab5;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab5_8 {
    static boolean kiemTraKituThuong(char kiTu){
        //phuong thuc se tra ve true neu do la chu thuong
        if (kiTu >= 97 && kiTu <= 122)
            return true;
        else System.out.println("error\nHay nhap lai");
        return false;
    }

    static void onlyReadLowerChar(char[] arr){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap mang:");
        for (int i = 0; i < arr.length; i++) {
            do {
                System.out.print("arr[" + i + "] = ");
                arr[i] = sc.next().charAt(0);
            }while (kiemTraKituThuong(arr[i]) == false);
        }
    }

    static void PrintToUpperArray(char[] arr){
        System.out.println("Cac phan tu cua mang sau khi duoc in hoa:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + Character.toUpperCase(arr[i]));
        }
    }

    public static void main(String[] args) {
        char[] arr = new char[10];
        onlyReadLowerChar(arr);
        PrintToUpperArray(arr);
    }
}
