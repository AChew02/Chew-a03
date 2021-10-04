import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void test_setOutput() {
        Solution28 app = new Solution28();
        int sum = 20;

        String actual_output = app.setOutput(sum);
        String expected_output = "The total is 20.";

        assertEquals(expected_output, actual_output);
    }
}