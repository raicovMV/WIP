package poblemSolving;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import commonMethods.CommonMethods;

class RoundPiTest {

    CommonMethods methods = new CommonMethods();

    RoundPi pi = new RoundPi();

    int number = Integer.parseInt(methods.readFromFile(methods.getIntNumberPath()));

    RoundPiTest() throws IOException {
    }

    @Test
    void round() throws IOException {
        pi.round(number);
    }

}