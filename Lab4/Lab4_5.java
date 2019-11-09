package Lab4;

import java.util.Scanner;

public class Lab4_5 {
    static int tongCacChuSo(int n){
        int tong = 0;
        int soCuoi = 0;
        for (;n != 0; n /= 10){
            soCuoi = n % 10;
            tong += soCuoi;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Nhap n");
            n = sc.nextInt();
        }while (n < 0);

        System.out.println("Tong cac chu so cua n la: " + tongCacChuSo(n));
    }
}
