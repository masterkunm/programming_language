package Variable;

public class TypeDemo {
    public static void main(String[] args) {
        double pi = 3.14;
        double decimal = 2.769343;
        int year = 365;
        int num = 12;
        char eat = '吃';
        boolean f = false;
        String n = "不可描述";

        char s = '\u0000';

        // 任意运算单元的整型算术操作结果如果是等于小于int的最大值，最小值
        // 那么结果都会转换为int型
        short a = 2;
        short b = 1;
        short c = (short)(a + b);
    }
}