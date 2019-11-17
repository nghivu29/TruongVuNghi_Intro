package Lab7;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class MARK {
    String TenMonHoc;
    float DiemLT ;
    float DiemTH ;

    public void NhapMonHoc(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten mon hoc: ");
        TenMonHoc = sc.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
        DiemLT = sc.nextFloat();
        System.out.print("Nhap diem thuc hanh: ");
        DiemTH = sc.nextFloat();
    }
    public void XuatMonHoc(){

        System.out.println("THONG TIN VE MON HOC");
        System.out.println("================================");
        System.out.println("Ten mon hoc: "+ TenMonHoc);
        System.out.println("Diem ly thuyet: "+ DiemLT);
        System.out.println("Diem thuc hanh: "+ DiemTH);
        System.out.print("Diem trung binh: " + TinhDTB());
    }
    public float TinhDTB(){
        return (DiemLT + DiemTH) / 2;
    }

}
