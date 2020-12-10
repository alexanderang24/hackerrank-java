package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<int[]> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] temp  = new int[scanner.nextInt()];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = scanner.nextInt();
            }
            arrayList.add(temp);
        }

        int totalQueries = scanner.nextInt();
        for (int i = 0; i < totalQueries; i++) {
            find(scanner.nextInt()-1, scanner.nextInt()-1, arrayList);
        }
    }

    private static void find(int x, int y, ArrayList<int[]> list) {
        int[] row = list.get(x);
        if(y >= row.length) {
            System.out.println("ERROR!");
        } else {
            System.out.println(row[y]);
        }
    }
}