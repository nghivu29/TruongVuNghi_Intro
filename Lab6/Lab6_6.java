package Lab6;

import Lab5.nhapXuat;

public class Lab6_6 {
    static boolean checkNumber(int n){
        //kiem tra so hoan thien
        int sum = 0;

        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) sum += i;
        }
        if (sum == n) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        nhapXuat.nhapMang(arr);

        System.out.println("Cac so hoan thien to trong mang la:");
        for (int i = 0; i < arr.length; i++) {
            if (checkNumber(arr[i])) System.out.print(arr[i] +" ");
        }
    }
}
