package Lab3.Lab3_9test;

import java.util.Scanner;

//can tao mot ban sao luu va thu cac th
public class toaDo {
    double x, y;

    // su dung nhu the nay thi lam sao de nhap
    public toaDo(double x, double y) {
        this.x = x;
        this.y = y;
    }

//    toaDo(){
//        System.out.print("Toa do: ");
//        Scanner sc = new Scanner(System.in);
//        x = sc.nextDouble();
//        y = sc.nextDouble();
//    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
