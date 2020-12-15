package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.Stack;

@SpringBootApplication
public class DemoApplication {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (!stack.isEmpty()) {
                    if (c == ')') {
                        if (stack.peek() == '(') stack.pop();
                    } else if (c == '}') {
                        if (stack.peek() == '{') stack.pop();
                    } else if (c == ']') {
                        if (stack.peek() == '[') stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }
            }
            System.out.println(stack.isEmpty());
        }
    }
}