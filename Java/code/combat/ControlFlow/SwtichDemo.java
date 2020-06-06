package ControlFlow;

import java.util.Scanner;

public class SwtichDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        String season;
        switch(month) {
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            case 12:
            case 1:
            case 2:
                season = "Winner";
                break;
            default:
                season = "invalid";
        }
        System.out.println("the season is: " + season);
        sc.close();
    }
}