package Lab8;

import Lab3.Lab3_6;

import java.util.Scanner;

public class Lab8_4 {
    static String deleteSpiecalChar(String string){
        if (string.length() > 0){
            for (int i = 0; i < string.length(); i++) {
                if (Lab3_6.kiemTraAlphabet(string.charAt(i)) == false && string.charAt(i) != ' ') {
                    string = string.replace(String.valueOf(string.charAt(i)), "");
                    i--;
                }
            }
        }
        return string;
    }

    protected static String standardize(String string){
        string = deleteSpiecalChar(string);
        string = string.toLowerCase();

        String[] arr = string.split(" ");
        String re = "";

        for (int i = 0; i < arr.length; i++) {
            String word = "";

            if (arr[i].length() > 0) {
                word += Character.toUpperCase(arr[i].charAt(0));
                word += arr[i].substring(1) + " ";
            }
            re += word;
        }
        re = re.trim();
        return re;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can chuan hoa: ");
        String string = sc.nextLine();
        System.out.println("Chuoi sau chuan hoa: " +standardize(string));
    }
}
