package question2;

import org.example.question2.ArrayFlattenerService;
import org.example.question2.ArrayReversor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {
    @Mock
    private ArrayFlattenerService arrayFlattenerService;

    private ArrayReversor arrayReversor;

    @Before
    public void set() {
        MockitoAnnotations.openMocks(this);
        arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @Test
    public void testReverseArrayWithLegitInput() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] flatArray = {1, 3, 0, 4, 5, 9};
        int[] expectedResult = {9, 5, 4, 0, 3, 1};

        when(arrayFlattenerService.flattenArray(input)).thenReturn(flatArray);

        int[] reverseResult = arrayReversor.reverseArray(input);

        assertArrayEquals(expectedResult, reverseResult);
        verify(arrayFlattenerService).flattenArray(input);
    }

    @Test
    public void testReverseArrayWithNullInput(){
        assertNull(arrayReversor.reverseArray(null));
        verifyZeroInteractions(arrayFlattenerService);
    }
}
