public class reverse_3 {
    public static int[] reverse3(int[] nums) {
        return new int[] { nums[2], nums[1], nums[0] };
    }

    public static void main(String[] args) {
    
        int[] result = reverse3(new int[] {1, 2, 3});
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
