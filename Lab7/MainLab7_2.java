package Lab7;

import java.util.Scanner;

public class MainLab7_2 {
    public static void main(String[] args) {
        PROCDUCT sp1 = new PROCDUCT();
        PROCDUCT sp2 = new PROCDUCT();
        PROCDUCT sp3 = new PROCDUCT();
        PROCDUCT sp4 = new PROCDUCT();
        PROCDUCT sp5 = new PROCDUCT();

        System.out.println("STT       |Ten san pham        |So luong            |Don gia<$>          |Tong tien<$>        ");
        System.out.print("1"); sp1.hienThi();
        System.out.print("2"); sp2.hienThi();
        System.out.print("3"); sp3.hienThi();
        System.out.print("4"); sp4.hienThi();
        System.out.print("5"); sp5.hienThi();

        System.out.println("");
    }
}
