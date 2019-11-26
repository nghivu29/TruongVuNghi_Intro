package Lab4;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lab4_7 {
    public static boolean kiemTraSNT(int n){
        // chương trình kiểm tra xem n có phải là số nguyên tố không
        int check = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) check++;
        }

        if (check == 1) return true;
        return false;
    }

    static void soNguyenTo(int n){
        //chương trình xuất ra n số nguyên tố đầu tiên
        int count = 0;
        System.out.print("Dãy n số nguyên tố đầu tiên là: ");

        for (int i = 0;; i++) {
            if (kiemTraSNT(i) == true){
                System.out.print(i +" ");
                count++;
            }
            if (count == n) break;
        }
    }

    public static void main(String[] args) {
        int n;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập n:");
            n = sc.nextInt();
        }while (n <= 0);
        soNguyenTo(n);
    }
}
