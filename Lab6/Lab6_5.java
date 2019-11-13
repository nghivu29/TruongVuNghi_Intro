package Lab6;

import Lab5.nhapXuat;

public class Lab6_5 {
    public static boolean checkNumber(int n){
        // chương trình kiểm tra xem n có phải là số nguyên tố
        int check = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) check++;
        }

        if (check == 1) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        nhapXuat.nhapMang(arr);

        System.out.println("Cac so nguyen to trong mang la:");
        for (int i = 0; i < arr.length; i++) {
            if (checkNumber(arr[i])) System.out.print(arr[i] +" ");
        }
    }
}
