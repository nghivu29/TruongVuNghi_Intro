package Lab7;

import java.security.spec.RSAOtherPrimeInfo;

public class MARK2 extends MARK {

    public void nhapDanhSachMonHoc(MARK[] arr){
        for (int i = 0; i < arr.length; i++) {
            MARK monHoc = new MARK();
            System.out.println("Mon thu "+ (i + 1) + " : ");
            monHoc.NhapMonHoc();
            arr[i] = monHoc;
        }
    }

    public void xuatDanhSachMonHoc(MARK[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n\nMon thu "+ (i + 1) +" : ");
            arr[i].XuatMonHoc();
        }
    }

    static float TimDiemTBcaoNhat(MARK[] arr){
        float max = arr[0].TinhDTB();

        for (MARK i: arr) {
            if(max < i.TinhDTB()) max = i.TinhDTB();
        }
        return max;
    }

    void diemTBcaoNhat(MARK[] arr){
        float max = TimDiemTBcaoNhat(arr);

        for (MARK i: arr){
            if (i.TinhDTB() == max)
                i.XuatMonHoc();
        }
    }
}
