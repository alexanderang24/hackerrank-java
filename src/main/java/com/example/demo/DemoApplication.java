package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return winnable(leap, game, 0);
    }

    private static boolean winnable(int leap, int[] game, int pos) {
        if (pos >= game.length){
            return true;
        } else if (pos == -1 || game[pos] == 1) {
            return false;
        }
        // mark this position is already visited
        game[pos] = 1;

        return winnable(leap, game, pos + 1) ||
                winnable(leap, game, pos + leap) ||
                winnable(leap, game, pos - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}