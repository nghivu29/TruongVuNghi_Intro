package Lab4;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class Lab4_8 {
    static long DecToBin(int n_10){
        //hàm đổi từ hệ thập phân sang hệ nhị phân nhưng lưu trữ là một số thập phân
        int n_2 = 0;

        for(int i = 1; n_10 != 0; i *= 10){
            n_2 += i * (n_10 % 2);
            n_10 /= 2;
        }

        return n_2;
    }

    public static void main(String[] args) {
        int n;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số thập phân cần đổi: ");
            n = sc.nextInt();
        }while (n < 0);

        System.out.println("Số nhị phân của nó là: "+ DecToBin(n));

    }
}
