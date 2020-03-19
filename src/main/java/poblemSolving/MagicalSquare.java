package poblemSolving;

import java.io.IOException;

import commonMethods.CommonMethods;

public class MagicalSquare extends CommonMethods {

    public MagicalSquare() throws IOException {
    }

    public void checkIfItIsMagicalSquare(int[][] sq) throws IOException {

        int sumOfPrimeDiagonal = 0;
        int sumOfSecondDiagonal = 0;
        boolean isMagicSquare = false;

        for (int i = 0; i < sq.length; i++) {
            sumOfPrimeDiagonal += sq[i][i];
            sumOfSecondDiagonal += sq[i][sq.length - i - 1];
        }

        for (int i = 0; i < sq.length; i++) {
            int sumOfRow = 0;
            int sumOfColumn = 0;
            for (int j = 0; j < sq.length; j++) {
                sumOfRow += sq[i][j];
                sumOfColumn += sq[j][i];
            }
            isMagicSquare = sumOfRow == sumOfColumn && sumOfPrimeDiagonal == sumOfSecondDiagonal && sumOfColumn == sumOfPrimeDiagonal;
        }
        getWriter().write("It is a magical square: " + isMagicSquare);
        getWriter().close();
    }

}