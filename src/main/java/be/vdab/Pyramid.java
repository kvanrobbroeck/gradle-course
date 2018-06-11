package be.vdab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Runs the application, which is awesome.
 * @author Kevin
 * @since 2018-05-29
 */
public class Pyramid {
    public static void main(String[] args) {
        int i = 0;
        int max = 7;

        while(i <= max) {
//            int power = (int)Math.pow(2, i);

            // Count powers up
            for(int j = 0; j <= i; j++) {
                System.out.print((int)Math.pow(2, j) + " ");
            }

            // Count powers down
            for(int k = i-1; k >= 0; k--) {
                System.out.print((int)Math.pow(2, k) + " ");
            }
            System.out.println();
            i++;
        }
    }
}