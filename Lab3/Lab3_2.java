package Lab3;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Lab3_2 {
    // giai phuong trinh bac 2
    public static void ptBac2() {
        Scanner heSo = new Scanner(System.in);

        System.out.println("Nhap a, b, c cua phuong trinh bac 2");
        double a = heSo.nextDouble();
        double b = heSo.nextDouble();
        double c = heSo.nextDouble();

        double detal = b * b - 4 * a * c;
        double x1 = (-b + sqrt(detal)) / (2 * a);
        double x2 = (-b - sqrt(detal)) / (2 * a);

        if (detal < 0) System.out.println("Phuong trinh vo nghiem");
        else if (detal == 0) System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + x1);
        else System.out.println("Phuong trinh co 2 nghiem pb:\nx1 = " + x1 + "\nx2 =" + x2);
    }

    public static void main(String[] args) {
        ptBac2();
    }
}
