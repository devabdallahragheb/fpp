package homework4;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        } else {
            String str = Integer.toString(number);
            return isPalindromeHelper(str, 0, str.length() - 1);
        }
    }

    private static boolean isPalindromeHelper(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindromeHelper(str, left + 1, right - 1);
    }
}
