package Lab3.Lab3_9banChinh;

public class Run {
    public static void main(String[] args) {
        System.out.println("Nhap lan luot toa do cua 3 diem:");
        kiemTraTamGiac tamGiac = new kiemTraTamGiac();

        if (tamGiac.kiemTraLaTamGiac() == true) {
            System.out.println("3 diem A, B, C tao thanh mot tam giac");

            if (tamGiac.viTriDiemVoiTamGiac() == true)
                System.out.println("Diem nay nam trong tam giac");
            else System.out.println("Diem nay khong nam trong tam giac");
        }
        else System.out.println("3 diem A, B. C khong tao duoc tamm giac");

        if (tamGiac.kiemTraTamGiacVuong() == true)
            System.out.println("Tam giac do la tam giac vuong");

        if (tamGiac.kiemTraTamGiacDeu() == true)
            System.out.println("Tam giac do la tam giac deu");

        if (tamGiac.kiemTraTamGiacCan() == true)
            System.out.println("Tam giac do la tam giac can");
    }
}
