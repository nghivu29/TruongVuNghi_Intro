package Lab5;

import java.util.Scanner;

public class Lab5_6 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        nhapXuat.taoMangNgauNhien(arr);
        nhapXuat.xuatMang(arr);

        System.out.print("Nhap x = ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.print("Cac so chia het x trong mang tren la: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % x == 0) System.out.print(arr[i] +" ");
        }
    }
}
