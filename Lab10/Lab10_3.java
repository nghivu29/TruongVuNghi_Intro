package Lab10;

public class Lab10_3 {
    public static void main(String[] args) {
        MARK[] arr = new MARK[8];
        MARK.nhapDanhSachMonHoc(arr);

        //xuat sau khi da duoc xap xep
        MARK.sort(arr);
        System.out.println("Danh sach mon hoc sau kho duoc sap xep.");
        MARK.xuatDanhSachMonHoc(arr);
    }
}
