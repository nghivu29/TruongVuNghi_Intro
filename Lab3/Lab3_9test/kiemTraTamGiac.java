package Lab3.Lab3_9test;

import java.util.ArrayDeque;

public class kiemTraTamGiac {

    int X = 2, Y = 4;

    toaDo A = new toaDo(X, Y);
    toaDo B = new toaDo(X, Y);
    toaDo C = new toaDo(X, Y);

    final double AB = Math.sqrt((A.x - B.x)*(A.x - B.x) + (A.y - B.y)*(A.y - B.y));
    final double AC = Math.sqrt((A.x - C.x)*(A.x - C.x) + (A.y - C.y)*(A.y - C.y));
    final double BC = Math.sqrt((C.x - B.x)*(C.x - B.x) + (C.y - B.y)*(C.y - B.y));

    static double canhLon, canhNho1, canhNho2;

    public static void timCanhLon(double a, double b, double c){
        canhLon = c; canhNho1 = b; canhNho2 = a;

        if ( canhLon < b) { canhLon = b; canhNho1 = c; canhNho2 = a; }
        if ( canhLon < a) { canhLon = a; canhNho1 = c; canhNho2 = b; }
    }

    public boolean kiemTraLaTamGiac(){
        timCanhLon(AB, BC, AC);
        if ( canhLon < canhNho1 + canhNho2 )
            return true;
        return false;
    }

    public boolean kiemTraTamGiacVuong(){
        if (kiemTraLaTamGiac() == true){
            if ( canhLon == Math.sqrt(canhNho1*canhNho1 + canhNho2*canhNho2) )
                return true;
        }
        return false;
    }

    public boolean kiemTraTamGiacDeu(){
        if (kiemTraLaTamGiac() == true)
            if (AB == AC && AB == BC && AC == BC)
                return true;
        return false;
    }

    public boolean kiemTraTamGiacCan(){
        if (kiemTraTamGiacDeu() == false)
            if (AB == AC || AB == BC || AC == BC)
                return true;
        return false;
    }

    //tao them mot diem D va kiem tra xem diem do co thuoc tam giac khong
    public boolean viTriDiemVoiTamGiac(){
        toaDo D = new toaDo(X, Y);

        double DA = Math.sqrt((D.x - A.x)*(D.x - A.x) + (D.y - A.y)*(D.y - A.y));
        double DB = Math.sqrt((D.x - B.x)*(D.x - B.x) + (D.y - B.y)*(D.y - B.y));
        double DC = Math.sqrt((D.x - C.x)*(D.x - C.x) + (D.y - C.y)*(D.y - C.y));

        double p1 = (DA + DB + AB) / 2;
        double S1 = Math.sqrt(p1 * (p1 - DA) * (p1 - DB) * (p1 - AB));
        double p2 = (DA + DC + AC) / 2;
        double S2 = Math.sqrt(p2 * (p2 - DA) * (p2 - DC) * (p2 - AC));
        double p3 = (DC + DB + BC) / 2;
        double S3 = Math.sqrt(p3 * (p3 - DC) * (p3 - DB) * (p3 - BC));
        double p = (AB + AC + BC) / 2;
        double S = Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));

        if (S1 + S2 + S3 == S)
            return true;
        return false;
    }
}
