package Bai2_VonglaptrongJava.Demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        for (int i=0;i<100;i+=2){
//            System.out.println("sô chẵn"+i);
//        }
        // Phuoc
//        int a[] = {1,34,23,21,43,56,72,32,43,55,81,2,10};
//        int max = a[0];
//        for(int m: a){
//            if(max < m){
//                max = m;
//            }
//        }
//        System.out.println(max);
       /* Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num % 5 != 0){
            System.out.println("nhap lai");
            num = scanner.nextInt();
        }2
        System.out.println(num);*/
//        Scanner scanner = new Scanner(System.in);
//        int num;
//        do {
//            System.out.println("Enter number:");
//            num = scanner.nextInt();
//        } while (num % 5 != 0);
//        System.out.println(num);
//        int a[] = {1, 34, 23, 21, 43, 56, 72, 32, 43, 55, 81, 2, 10};
//        for (int m : a) {
//            if (m % 8 == 0) {
//                System.out.println("so dau tien chia het cho 8: " + m);
//                break;
//            }
//        }
//        for(int m: a){
//            if(m % 2 != 0){
//                continue;
//            }
//            System.out.println(m);
//        }
//        int i = 0;
//        while (i < a.length) {
//            if (a[i] % 2 == 0) {
//                System.out.println("So chia het cho 2 : " + a[i]);
//            }
//
//            i++;
//        }
//        int i = 0;
//        do {
//            if (a[i] % 2 == 0) {
//                System.out.println(" so chia het cho 2: " + a[i]);
//            }
//            i++;
//        } while (i < a.length);
//        Arrays.stream(a).forEach(m -> System.out.println(m));
//        Arrays.stream(a).filter(m -> m % 2 == 0).forEach(m -> System.out.println(m));//arrow function
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao mot so bat ki: ");
//        int num = scanner.nextInt();
//        int n = 2;
//        while (n <= num){
//            if (checkPrime(n)){
//                System.out.print(n + " ");
//            }
//            n++;
//        }
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        String m = scanner.nextLine();
//        System.out.println("So vua nhap: " + n);
//        System.out.println("Chuoi vua nhap: " + m);
        System.out.print("Hello");
        System.out.println("World");
        System.out.printf("Hello %.2f", 18.056);
    }
    public static boolean checkPrime(int n) {
        if (n == 2){
            return true;
        }
        for (int i = 2; i<= Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
