package bai3_Mang.Demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//
//        System.out.print("Even number: ");
//        for (int i : arr) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
        Scanner input =new Scanner(System.in);
            System.out.println("Nhap so luong phan tu: ");
            int n = input.nextInt();
            int[] arr = new int[n];
            inputArray(arr, input);
            showArray(arr);
            System.out.println(tong(arr));
            System.out.println(max(arr));
        }
        public static void inputArray(int[] a, Scanner input) {
            System.out.println("Nhap cac phan tu vao mang: ");
            for (int i = 0; i < a.length; i++) {
                System.out.printf("arr[%d]: ", i);
                a[i] = input.nextInt();
            }
        }
        public static void showArray(int[] b) {
            for (int i = 0; i < b.length; i++) {
                System.out.printf("arr[%d] = %d\n", i, b[i]);
            }
        }
        public static int tong(int[] b) {
            int tong1 = 0;
            for (int i = 0; i < b.length; i++) {
                tong1 += b[i];
            }
            return tong1;
        }
        public static int max(int arr[]) {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }
    }

