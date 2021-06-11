package Bai10.Stack_Quene.Baitap.Stack.optionStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        String string = "s * (s – a) * (s – b * (s – c)";
        for (int i = 0; i < string.length(); i++) {
            char check = string.charAt(i);
            if (check == '(') {
                stack.push(string.charAt(i));
            }
            if (check == ')') {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Well");
        } else {
            System.out.println("Not well");
        }
    }
    }







