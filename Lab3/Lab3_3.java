package Lab3;

import java.util.Scanner;

public class Lab3_3 {
    //nhập vào 4 số thực và xuất ra màng hình min và max
    public static void main(String[] args) {
        double a, b, c , d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao 4 so thuc: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();

        System.out.println("So lon nhat la: "+ Math.max(Math.max(a, b), Math.max(c, d)));
        System.out.println("So nho nhat la: "+ Math.min(Math.min(a, b), Math.min(c, d)));

    }
}
