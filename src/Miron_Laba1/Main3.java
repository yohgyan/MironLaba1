package Miron_Laba1;

public class Main3 {
    public static void main(String[] args) {
        double sum = 0;        int[] arr = {1, 2, 3, 4 ,5};
        for (int i = 0; i < arr.length; i++) {            sum += arr[i];
        }        double  avg = (double) sum/arr.length;
        System.out.println(sum);        System.out.println(avg);
    }
}
