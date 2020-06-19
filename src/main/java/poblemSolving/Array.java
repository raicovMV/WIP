package poblemSolving;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static java.lang.String.format;

import commonMethods.CommonMethods;

public class Array extends CommonMethods {

    public Array() throws IOException {
    }

    //3.Invert an array with floating point numbers
    public void revertAnArrayWithFloatNumbers(float[] array) throws IOException {
        BufferedWriter writer = createOutputFile();
        float[] revertedArray = new float[array.length];
        int indexOfRevArr = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            revertedArray[indexOfRevArr] = array[i];
            indexOfRevArr++;
        }
        writer.write(format("Reverted array of %s is ", Arrays.toString(array)) + Arrays.toString(revertedArray));
        writer.close();
    }

    //4.BubbleSort for integer array
    public void bubbleSortOfAnArray(int[] intArray) throws IOException {
        BufferedWriter writer = createOutputFile();
        int sortedValue;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    sortedValue = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = sortedValue;
                }
            }
        }
        writer.write("Sorted array " + Arrays.toString(intArray));
        writer.close();
    }

    //5.Sum of odd and the amount of even numbers
    public void sumOfOddAndAverageOfEvenNumbers(List<Integer> intList) throws IOException {
        int sumOfOddNumbers = 0;
        int countOfEvenNumber = 0;
        for (int value : intList) {
            if (value >= 0) {

                if (value % 2 != 0) {
                    sumOfOddNumbers += value;
                } else {
                    countOfEvenNumber++;
                }
            }
        }
        getWriter().write("Sum of odd numbers is: " + sumOfOddNumbers);
        getWriter().flush();
        getWriter().newLine();
        getWriter().write("Amount of even numbers is: " + countOfEvenNumber);
        getWriter().close();
    }

    public void mergeThreeArraysInOne(List<Integer> list1, List<Integer> list2, List<Integer> list3) throws IOException {
        list3.addAll(list1);
        list3.addAll(list2);
        int[] mergedLists = new int[list3.size()];

        for (int i = 0; i < list3.size(); i++) {
            mergedLists[i] = list3.get(i);
        }
        bubbleSortOfAnArray(mergedLists);
        getWriter().write(" is those 3 merged arrays into one");
        getWriter().close();
    }

}