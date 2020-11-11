package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        ArrayList<String> list = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            String charAt = String.valueOf(s.charAt(i));
            if(!charAt.matches("[ !,?._'@]")) {
                temp = temp + charAt;
            } else if (!temp.equals("")) {
                list.add(temp);
                temp = "";
                continue;
            }
            if(i == s.length() - 1 && !temp.equals("")) {
                list.add(temp);
            }
        }

        System.out.println(list.size());
        for (String a: list) {
            System.out.println(a);
        }
        scan.close();

        // Simpler solution using String.split
//        if (s.trim().length() == 0 || s.trim().length() > 400000) {
//            System.out.println(0);
//            return;
//        }
//        String words[]=s.trim().split("[ !,?.\\_'@]+");
//        System.out.println(words.length);
//        for (String word: words) {
//            System.out.println(word);
//        }
    }
}
