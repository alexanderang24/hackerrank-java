package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}