package Array;
/**
 * array in java
 * @ 西行修真的伍师弟
 * @ 28/05/2020
 */
public class ArrayCopyDemo {
    public static void main(String args[]) {
        char copyFrom[] = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                            'i', 'n', 'a', 't', 'e', 'd' };
        char copyTo[] = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
        System.out.println(new String(copyTo));
    }
}