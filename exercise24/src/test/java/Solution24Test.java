import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void test_sortString() {
        Solution24 app = new Solution24();
        String str = "dcba";

        String actual_sortedStr = app.sortString(str);
        String expected_sortedStr = "abcd";

        assertEquals(expected_sortedStr, actual_sortedStr);
    }

    @Test
    void test_compareStringLength() {
        Solution24 app = new Solution24();
        String str1 = "lemon";
        String str2 = "grape";

        boolean actual_sameLength = app.compareStringLength(str1, str2);
        boolean expected_sameLength = true;

        assertEquals(expected_sameLength, actual_sameLength);
    }

    @Test
    void test_isAnagram() {
        Solution24 app = new Solution24();
        String str1 = "tacs";
        String str2 = "cats";

        boolean actual_anagram = app.isAnagram(str1, str2);
        boolean expected_anagram = true;

        assertEquals(expected_anagram, actual_anagram);
    }

    @Test
    void test_setOutput() {
        Solution24 app = new Solution24();
        String str1 = "part";
        String str2 = "trap";
        boolean anagram = true;

        String actual_output = app.setOutput(anagram, str1, str2);
        String expected_output = "\"part\" and \"trap\" are anagrams.";

        assertEquals(expected_output, actual_output);
    }
}