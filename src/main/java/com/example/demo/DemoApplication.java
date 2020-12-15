package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            String name = sc.nextLine();
            int phone = sc.nextInt();
            map.put(name, phone);
            sc.nextLine();
        }

        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (map.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + map.get(s));
            }
        }
    }
}