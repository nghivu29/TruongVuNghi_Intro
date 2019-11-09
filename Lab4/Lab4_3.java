package Lab4;

import java.util.Scanner;

public class Lab4_3 {
    static void inSoChiaHetCho7(int m, int n){
        System.out.println("Nhung so chia het cho 7 trong khoang ("+ m +" "+ n +") la: ");

        for (int i = m; i <= n; i++) {
            if (i % 7 == 0)
                System.out.print(i +", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m, n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        inSoChiaHetCho7(m, n);
    }
}
