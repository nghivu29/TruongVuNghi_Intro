package Lab10;

import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.Scanner;

public class Lab10_2 {
    // tao mang 100 gia tri ngau nhien
    static int[] arr100random(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + new Random().nextInt(1000);
        }
        return arr;
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

    static void showArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%10d", arr[i]);
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }

    static int searchBinary(int value, int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;

        while (left <= right){
            if (arr[mid] == value)
                return mid;
            else if (arr[mid] < value){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = arr100random();
        sort(arr);
        showArray(arr);

        System.out.print("Nhap x: ");
        int x = new Scanner(System.in).nextInt();
        int indexOfX = searchBinary(x, arr);

        if (indexOfX == -1)
            System.out.println("Khong tim thay x trong mang");
        else System.out.println("Vi tri dau tien co gia tri x trong mang la: "+ indexOfX);
    }
}
