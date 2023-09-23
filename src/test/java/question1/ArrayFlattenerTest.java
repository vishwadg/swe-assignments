package question1;

import org.example.question1.ArrayFlattener;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFlattenerTest {
    private ArrayFlattener arrayFlattener;

    @Before
    public void set() {
        arrayFlattener = new ArrayFlattener();
    }

    @Test
    public void testFlattenArrayWithLegit2DArrayInput() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedResult = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expectedResult, arrayFlattener.flattenArray(input));
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        assertNull(arrayFlattener.flattenArray(null));
    }
}
