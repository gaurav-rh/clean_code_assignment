package com.knoldus.cleancode;

public class MinMaxFinder {

    static class MinMax {
        int minimumNumber;
        int maximumNumber;

    }
    //method returns com.knoldus.MinMaxFinder object that contains maximum and minimum number
    static MinMax maximumMinimum(int[] array, int arrayLength) {
        MinMax minMaxObject = new MinMax();
        int iteration;

        // minimum and maximaum number of MinMaxObject will be same if arraylength is 1
        if (arrayLength == 1) {
            minMaxObject.maximumNumber = array[0];
            minMaxObject.minimumNumber = array[0];
            return minMaxObject;
        }
        //if first element of array is greater, it is set as maximum number else set the second element as maximum
        if (array[0] > array[1]) {
            minMaxObject.maximumNumber = array[0];
            minMaxObject.minimumNumber = array[1];
        } else {
            minMaxObject.maximumNumber = array[1];
            minMaxObject.minimumNumber = array[0];
        }
        //iterating the whole array to check minimum and maximum number
        for (iteration = 2; iteration < arrayLength; iteration++) {
            if (array[iteration] > minMaxObject.maximumNumber) {
                minMaxObject.maximumNumber = array[iteration];
            } else if (array[iteration] < minMaxObject.minimumNumber) {
                minMaxObject.minimumNumber = array[iteration];
            }
        }
        return minMaxObject;
    }

    public static void main(String[] args) {
        int[] array = {1000, 11, 445, 1, 330, 3000};
        int arrayLength = 6;
        //Object of MinMax class is created to access the minimum and maximum number of the array.
        MinMax minMaxObject = maximumMinimum(array, arrayLength);
        System.out.printf("\nminimum is %d", minMaxObject.minimumNumber);
        System.out.printf("\nmaximum is %d", minMaxObject.maximumNumber);
    }
}

