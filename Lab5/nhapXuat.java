package Lab5;

import java.util.Random;
import java.util.Scanner;

public class nhapXuat {
    public static void nhapMang(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap mang:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] arr) {
        System.out.println("Cac phan tu chan cua mang:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void taoMangNgauNhien(int[] arr){
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(50);
        }
    }
}
