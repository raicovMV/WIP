package poblemSolving;

import java.io.IOException;

import static java.lang.String.format;

import commonMethods.CommonMethods;

public class PrimeNumbers extends CommonMethods {

    public PrimeNumbers() throws IOException {
    }

    public void printPrimeNumbersSmallerThenGivenOne(int n) throws IOException {
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                getWriter().write(i + ", ");
            }
            getWriter().flush();
        }
        getWriter().write(format("is/are prime numbers of %d.", n));
        getWriter().close();

    }

}