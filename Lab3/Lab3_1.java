package Lab3;

import java.util.Scanner;

public class Lab3_1 {
    static void lab2_1a(){
        //chuong trinh kiem tra va chia a cho b
        double c;
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (b == 0) System.out.println("Error: divide by zero");
        else{
            c = a / b;
            System.out.println(c);
        }
    }

    static void lab2_1b(){
        //không khác gì ý trên
        lab2_1a();
    }

}
