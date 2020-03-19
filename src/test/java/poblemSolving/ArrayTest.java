package poblemSolving;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import commonMethods.CommonMethods;

class ArrayTest {

    CommonMethods methods = new CommonMethods();

    Array array = new Array();

    int[] intArray = methods.convertIntListIntoArray(methods.fillArrayFromInputFileWithIntValues());

    float[] floatArray = methods.convertFloatListIntoArray(methods.fillArrayFromInputFileWithFloatValues());

    ArrayTest() throws IOException {
    }

    @Test
    void revertAnArrayWithFloatNumbers() throws IOException {
        array.revertAnArrayWithFloatNumbers(floatArray);
    }

    @Test
    void sortAnArray() throws IOException {
        array.bubbleSortOfAnArray(intArray);
    }

    @Test
    void sumOfOddOrAverageOfEvenNumbers() throws IOException {
        array.sumOfOddAndAverageOfEvenNumbers(methods.fillArrayFromInputFileWithIntValues());
    }

}