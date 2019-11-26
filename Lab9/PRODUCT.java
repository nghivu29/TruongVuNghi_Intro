package Lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PRODUCT {
    static List<PRODUCT> danhSachSanPham = new ArrayList<>();
    private String ten;
    private String moTa;
    private int gia;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    // nhap du lieu cho san pham dong thoi them no vao danh sach
    PRODUCT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap gia san pham: ");
        this.gia = sc.nextInt();
        sc.nextLine();
        System.out.print("Mo ta san pham: ");
        this.moTa = sc.nextLine();

        danhSachSanPham.add(this);
    }

    static void resetListProduct(){
        danhSachSanPham.removeAll(danhSachSanPham);
    }

    //tim kiem chi tra ve san pham dau tien tim thay
    final static PRODUCT search1Product(String tenSanPham){
        for (PRODUCT i: danhSachSanPham){
            if (i.ten.equals(tenSanPham))
                return i;
        }

        return null;
    }

    //tim kiem va in va thong tin
    final static void searchProduct(int gia){
        for (PRODUCT i: danhSachSanPham){
            if (i.gia == gia)
                i.showInfor();
        }
    }

    final static void searchProduct(String tenSanPham){
        for (PRODUCT i: danhSachSanPham){
            if (i.ten.equals(tenSanPham))
                i.showInfor();
        }
    }

    final static void showList(){
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            System.out.println("***STT "+ (i+1));
            System.out.println("Ten: "+ danhSachSanPham.get(i).ten);
            System.out.println("Gia: "+ danhSachSanPham.get(i).gia);
            System.out.println("Mo ta: "+ danhSachSanPham.get(i).moTa);
        }
    }

    // xoa 1 san pham dau tien tim thay. co the doi thanh xoa tat ca cac san pham cung ten.
    final static boolean deleteProduct(String tenSanPham){
        for (PRODUCT i: danhSachSanPham){
            if (i.ten.equals(tenSanPham)) {
                danhSachSanPham.remove(i);
                return true;
            }
        }
        return false;
    }

    final void showInfor(){
        System.out.println("Ten: "+ this.ten);
        System.out.println("Gia: "+ this.gia);
        System.out.println("Mo ta: "+ this.moTa);
        System.out.println();
    }

    static List<PRODUCT> sort(){
        for (int i = 1; i < danhSachSanPham.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (danhSachSanPham.get(j).getGia() > danhSachSanPham.get(j-1).getGia())
                    Collections.swap(danhSachSanPham, j, j - 1);
            }
        }

        return danhSachSanPham;
    }
}
