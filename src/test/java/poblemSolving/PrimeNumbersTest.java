package poblemSolving;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import commonMethods.CommonMethods;

class PrimeNumbersTest {

    CommonMethods methods = new CommonMethods();

    PrimeNumbers primeNumbers = new PrimeNumbers();

    int number = Integer.parseInt(methods.readFromFile(methods.getIntNumberPath()));

    PrimeNumbersTest() throws IOException {
    }

    @Test
    void printPrimeNumbersSmallerThenGivenOne() throws IOException {
        primeNumbers.printPrimeNumbersSmallerThenGivenOne(number);
    }
}