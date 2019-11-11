package Lab5;

public class Lab5_3 {
    static void luu20soPibonasy(int[] arr){
        int fib_0 = 1, fib_1 = 1;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = fib_1;
            arr[i] = fib_0;
            fib_1 += fib_0;
            fib_0 = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        luu20soPibonasy(arr);
        System.out.println("Mang 20 so pibonasy:");
        nhapXuat.xuatMang(arr);
    }
}
