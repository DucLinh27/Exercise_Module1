package Bai2_VonglaptrongJava.Baitap;

import java.util.Scanner;

public class Hienthi20songuyentodautien {
    public static void main(String args[])
    {
        int numbers;
        int count = 0;
        int num  = 2;
        /*int count =0;*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        numbers = scanner.nextInt();
        if (numbers >= 1)
        {
            System.out.println(numbers+" Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for ( int i = 2 ; i <=numbers ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    count = 0;
                    break;
                }
            }
            if ( count != 0 )
            {
                System.out.println(num);
                i++;
            }
            count = 1;
            num++;
        }
    }
}
