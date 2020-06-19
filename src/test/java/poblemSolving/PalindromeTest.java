package poblemSolving;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    PalindromeTest() throws IOException {
    }

    @Test
    void checkIfAStringIsPalindrome() throws IOException {
        palindrome.checkIfAStringIsPalindrome();
    }
}