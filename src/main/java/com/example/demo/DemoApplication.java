package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    public final String pattern;

    public MyRegex() {
        pattern = "^([0-9]|[0-9][0-9]|((0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5]))[.]" +
                   "([0-9]|[0-9][0-9]|((0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5]))[.]" +
                   "([0-9]|[0-9][0-9]|((0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5]))[.]" +
                   "([0-9]|[0-9][0-9]|((0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5]))$";
    }
}
