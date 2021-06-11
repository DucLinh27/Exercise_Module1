package Bai10.Stack_Quene.Baitap.dao_nguoc_phan_tu;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverseNumber(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void reverseNumber(int[] arr) {
        Stack<Integer> stacks = new Stack<Integer>();
        for (int value : arr) {
            stacks.push(value);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stacks.pop();
        }
    }
}
