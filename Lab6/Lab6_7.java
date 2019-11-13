package Lab6;

import java.util.Scanner;

public class Lab6_7 {
    static void menu(){
        System.out.println("+---------------------------------------------------------------------------------------+\n" +
                           "|                                        menu                                           |\n" +
                           "+---------------------------------------------------------------------------------------+\n" +
                           "|   1.  Menu 1                                                                          |\n" +
                           "|   2.  Menu 2                                                                          |\n" +
                           "|   3.  Menu 3                                                                          |\n" +
                           "|   4.  Menu 4                                                                          |\n" +
                           "|   5.  Exit                                                                            |\n" +
                           "+---------------------------------------------------------------------------------------|");
        System.out.print("Please choose: ");
        Scanner sc = new Scanner(System.in);
        char choose = sc.next().charAt(0);

        while (choose <= 49 || choose >= 54) {
            System.out.print("Entered incorrectly, re-enter: ");
            choose = sc.next().charAt(0);
        }

        switch (choose){
            case '1':
                System.out.println("doing menu 1. . .");
                break;
            case '2':
                System.out.println("doing menu 2. . .");
                break;
            case '3':
                System.out.println("doing menu 3. . .");
                break;
            case '4':
                System.out.println("doing menu 4. . .");
                break;
            case '5':
                System.out.println("exited");
                break;
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
