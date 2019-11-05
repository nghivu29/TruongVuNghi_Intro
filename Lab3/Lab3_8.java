package Lab3;

import java.util.Scanner;

public class Lab3_8 {
    public static void math(){
        Scanner toanTu = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        double a = toanTu.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b = toanTu.nextDouble();

        System.out.println("\tMENU");
        System.out.println("=============");
        System.out.println("+\n-\nx\n/");
        System.out.println("=============");

        Scanner choose = new Scanner(System.in);
        System.out.print("Chon: ");
        char i = choose.next().charAt(0);
        System.out.print("Tinh huong: ");

        switch (i){
            case '+':
                System.out.println("a + b = " + (a + b));
                break;
            case '-':
                System.out.println("a - b = " + (a - b));
                break;
            case 'x':
                System.out.println("a x b = " + (a * b));
                break;
            case ':':
                System.out.println("a : b = " + (a / b));
                break;
            default:
                System.out.println("Du lieu sai");
        }
    }

    public static void main(String[] args) {
        math();
    }
}
