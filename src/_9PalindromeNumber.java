// 9.回文数
// 给你一个整数 x ，如果 x 是一个回文整数，返回 true；否则，返回 false。
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
// 例如，121 是回文，而 123 不是。
public class _9PalindromeNumber {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int rev = 0, temp = x;
        if (x < 0) {
            return false;
        }
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        return rev == x;
    }
}