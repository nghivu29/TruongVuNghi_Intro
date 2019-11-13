package Lab6;

import java.util.Scanner;

public class Lab6_4 {
    static String doiDiem(float n) {

        if (n >= 0 && n < 4) return "F";
        else if (n>= 0 && n < 5.5) return "D";
        else if (n>= 0 && n < 7) return "C";
        else if (n>= 0 && n < 8.5) return "B";
        else if (n>= 0 && n <= 10) return "A";
        else return "E";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem so: ");
        int n = sc.nextInt();
        System.out.println("Diem chu la:\n" + doiDiem(n));
    }
}
