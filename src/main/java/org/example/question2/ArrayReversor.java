package org.example.question2;

public class ArrayReversor {
    private ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] twoDArray) {
        if (twoDArray == null) {
            return null;
        }

        int[] flattenArray = flattenerService.flattenArray(twoDArray);
        int[] reversedArray = new int[flattenArray.length];
        int pos = 0;
        for (int i = flattenArray.length - 1; i >= 0; i--) {
            reversedArray[pos++] = flattenArray[i];
        }
        return reversedArray;
    }
}
