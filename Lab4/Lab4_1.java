package Lab4;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Lab4_1 {

    //b) in so chan nho hon n
    public static void inSoChan(){
        float n;
        do {
            System.out.println("Nhap n:");
            Scanner num = new Scanner(System.in);
            n = num.nextFloat();
        }while (n <= 0);

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }

    //c) in cac so nguyen to nho hon n
    public  static boolean soNgto(int n){
        int gido = 0;

        for (int i = 1; i < n; i++) {
            if(n % i == 0) gido++;
        }

        if(gido == 1) return true;
        return false;
    }
    public static void inSoNgto(){
        float n;
        Scanner num = new Scanner(System.in);

        do {
            System.out.println("Nhap n:");
            n = num.nextFloat();
        }while (n <= 1);

        for (int i = 1; i <= n; i++) {
            if(soNgto(i)) System.out.println(i);
        }

    }

    public static void main(String[] args) {

        System.out.println("In so chan");
        inSoChan();
        System.out.println("In so nguyen to");
        inSoNgto();
        System.out.println("\n");
    }
}
