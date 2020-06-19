package poblemSolving;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import commonMethods.CommonMethods;

public class RoundPi extends CommonMethods {

    public RoundPi() throws IOException {
    }

    // do PI approximations using Babylonian method to calculate PI value
    public void round(int places) throws IOException {
        int count = 10;
        int m = 1;
        int n = 0;
        double pi = 0.0;
        final double SQRT_12 = Math.sqrt(12);
        while (count > n) {
            pi += SQRT_12 * (Math.pow(-1, n) / (m * Math.pow(3, n)));
            m += 2;
            n++;
        }

        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(Double.toString(pi));
        bd = bd.setScale(places -1, RoundingMode.HALF_UP);
        getWriter().write(String.valueOf(bd.doubleValue()));
        getWriter().close();
    }

}