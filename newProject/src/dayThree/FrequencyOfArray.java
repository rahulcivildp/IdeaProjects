package dayThree;

public class FrequencyOfArray {
    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];

        FrequencyOfArray.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    private static void fill(boolean[] visited, boolean b) {
    }

    // Driver code
    public static void main(String []args)
    {
        int arr[] = new int[]{ 10, 20, 20, 10, 5, 5, 5, 20 };
        int n = arr.length;
        countFreq(arr, n);
    }
}