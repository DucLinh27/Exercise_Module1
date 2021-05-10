package Bai4.LopvaObject.Baitap;

import java.util.Scanner;

public class XaydunglopQuadraticEquation {

    private int a, b, c;

    public XaydunglopQuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public XaydunglopQuadraticEquation() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return 2 * b - 4 * a * c;
    }


    public double getRoot1() {
        if (this.getDiscriminant() >= 0) {
            System.out.println("PT co 2 nghiem");
        } else if (this.getDiscriminant() == 0) {
            System.out.println("PT co 1 nghiem");
        } else {
            System.out.println("PT vo nghiem");
        }
        return this.getDiscriminant();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello cac ban den voi chuong trinh cua chung toi");
        System.out.println("moi ban nhap lan luot 3 thong so a, b va c");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        XaydunglopQuadraticEquation Discriminant = new XaydunglopQuadraticEquation(a,b,c);
        Discriminant.getA();
        Discriminant.getB();
        Discriminant.getC();
        System.out.println("Discriminant :" + Discriminant.getDiscriminant());
        Discriminant.getRoot1();
        System.out.println("Root = " + Discriminant.getRoot1());
    }


}


