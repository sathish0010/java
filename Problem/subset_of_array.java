class array_subset {
    public static void printSubset(int[] arr1, int[] arr2) {
        System.out.print("Subset elements: ");
        boolean found = false;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
            
                }
            }
            if (found) {
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println(); // move to new line
    }

    public static void main(String args[]) {
        int[] arr1 = {1, 4, 3, 2, 5};
        int[] arr2 = {1, 5, 4};
        printSubset(arr1, arr2);
    }
}
