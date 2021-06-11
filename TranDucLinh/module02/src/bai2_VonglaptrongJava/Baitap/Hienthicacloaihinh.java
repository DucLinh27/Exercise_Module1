package bai2_VonglaptrongJava.Baitap;

import java.util.Scanner;

public class Hienthicacloaihinh {
    public static void main(String[] args) {
        int choose;
        int chieudai;
        int chieurong;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Print the rectangle"+"\n"
        +"2.Print the square triangle"+"\n"+"3.Print isosceles triangle"+
                "\n"+"4.Exit");

        System.out.println("Moi ban nhap lua chon:");
        while (true){
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.println("Nhap chieu dai: ");
                    chieudai = Math.round(sc.nextFloat());
                    System.out.println("Nhap chieu rong");
                    chieurong = Math.round(sc.nextFloat());
                    for (int i = 0; i < chieudai;i++){
                        for (int j = 0; j <chieurong; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("----------------------------");
                    break;
                case 2 :
                    System.out.println("Print the square triangle");
                    for(int i=1; i<=5; i++){
                        for(int j=1; j<i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }

                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for(int i=7;i>=1;i--){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
            }
        }


    }
}
