package Bai3_Mang.Baitap;

import java.util.Scanner;

public class Timgaitrinhonhattrongmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println(" Nhap cac phan tu vao mang: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf( "a[%d] : ", i );
            numbers[i] = sc.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Gia tri nho nhat la : " + min);
        System.out.println("Gia tri lon nhat la : " + max);

    }
}
