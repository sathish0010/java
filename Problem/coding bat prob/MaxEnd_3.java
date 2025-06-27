/*Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.


maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]     */


public class MaxEnd3 {
    public static int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);  // Find the larger of first and last
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }

    public static void main(String[] args) {
        // Test examples
        int[] result1 = maxEnd3(new int[]{1, 2, 3});
        int[] result2 = maxEnd3(new int[]{11, 5, 9});
        int[] result3 = maxEnd3(new int[]{2, 11, 3});

        System.out.println(java.util.Arrays.toString(result1)); // [3, 3, 3]
        System.out.println(java.util.Arrays.toString(result2)); // [11, 11, 11]
        System.out.println(java.util.Arrays.toString(result3)); // [3, 3, 3]
    }
}
