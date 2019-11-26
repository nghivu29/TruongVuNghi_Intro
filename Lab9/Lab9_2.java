package Lab9;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Lab9_2 {
    public static void main(String[] args) {
        //var
        Stack<Integer> stack = null;
        Scanner sc = new Scanner(System.in);
        int choose;
        boolean hasStack = false;
        Integer value;

        do {
            System.out.println("\nDemo cac thao tac tren Stack so nguyen Java\n" +
                    "====================================\n" +
                    "1- khoi tao stack.\n" +
                    "2- them 1 phan tu vao stack.\n" +
                    "3- lay phan tu dau ra khoi stack.\n" +
                    "4- xem phan tu dau stack.\n" +
                    "5- duyet stack.(va in ra cac phan tu cua stack)\n" +
                    "0- thoat chuong trinh");

            System.out.print("Choose: ");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    if (hasStack == false) {
                        stack = new Stack<>();
                        System.out.println("Stack da duoc khoi tao");
                        hasStack = true;
                    }
                    else System.out.println("Stack da ton tai san");
                    break;

                case 2:
                    System.out.print("Value = ");
                    value = sc.nextInt();
                    stack.add(value);
                    break;

                case 3:
                    stack.remove(0);
                    break;

                case 4:
                    System.out.println("stack[0] = "+ stack.get(0));
                    break;

                case 5:
                    System.out.print("Show stack:");
                    for (Integer i: stack){
                        System.out.print(" "+ i);
                    }
                    System.out.println();
                    break;

                case 0:
                    System.exit(0);
            }

        }while (true);

    }
}
