class commonEnd {

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    public static void main(String[] args) {
        commonEnd obj = new commonEnd(); // Create object to call non-static method

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 3};
        System.out.println(obj.commonEnd(arr1, arr2)); // true

        int[] arr3 = {1, 2, 3};
        int[] arr4 = {7, 3, 2};
        System.out.println(obj.commonEnd(arr3, arr4)); // false

        int[] arr5 = {1, 2, 3};
        int[] arr6 = {1, 3};
        System.out.println(obj.commonEnd(arr5, arr6)); // true
    }
}
