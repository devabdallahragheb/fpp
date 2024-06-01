package homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {
    @Test
    void isPalindrome() {
        Assertions.assertTrue(Palindrome.isPalindrome(121));
    }

    @Test
    void isNotPalindrome() {
        Assertions.assertFalse(Palindrome.isPalindrome(123));
    }

    @Test
    void isNotPalindromeAndNegativeNumber() {
        Assertions.assertFalse(Palindrome.isPalindrome(-121));
    }
}