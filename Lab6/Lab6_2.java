package Lab6;

import java.util.Scanner;

public class Lab6_2 {
    public static int power(int a, int n){
        return (int) Math.pow(a, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x va m: ");
        int x = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("x^m = "+ power(x, m));
    }
}
