package Lab5;

import java.util.Random;
import java.util.Scanner;

public class Lab5_1 {
    // nhập mảng và xuất ra các phần tử lẻ của mảng
    static void nhapMang (int[] arr){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap mang:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+ i +"] = ");
            arr[i] = sc.nextInt();
        }
    }

    static void xuatMang_chan(int[] arr){
        System.out.println("Cac phan tu chan cua mang:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.println("arr["+ i +"] = "+ arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        nhapMang(arr);
        xuatMang_chan(arr);
    }
}
