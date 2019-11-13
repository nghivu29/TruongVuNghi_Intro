package Lab7;

public class PROCDUCT {
    String tenSanPham;
    int soLuong;
    int giaBan;
    int tongTien;

    void tinhTongTien(){
        tongTien = soLuong * giaBan;
    }

    void hienThi(){
        System.out.println("Ten san pham: "+ tenSanPham);
        System.out.println("Gia ban: "+ giaBan);
        System.out.println("So luong: "+ soLuong);

        PROCDUCT procduct = new PROCDUCT();
        procduct.tinhTongTien();
        System.out.println("Tong tien: " + tongTien);
    }
}
