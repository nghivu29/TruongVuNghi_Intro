package Lab10;

import java.util.Scanner;

public class Lab10_1 {
    static void input(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+ i +"] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }

    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    static void output(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+ i+ "] = "+ arr[i]);
        }
    }

    public static void main(String[] args) {
        int length;

        do {
            System.out.print("Nhap so phan tu cua mang: ");
            length = new Scanner(System.in).nextInt();
        }while (length <= 0);
        int[] arr = new int[length];

        System.out.println("Nhap mang: ");
        input(arr);

        System.out.println("Mang sau khi da sap xep: ");
        sort(arr);
        output(arr);
    }
}
