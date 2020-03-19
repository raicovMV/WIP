package commonMethods;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class CommonMethods {

    private final String floatValuesPath = "src/main/resources/input/floatValues";

    private final String intNumberPath = "src/main/resources/input/intNumber";

    private final String intValuesPath = "src/main/resources/input/intValues";

    private final String stringPath = "src/main/resources/input/string";

    private final String writeFilePath = "src/main/resources/output/responses";

    private final BufferedWriter writer = createOutputFile();

    public CommonMethods() throws IOException {
    }

    //Input: build file reader
    public BufferedReader createFileReader(String inputFilePath) throws IOException {
        return new BufferedReader((new FileReader(inputFilePath)));
    }

    //Input: reader for one raw
    public String readFromFile(String inputFilePath) throws IOException {
        return createFileReader(inputFilePath).readLine();
    }

    //Output: build file writer
    public BufferedWriter createOutputFile() throws IOException {
        return new BufferedWriter(new FileWriter(writeFilePath));
    }
    //Input: return List of int values from file reader
    public List<Integer> fillArrayFromInputFileWithIntValues() throws IOException {
        List<Integer> integerList = new ArrayList<Integer>();
        BufferedReader reader = createFileReader(intValuesPath);
        String read;
        while ((read = reader.readLine()) != null) {
            integerList.add(Integer.valueOf(read));
        }
        return integerList;
    }
    //Input: return List of Float values from file reader
    public List<Float> fillArrayFromInputFileWithFloatValues() throws IOException {
        List<Float> floatArrayList = new ArrayList<Float>();
        BufferedReader reader = createFileReader(floatValuesPath);
        String read;
        while ((read = reader.readLine()) != null) {
            floatArrayList.add(Float.valueOf(read));
        }
        return floatArrayList;
    }

    //Converter Integer List to int array
    public int[] convertIntListIntoArray(List<Integer> arrayList) {
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }

    //Converter Float List to float array
    public float[] convertFloatListIntoArray(List<Float> arrayList) {
        float[] array = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }

    public boolean isPrimeNumber(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
