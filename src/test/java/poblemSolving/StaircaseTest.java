package poblemSolving;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import commonMethods.CommonMethods;

class StaircaseTest {

    CommonMethods commonMethods = new CommonMethods();

    Staircase staircase = new Staircase();

    int number = Integer.parseInt(commonMethods.readFromFile(commonMethods.getIntNumberPath()));

    StaircaseTest() throws IOException {
    }

    @Test
    void drawStairCase() throws IOException {
        staircase.drawStairCase(number);
    }
}