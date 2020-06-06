package ControlFlow;

// import java.math.*;

public class InvestDemo {
    public static void main(String[] args) {
        // 最终收入
        double F = 0;
        // 本金
        double p = 12000.0;
        // 年利率
        double r = 0.2;
        int n = 1;
        while(true) {
            double temp = Math.pow(1 + r, (double)n);
            F = p * temp;
            if (F > 1000000.0) {
                break;
            }
            p = F;
            n++;
        }

        System.out.println(n);
    }
}