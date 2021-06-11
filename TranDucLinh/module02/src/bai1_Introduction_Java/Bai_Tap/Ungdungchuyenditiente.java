package bai1_Introduction_Java.Bai_Tap;

import java.util.Scanner;

public class Ungdungchuyenditiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.println("Moi ban nhap so tien USD:");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Gia tri VND "+ quydoi);
    }
}
