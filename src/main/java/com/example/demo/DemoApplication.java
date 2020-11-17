package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            String regex = "(<(.+)>)([^<]+)(</\\2>)";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);
            boolean noMatch = true;

            while(m.find()) {
                noMatch = false;
                System.out.println(m.group(3));
            }

            if(noMatch) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}