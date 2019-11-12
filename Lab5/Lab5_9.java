package Lab5;

import java.util.Random;
import java.util.Scanner;

public class Lab5_9 {
    static float[][] diem = new float[6][5];
    static float[] diemTB = new float[5];

    static void nhapMang2chieu(float[][] diem){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < diem.length; i++) {
            for (int j = 0; j < diem[i].length; j++) {
                diem[i][j] = sc.nextFloat();
            }
        }
    }

    static void xuatMangDiem(float[][] diem){

        for (int i = 0; i < diem[0].length; i++) {
            for (int j = 0; j < diem.length; j++) {
                System.out.print(" "+ diem[j][i]);
            }
            System.out.println("");
        }
    }

    static void diemTB(float[] TB){
        float diemTBmon = 0f;
        float tong;

        for (int i = 0; i < diem[0].length; i++) {
            tong = 0f;

            for (int j = 0; j < diem.length; j++) {
                tong += diem[j][i];
            }
            diemTBmon = tong / 3;
            if (i < diemTB.length)
                TB[i] = diemTBmon;
        }
    }

    public static void main(String[] args) {
//        System.out.println("CF\t\tC\t\tHDJ\t\tDU\t\tRDBMS\t\tJava\t\tDiemTB");
        nhapMang2chieu(diem);
        xuatMangDiem(diem);

    }
}
