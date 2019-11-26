package Lab9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lab9_3 {
    public static void main(String[] args) {
        //var
        Queue<Integer> queue = null;
        Scanner sc = new Scanner(System.in);
        int choose;
        boolean hasQueue = false;
        Integer value;

        do {
            System.out.println("\nDemo cac thao tac tren Queue so nguyen Java\n" +
                    "=====================================\n" +
                    "1- khoi tao queue.\n" +
                    "2- them 1 phan tu vao queue.\n" +
                    "3- lay phan tu dau ra khoi queue.\n" +
                    "4- xem phan tu dau queue.\n" +
                    "5- duyet queue.(va xuat ra cac phan tu queue)\n" +
                    "0- thoat chuong trinh");

            System.out.print("Choose: ");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    if (hasQueue == false) {
                        queue = new LinkedList<>();
                        System.out.println("Stack da duoc khoi tao");
                        hasQueue = true;
                    }
                    else System.out.println("Stack da ton tai san");
                    break;

                case 2:
                    System.out.print("Value = ");
                    value = sc.nextInt();
                    queue.add(value);
                    break;

                case 3:
                    queue.poll();
                    break;

                case 4:
                    System.out.println("queue[0] = "+ queue.peek());
                    break;

                case 5:
                    System.out.print("Show stack:");
                    for (Integer i: queue){
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
