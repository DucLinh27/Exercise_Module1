package Bai3_Mang.Baitap;

import java.util.Scanner;

public class Xoaphantukhoimang {

    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số luong phần tử của mảng: ");
        n = scanner.nextInt();
        int arr[] = new int[n];
        int[] newArr = new int[n - 1];
        System.out.println("Nhap cac phan tu cua mang");
        for (int j = 0; j < n ; j++) {
            System.out.printf("a[%d] :", j);
            arr[j] = scanner.nextInt();
        }


        System.out.println("Nhập số muon xoa: ");
        int k = scanner.nextInt();


        // xóa phần tử k ra khỏi mảng
        // vòng lặp for sẽ khởi tạo c = i = 0
        // và duyệt i từ 0 đến n
        // nếu phần tử tại vị trí i khác với số nguyên k
        // thì gán phần tử tại i cho phần tử tại k
        // sau đó tăng c lên 1
        for (c = i = 0; i < n; i++) {
            if (arr[i] != k) {
                newArr[c] = arr[i];
                c++;
            }
        }

       /* n = c;*/  // lúc này số phần tử trong mảng sẽ bằng c

        // hiển thị các phần tử trong mảng sau khi xóa k
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}

