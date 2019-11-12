package Lab5;

import Lab4.Lab4_7;

import java.util.Scanner;

public class Lab5_7 {
    static boolean nhapMangNgyenTo(int[] arr){
        /*phương thức kiểm tra các phân tử trong mảng có phải số nguyên tố và nhập lại số không phải
          Phương thức trả về false khi vẫn còn phần tử không phải SNT
         */
        Scanner sc = new Scanner(System.in);
        int check = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Lab4_7.kiemTraSNT(arr[i]) == false){
                System.out.print("Hay nhap lai arr["+ i +"] = ");
                arr[i] = sc.nextInt();
                check++;
            }
        }
        if (check == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        nhapXuat.nhapMang(arr);

        while (nhapMangNgyenTo(arr) == false) {
            System.out.println("Mang van con phan tu khong phai la so nguyen to");
            nhapMangNgyenTo(arr);
        }

        System.out.println("\nTat ca cac phan tu cua mang deu la so nguyen to");
        nhapXuat.xuatMang(arr);
    }
}
