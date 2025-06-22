import java.util.Arrays;

public class rotateleft {
    public static void main(String[] args) {
        rotateleft obj = new rotateleft();

        int[] result1 = obj.rotateLeft3(new int[]{1, 2, 3});
        int[] result2 = obj.rotateLeft3(new int[]{5, 11, 9});
        int[] result3 = obj.rotateLeft3(new int[]{7, 0, 0});

        // Use Arrays.toString to print arrays
        System.out.println(Arrays.toString(result1)); // [2, 3, 1]
        System.out.println(Arrays.toString(result2)); // [11, 9, 5]
        System.out.println(Arrays.toString(result3)); // [0, 0, 7]
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[]{ nums[1], nums[2], nums[0] };
    }
}
