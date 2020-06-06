package ControlFlow;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int fac = 1;
        while (f > 1) {
            fac *= f;
            f--;
        }

        System.out.println(fac);

        sc.close();
    }
}