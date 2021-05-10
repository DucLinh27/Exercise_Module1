package Demo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tongphansoduocnhaptubanphim {
    public static void main(String[] args) {
        int n;
        float sum = 0;
        Scanner scanner = new Scanner(System.in);

        // làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        // n còn nhỏ hơn 1 thì còn nhập lại
        do {
            System.out.println("Mời bạn nhập vào số n: ");
            n = scanner.nextInt();
        } while (n < 1);

        /*
         * tính giá trị của biểu thức
         * i còn nhỏ hơn hoặc bằng n thì còn thực hiện thân vòng lặp
         */
        for (int i = 1; i <= n; i++) {
            sum += (float) 1/i; // ép kiểu về float để có kết quả chính xác
        }

        System.out.println("Tổng = " + decimalFormat.format(sum));
    }

    }
