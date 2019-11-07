package Lab4;

import Lab3.Lab3_6;

import java.util.Scanner;

public class Lab4_2 {
    static boolean kiemTraSo(char kiTu){
        if (kiTu >= 48 && kiTu <= 57)
            return true;
    return false;
    }

    static void kiemTraKitu(char kiTu){
        if (Lab3_6.kiemTraAlphabet(kiTu) == true) // lay phuong thuc kiem tra chu cai o Lab3_6
            System.out.println("Ki tu vua nhap la chu cai");
        else if (kiemTraSo(kiTu) == true)
            System.out.println("Ki tu vua nhap la so");
        else System.out.println("Ki tu vua nhap la ki tu dac biet");
    }

    public static void main(String[] args) {
        char kiTu;
        do {
            System.out.println("\nNhap vao mot ki tu");
            Scanner sc = new Scanner(System.in);
            kiTu = sc.nextLine().charAt(0);
            kiemTraKitu(kiTu);
        }while (kiTu != 32);

    }
}
