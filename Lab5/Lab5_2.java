package Lab5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab5_2 {
    static  void nhapMangThuc(double[] arr){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap mang:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextDouble();
        }
    }

    static void xuatMangThuc(double[] arr) {
        System.out.println("Cac phan tu chan cua mang:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    static void ganMang(int[] arr_int, double[] arr_double){
        //phương thức gán mảng thực vào các vị trí lẻ của mảng nguyên

        for (int i = 1, j = 0; i < arr_int.length; i += 2) {
            arr_int[i] = (int)arr_double[j];
            j += 1;
        }
    }

    public static void main(String[] args) {
   //     Scanner sc = new Scanner(System.in);

        int[] arr_int = new int[10];
        double[] arr_double = new double[5];

        System.out.println("***Mang thuc:");
        nhapMangThuc(arr_double);

        ganMang(arr_int, arr_double);

        System.out.println("\n***Mang nguyen:");
        nhapXuat.xuatMang(arr_int);

        System.out.println("***Mang thuc");
        xuatMangThuc(arr_double);
    }
}
