package Top_Interview_150;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.sort;

class RemoveElement27Test {

    @Test
    void testFirst(){
        RemoveElement27 element27 = new RemoveElement27();

        int[] nums = new int[]{3,2,2,3}; // Input array
        int val = 3; // Value to remove
        int[] expectedNums = new int[]{2,2}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = element27.removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < expectedNums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testSecond(){
        RemoveElement27 element27 = new RemoveElement27();

        int[] nums = new int[]{0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = new int[]{0,1,4,0,3}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = element27.removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
    }

}