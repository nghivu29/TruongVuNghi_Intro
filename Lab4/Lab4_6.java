package Lab4;

import java.util.Scanner;

public class Lab4_6 {
    static void fibonasy(int n){
        //phương thức in ra dãy số fibonasy có n phần tử
        int fib_0 = 1, fib_1 = 1;
        int temp = 0;

        System.out.print("Dãy n số fibonasy: ");

        for (int i = 0; i <= n; i++) {
            temp = fib_1;
            System.out.print(fib_0 +" "); // 1 1 2 3 5 8 13 21 34
            fib_1 += fib_0;
            fib_0 = temp;
        }
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Nhập n: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        } while (n <= 0);
        fibonasy(n);
    }
}
