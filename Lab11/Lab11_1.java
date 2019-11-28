package Lab11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lab11_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        //var
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        System.out.print("Nhap so nguyen: ");
        int i = sc.nextInt();
        System.out.print("Nhap so thuc: ");
        double d = sc.nextDouble();
        System.out.print("Nhap 1 ki tu: ");
        char c = sc.next().charAt(0);
        char xongDong = '\n';
        System.out.print("Nhap \"true\" hoac \"false\": ");
        boolean bool = Boolean.parseBoolean(sc.next());

        //nhap
        try {
            fileOut = new FileOutputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\black cat\\introduce programming\\src\\Lab11\\Demodocghifile.txt");

            //ghi chuoi
            int count = 0;
            while (count < s.length()){
                fileOut.write((byte)s.charAt(count++));
            }
            fileOut.write((byte)xongDong);

            //ghi so nguyen
            count = 0;
            while (count < String.valueOf(i).length()){
                fileOut.write((byte)String.valueOf(i).charAt(count++));
            }
            fileOut.write((byte)xongDong);

            //ghi so thuc
            count = 0;
            while (count < String.valueOf(d).length()){
                fileOut.write((byte)String.valueOf(d).charAt(count++));
            }
            fileOut.write((byte)xongDong);

            //ghi 1 ki tu
            fileOut.write((byte)c);
            fileOut.write((byte)xongDong);

            //ghi boolean
            count = 0;
            while (count < String.valueOf(bool).length()){
                fileOut.write((byte)String.valueOf(bool).charAt(count++));
            }

        }catch (Exception e){
            System.out.println(e);

        }finally {
            if (fileOut != null)
                fileOut.close();
        }

        //doc file
        System.out.println("\nNoi dung file:");
        try{
            fileIn = new FileInputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\black cat\\introduce programming\\src\\Lab11\\Demodocghifile.txt");
            int point;
            while ((point = fileIn.read()) != -1){
                System.out.print((char) point);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            if (fileIn != null)
                fileIn.close();
        }
    }
}
