package Lab7;

public class MainLab7_4 {
    public static void main(String[] args) {
        Account accbill = new Account("Bill Gate",12345,100000);
        double soDuBanDau = accbill.Get_SoDu();
        accbill.goiTien(50000);
        double soDuSauGoiTien = accbill.Get_SoDu();
        accbill.rutTien(4200);
        double soDuSauRutTien = accbill.Get_SoDu();

        System.out.println("So tien trong tai khoan cua Bill ban dau la: "+ soDuBanDau);
        System.out.println("So tien trong tai khoan cua Bill sau khi goi tien vao la: "+ soDuSauGoiTien);
        System.out.println("So tien trong tai khoan cua Bill sau khi rut tien la: "+ soDuSauRutTien);

        accbill.rutTien(200000);
    }
}
