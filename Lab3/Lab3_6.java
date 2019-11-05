package Lab3;

import java.util.Scanner;

public class Lab3_6 {
    //kiem tra ki tu nhap
    static boolean kiemTraAlphabet(char kiTu){
        if ((kiTu >= 65 && kiTu <= 90) || (kiTu >= 97 && kiTu <= 122))
            return true;

        return false;
    }

    static boolean kiemTraTrongAm(char kiTu){
        if (kiTu == 65 || kiTu == 69 || kiTu == 73 || kiTu == 79 || kiTu == 85 || kiTu == 97 || kiTu == 101 || kiTu == 105 || kiTu == 111 || kiTu ==117 )
            return true;
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot ki tu de kiem tra:");
        char kiTu = sc.next().charAt(0);

        if (kiemTraAlphabet(kiTu) == true)

            if (kiemTraTrongAm(kiTu) == true)
                System.out.println("Ki tu vua nhap la nguyen am");
            else System.out.println("Ki tu vau nhap la phu am");

        else System.out.println("Ki tu vua nhap khong nam trong bang chu cai");
    }
}
