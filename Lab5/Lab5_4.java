package Lab5;

public class Lab5_4 {
    static int maxArr(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    static int minArr(int[] arr){
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    static int countArr(int[] arr, int value){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(value == arr[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        nhapXuat.nhapMang(arr);
        System.out.println("Gia tri lon nhat la "+ maxArr(arr) +", so lan xuat hien "+ countArr(arr, maxArr(arr)) +".");
        System.out.println("Gia tri nho nhat la "+ minArr(arr) +", so lan xuat hien "+ countArr(arr, minArr(arr))+".");
    }
}
