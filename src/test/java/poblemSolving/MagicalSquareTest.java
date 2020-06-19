package poblemSolving;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import commonMethods.CommonMethods;

class MagicalSquareTest {

    MagicalSquare magicalSquare = new MagicalSquare();

    int[][] sq = {{8, 11, 14, 1},
            {13, 2, 7, 12},
            {3, 16, 9, 6},
            {10, 5, 4, 15}
    };

    MagicalSquareTest() throws IOException {
    }

    @Test
    void checkIfItIsMagicalSquare() throws IOException {
        magicalSquare.checkIfItIsMagicalSquare(sq);
    }

}