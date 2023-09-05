package Miron_Laba1;

import java.util.Arrays;import java.util.Scanner;
public class Main {    public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);        double sum = 0;
    int i = 0;        int[] arr = new int[10];
    while ( i < arr.length) {            arr[i] = Scan.nextInt();
        sum += arr[i];            i++;
    }        Arrays.sort(arr);
    double  avg = (double) sum/arr.length;        System.out.println("Сумма массива" + sum);
    System.out.println("среднее арифметическое" + avg);        System.out.println("минимальное" + arr[0]);
    System.out.println("максимальное" + arr[arr.length-1]);    }
}
