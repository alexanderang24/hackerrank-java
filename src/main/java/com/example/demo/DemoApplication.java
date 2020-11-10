package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String temp = "";
        for (int i = 0; i <= s.length() - k; i++) {
            temp = s.substring(i, i + k);

            if(smallest.equals("")) smallest = temp;
            if(largest.equals("")) largest = temp;

            if (temp.compareTo(smallest) < 0) {
                smallest = temp;
            }

            if (temp.compareTo(largest) > 0) {
                largest = temp;
            }
        }
        return smallest + "\n" + largest;
    }
}
