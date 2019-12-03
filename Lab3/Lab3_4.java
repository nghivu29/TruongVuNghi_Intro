package Lab3;

import java.util.Scanner;

public class Lab3_4 {
    // kiem tra ba so thuc co phai3 canh tam giac khong
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("Nhap vao do 3 so thuc: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a < (b + c) && b < (a + c) && c < (a + b))
            System.out.println("3 canh nay co the hop thanh mot tam giac");
        else
            System.out.println("3 canh nay khong the hop thanh mot tam giac");


    }
}
