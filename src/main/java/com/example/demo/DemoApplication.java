package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean flag = true;
        int loop = s.length() / 2;

        for(int i = 0; i < loop; i++) {
            if (s.charAt(i) != s.charAt(s.length() - (i+1))) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
