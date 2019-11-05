package Lab3;

import java.util.Scanner;

public class Lab3_7 {
    public static void  monHoc(){
        String mon1 = "CF", mon2 = "C", mon3 = "HDJ", mon4 = "DreamWaever", mon5 = "RDBMS", mon6 = "Learn Java By Example";

        System.out.println("\t\tMENU");
        System.out.println("==================");
        System.out.println("1. " + mon1);
        System.out.println("2. " + mon2);
        System.out.println("3. " + mon3);
        System.out.println("4. " + mon4);
        System.out.println("5. " + mon5);
        System.out.println("6. " + mon6);
        System.out.println("==================");

        System.out.print("Chon: ");
        Scanner choose = new Scanner(System.in);
        int i = choose.nextInt();

        System.out.print("Ban chon: ");

        switch (i){
            case 1:
                System.out.println(mon1);
                break;
            case 2:
                System.out.println(mon2);
                break;
            case 3:
                System.out.println(mon3);
                break;
            case 4:
                System.out.println(mon4);
                break;
            case 5:
                System.out.println(mon5);
                break;
            case 6:
                System.out.println(mon6);
                break;
            default:
                System.out.println("Du lieu sai");
        }
    }

    public static void main(String[] args) {
        monHoc();
    }
}
