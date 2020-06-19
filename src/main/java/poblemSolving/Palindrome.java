package poblemSolving;

import java.io.IOException;

import static java.lang.String.format;

import commonMethods.CommonMethods;

public class Palindrome extends CommonMethods {

    public Palindrome() throws IOException {
    }

    public void checkIfAStringIsPalindrome() throws IOException {
        String readLine = readFromFile(getStringPath());
        String revertedLine = "";

        for (int i = readLine.length() - 1; i >= 0; i--) {
            revertedLine += readLine.charAt(i);
        }
        if (readLine.equals(revertedLine)) {
            getWriter().write(format("Yes, %s is a palindrome", revertedLine));
        } else {
            getWriter().write(format("No, %s is not palindrome", revertedLine));
        }
        getWriter().close();
    }

}