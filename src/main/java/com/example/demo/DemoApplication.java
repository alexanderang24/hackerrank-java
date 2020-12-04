package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int maxLength = sc.nextInt();
        int[] arr = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            arr[i] = sc.nextInt();
        }

        int res = 0;
        int temp = 0;
        int length = 1;
        int times = 0;

        while (length <= maxLength) {
            for (int i = 0; i + length <= maxLength; i++) {
                for (int j = i; times < length; j++, times++) {
                    temp += arr[j];
                }
                if (temp < 0) {
                    res++;
                }
                times = 0;
                temp = 0;
            }
            length++;
        }

        System.out.println(res);
        sc.close();
    }

    // Simpler solution
    private static int negativeSubarrays(int [] array) {
        int count = 0;
        int sum   = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }
}