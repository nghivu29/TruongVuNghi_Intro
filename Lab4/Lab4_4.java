package Lab4;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lab4_4 {
    static void soThich() {
        Scanner sc = new Scanner(System.in);
        String y1 = "Doc sach", y2 = "Nghe nhac", y3 = "Choi the thao", y4 = "May tinh", y5 = "Hen gap lai";

        System.out.println("SO THICH CA NHAN");
        System.out.println("======================");
        System.out.println("1. " + y1);
        System.out.println("2. " + y2);
        System.out.println("3. " + y3);
        System.out.println("4. " + y4);
        System.out.println("5. Thoat");
        System.out.println("----------------------");
        System.out.print("Chon: ");

        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Ban thich " + y1 + "!");
                break;
            case 2:
                System.out.println("Ban thich " + y2 + "!");
                break;
            case 3:
                System.out.println("Ban thich " + y3 + "!");
                break;
            case 4:
                System.out.println("Ban thich " + y4 + "!");
                break;
            case 5:
                System.out.println(y5 + "!");
                break;
            default:
                System.out.println("Khong co lua chon nay.");
        }
    }

    public static void main(String[] args) {
        soThich();
    }
}
