package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(isAnagram(a, b));
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        for(int i = 0; i < a.length(); i++) {
            hashMap1.merge(a.charAt(i), 1, Integer::sum);
        }

        for(int i = 0; i < b.length(); i++) {
            hashMap2.merge(b.charAt(i), 1, Integer::sum);
        }

        for(int i = 0; i < hashMap1.size(); i++) {
            char charI = b.charAt(i);
            if(!hashMap1.containsKey(charI) || !hashMap1.get(charI).equals(hashMap2.get(charI))) {
                return false;
            }
        }
        return true;
    }
}
