class FrequencyCounterSimple {
    public static void main(String[] args) {
        int[] input = {40, 20, 10, 50, 20, 10, 30, 40};
        boolean[] visited = new boolean[input.length];

        for (int i = 0; i < input.length; i++) {
            if (visited[i]==true) {
                continue; // Skip already counted elements
            }

            int count = 1;

            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(input[i] + " -> " + count);
        }
    }
}
