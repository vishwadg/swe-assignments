package org.example.question1;

public class ArrayFlattener {
    public int[] flattenArray(int[][] twoDArray) {
        int oneDArraySize = 0;

        if (twoDArray == null) {
            return null;
        }

        for (int[] arr : twoDArray) {
            oneDArraySize += arr.length;
        }

        int[] oneDArray = new int[oneDArraySize];
        int pos = 0;
        for (int[] arr : twoDArray) {
            for (int num : arr) {
                oneDArray[pos++] = num;
            }
        }
        return oneDArray;
    }
}
