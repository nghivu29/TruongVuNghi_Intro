package Lab5;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab5_5 {
    static int indexOfValue(int[] arr, int value){
        // ham tra ve chi so cua gia tri co trong mang
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {index = i; break;}
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        nhapXuat.nhapMang(arr);

        System.out.println("Nhap phan tu muon tim: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if(Lab5_4.countArr(arr, value) > 0) {
            System.out.println("Vi tri dau tien cua phan tu do la: " + (indexOfValue(arr, value) + 1));
            System.out.println("So lan xuat hien cua no la: "+ Lab5_4.countArr(arr, value));
        }
        else System.out.println("Khong ton tai gia tri nay trong mang");
    }
}
