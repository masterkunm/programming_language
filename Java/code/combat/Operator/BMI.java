package Operator;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float weight = sc.nextFloat();
        System.out.println("我的体重：" + weight);

        float height = sc.nextFloat();
        System.out.println("我的身高：" + height);

        System.out.println("我的BMI：" + weight / (height * height));
        sc.close();
    }
}