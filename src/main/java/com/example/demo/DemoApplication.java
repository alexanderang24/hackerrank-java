package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger a = new BigInteger(n);
        boolean prime = a.isProbablePrime(1);
        if(prime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        scanner.close();
    }
}