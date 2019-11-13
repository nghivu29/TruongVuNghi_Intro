package Lab6;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Lab6_1 {
    public static void giaiPT2(float a, float b, float c){

        double detal = b * b - 4 * a * c;
        double x1 = (-b + sqrt(detal)) / (2 * a);
        double x2 = (-b - sqrt(detal)) / (2 * a);

        if (detal < 0) System.out.println("Phuong trinh vo nghiem");
        else if (detal == 0) System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + x1);
        else System.out.println("Phuong trinh co 2 nghiem pb:\nx1 = " + x1 + "\nx2 =" + x2);
    }

    public static void main(String[] args) {
        Scanner heSo = new Scanner(System.in);

        System.out.println("Nhap a, b, c cua phuong trinh bac 2");
        float a = heSo.nextFloat();
        float b = heSo.nextFloat();
        float c = heSo.nextFloat();

        giaiPT2(a, b, c);
    }
}
