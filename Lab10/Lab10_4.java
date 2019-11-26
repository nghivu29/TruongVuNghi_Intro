package Lab10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab10_4 {
    static void nhapMang(PROCDUCT[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new PROCDUCT();
        }
    }

    //so sanh chuoi 1 voi chuoi 2 theo thu tu abc
    private static boolean S1truocS2(String s1, String s2){
        String temp;

        for (int i = 0; i < s1.length() || i < s2.length(); i++)
            if (s1.charAt(i) < s2.charAt(i))
                return true;

        return false;
    }

    // sap sep theo thu tu abc
     private static void sortAbc(List<PROCDUCT> list, int beginIndex, int endIndex){
        for (int i = beginIndex; i < endIndex; i++) {
            for (int j = i + 1; j <= endIndex; j++) {
                if (S1truocS2(list.get(i).tenSanPham, list.get(j).tenSanPham) == false)
                    Collections.swap(list, i, j);
            }
        }
     }

     // sap sep theo tong tien giam dan neu tien bang nhau xep theo ten tang dan
    static void sort(PROCDUCT[] arr){

        PROCDUCT temp = null;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].tinhTongTien() < arr[j].tinhTongTien()) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                if (arr[i].tinhTongTien() == arr[j].tinhTongTien())
                    if (S1truocS2(arr[i].tenSanPham, arr[j].tenSanPham) == false){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so san pham: ");
        int n = sc.nextInt();

        PROCDUCT[] arr = new PROCDUCT[n];
        nhapMang(arr);

        // mot so truong hop khong the sap xep do ten chua ki tu dac biet
        try {
            sort(arr);
        }catch (Exception e){
            System.out.println("khong the sap xep hay thu lai");
        }


        System.out.println("Sau khi da sap xep");
        int stt = 1;
        System.out.println("STT       |Ten san pham        |So luong            |Don gia<$>          |Tong tien<$>        ");
        for(PROCDUCT i: arr) {
            System.out.print(stt++);
            i.hienThi();
        }
    }
}
