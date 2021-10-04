import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void test_filterEvenNumbers() {
        Solution38 app = new Solution38();
        String input = "3 4 5 6 7 8 9";

        String actual_evens = app.filterEvenNumbers(input);
        String expected_evens = "4 6 8";

        assertEquals(expected_evens, actual_evens);
    }

    @Test
    void test_stringToIntArray() {
        Solution38 app = new Solution38();
        String in = "3 4 5 6 7 8 9";

        int[] actual_arr = app.stringToIntArray(in);
        int[] expected_arr = new int[] {3, 4, 5, 6, 7, 8, 9};

        assertEquals(expected_arr, actual_arr);
    }

    @Test
    void test_getEvenInts() {
        Solution38 app = new Solution38();
        int[] all = new int[] {3, 4, 5, 6, 7, 8, 9};

        int[] actual_even = app.getEvenInts(all);
        int[] expected_even = new int[] {4, 6, 8};

        assertEquals(expected_even, actual_even);
    }

    @Test
    void test_arrayToString() {
        Solution38 app = new Solution38();
        int[] evens = new int[] {4, 6, 8};

        String actual_string = app.arrayToString(evens);
        String expected_string = "4 6 8";

        assertEquals(expected_string, actual_string);
    }

    @Test
    void test_setOutput() {
        Solution38 app = new Solution38();
        String evens = "4 6 8";

        String actual_output = app.setOutput(evens);
        String expected_output = "The even numbers are 4 6 8.";

        assertEquals(expected_output, actual_output);
    }
}