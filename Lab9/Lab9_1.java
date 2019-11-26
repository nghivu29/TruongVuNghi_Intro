package Lab9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab9_1 {
    public static void main(String[] args) {
        //var
        Scanner sc = new Scanner(System.in);
        char choose;
        int choose2;
        boolean hasList = false;
        Integer value;
        int index;
        List<Integer> list = null;



        do {
            //menu
            System.out.println("Demo cac thao tac tren ArrayList so nguyen Java\n" +
                    "=======================================\n" +
                    "1- khoi tao danh sach.\n" +
                    "2- them 1 phan tu vao danh sach.\n" +
                    "3- xoa 1 phan tu ra khoi danh sach.\n" +
                    "4- chen 1 phan tu vao danh sach.\n" +
                    "5- duyet danh sach. (va in ra list)\n" +
                    "6- tim 1 phan tu.\n" +
                    "7- sap xep danh sach tang dan\n" +
                    "8- sap xep danh sach giam dan\n" +
                    "0- thoat chuong trinh");
            System.out.println("\nChose: ");
            choose = sc.next().charAt(0);

            // do
            switch (choose){
                case '1':
                    if (hasList == false) {
                        list = new ArrayList<>();
                        System.out.println("List da duoc tao");
                        hasList = true;
                    }
                    else System.out.println("List da ton tai.");
                    break;

                case '2':
                    System.out.print("Value = ");
                    value = sc.nextInt();
                    list.add(value);
                    break;

                case '3':
                    System.out.println("1. Remove with index\n2. Remove with first value");
                    System.out.print("Choose: ");
                    choose2 = sc.nextInt();
                    if (choose2 == 1){
                        System.out.println("Remove with index.");
                        System.out.print("Index: ");
                        index = sc.nextInt();
                        list.remove(index);
                    }
                    if (choose2 == 2){
                        System.out.println("Remove with value.");
                        System.out.print("Value: ");
                        value = sc.nextInt();
                        list.remove(value);
                    }
                    break;

                case '4':
                    System.out.print("value: ");
                    value = sc.nextInt();
                    System.out.print("index: ");
                    index = sc.nextInt();
                    list.add(index, value);
                    break;

                case '5':
                    System.out.print("Show list:");
                    for (Integer i: list)
                        System.out.print(" "+ i);
                    System.out.println();
                    break;

                case '6':
                    System.out.print("index: ");
                    index = sc.nextInt();
                    System.out.println("value : "+ list.get(index));
                    break;

                case '7':
                    Collections.sort(list);
                    System.out.println("Da sap xep");
                    break;

                case '8':
                    for (int i = 0; i < list.size() - 1; i++) {
                        for (int j = 1; j < list.size(); j++) {
                            if (i < j) Collections.swap(list, i , j);
                        }
                    }
                    System.out.println("Da sap xep");
                    break;
                case '0':
                    System.exit(0);
            }
        }while (true);

    }
}
