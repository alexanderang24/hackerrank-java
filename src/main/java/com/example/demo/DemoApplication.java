package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i, scanner.nextInt());
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String type = scanner.next();
            if (type.equals("Insert")) {
                list.add(scanner.nextInt(), scanner.nextInt());
            } else if (type.equals("Delete")) {
                list.remove(scanner.nextInt());
            }
        }

        String output = list.toString().substring(1, list.toString().length() - 1).replace(",","");
        System.out.println(output);
    }
}