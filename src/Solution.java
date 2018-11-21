import java.util.Arrays;

/**
 * Development IDE: IntelliJ IDEA
 * Author: irving
 * Project Name: Reverse Integer
 * Date: 2018-11-20
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            if ((Integer.MAX_VALUE - temp) / 10 < result && result > 0) {
                return 0;
            }
            if ((Integer.MIN_VALUE - temp) / 10 > result && result < 0) {
                return 0;
            }
            result = result * 10 + temp;
//            System.out.println(result);
        }
        return result;
    }
}
