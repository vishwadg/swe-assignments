package org.example.question2;

import org.example.question1.ArrayFlattener;

public class ArrayFlattenerService {
    public int[] flattenArray(int[][] twoDArray) {
        if (twoDArray == null) return null;
        return new ArrayFlattener().flattenArray(twoDArray);
    }
}
