package Lab3;

public class Lab3_9 {

    static boolean kiemTraTamGiac(double xA, double yA, double xB, double yB, double xC, double yC){

        double AB = Math.sqrt((xA - xB)*(xA - xB) + (yA - yB)*(yA - yB));
        double AC = Math.sqrt((xA - xC)*(xA - xC) + (yA - yC)*(yA - yC));
        double BC = Math.sqrt((xC - xB)*(xC - xB) + (yC - yB)*(yC - yB));

        double canhLon = AB, canhNho1 = AC, canhNho2 = BC;
        if ( canhLon < AC) { canhLon = AC; canhNho1 = AB; canhNho2 = BC; }
        if ( canhLon < BC) { canhLon = BC; canhNho1 = AB; canhNho2 = AC; }

        if ( canhLon < canhNho1 + canhNho2 )
            return true;
        else return false;
    }



    public static void main(String[] args) {
        if(kiemTraTamGiac(1,1,1,1,1,1) == true)
            System.out.println("la tam giac");
        else System.out.println("no");
    }
}
