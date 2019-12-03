package Lab3;

import java.util.Scanner;

public class Lab3_5 {
    //tinh tien di taxi
    public static void main(String[] args) {
        System.out.print("Nhap vao so km di taxi: ");
        double km = new Scanner(System.in).nextDouble();

        System.out.print("So tien ban phai tra la: ");
        if (km > 0 && km <= 1)
            System.out.println("15000VND");
        else if (km <= 5)
            System.out.println(15000 + (13500 * (km-1)) + "VND");
        else if (km <= 120)
            System.out.println(15000 + (13500 * (km-1)) + (11000 * (km - 5)) + "VND");
        else
            System.out.println((15000 + (13500 * (km-1)) + (11000 * (km - 5))) * 0.9 +"VND");
    }
}
