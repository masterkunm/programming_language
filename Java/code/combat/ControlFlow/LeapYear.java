package ControlFlow;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("请输入年份: ");

        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();
        if ( (yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0) {
            System.out.println(yr + " this is leap year");
        }
        else {
            System.out.println(yr + " this is not leap year");
        }

        sc.close();
    }
}