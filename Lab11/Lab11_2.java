package Lab11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab11_2 {
    static int no = 1;

    final static void ghiFile(NhanVien11_2 nhanVien112) throws IOException {
        FileWriter writer = null;

        try {
            writer = new FileWriter("C:\\Users\\ACER\\OneDrive\\Desktop\\black cat\\introduce programming\\src\\Lab11\\nhanvien.txt", true);

            writer.write("\n===NV" + String.valueOf(no++) + ":\n");
            writer.write("Ho ten: " + nhanVien112.getHoTen() + "\n");
            writer.write("Tuoi: " + String.valueOf(nhanVien112.getTuoi()) + "\n");
            writer.write("Luong: " + String.valueOf(nhanVien112.getLuong()) + "\n");

        }catch (Exception e){
            System.out.println(e);
        }finally {
            if (writer != null)
                writer.close();
        }
    }

    final static void docFile() throws IOException {
        FileReader reader = null;

        try {
            reader = new FileReader("C:\\Users\\ACER\\OneDrive\\Desktop\\black cat\\introduce programming\\src\\Lab11\\nhanvien.txt");

            int c;
            while ((c = reader.read()) != -1){
                System.out.print((char) c);
            }

        }catch (Exception e){
            System.out.println(e);

        }finally {
            if (reader != null)
                reader.close();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhap du lieu cho 3 nhan vien:");
        NhanVien11_2 nhanVien1 = new NhanVien11_2();
        NhanVien11_2 nhanVien2 = new NhanVien11_2();
        NhanVien11_2 nhanVien3 = new NhanVien11_2();

        ghiFile(nhanVien1);
        ghiFile(nhanVien2);
        ghiFile(nhanVien3);

        System.out.println("\n***Noi dung file:");
        docFile();

    }
}
