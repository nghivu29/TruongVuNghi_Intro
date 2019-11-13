package Lab6;

import java.util.Scanner;

public class Lab6_3 {
    public static long Fibo(long n){
        int fib_0 = 1, fib_1 = 1;
        int temp = 0;

        for (int i = 1; i < n; i++) {
            temp = fib_1;
            fib_1 += fib_0;
            fib_0 = temp;
        }
        return fib_0;
    }

    public static void main(String[] args) {
        System.out.println("Nhap so nguyen n:");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("So fibonasy thu n la: "+ Fibo(n)); //1 1 2 3 5
    }
}

