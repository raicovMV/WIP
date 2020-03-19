package poblemSolving;

import java.io.BufferedWriter;
import java.io.IOException;

import commonMethods.CommonMethods;

public class Staircase extends CommonMethods {

    public Staircase() throws IOException {
    }

    public void drawStairCase(int n) throws IOException {
        BufferedWriter writer = createOutputFile();
        String sign = "#";
        String[] chars = new String[n];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j <= i; j++) {
                writer.write(sign);
                writer.flush();
            }
            writer.newLine();
        }
    }

}