package dayThree;

import java.util.Arrays;

public class SecondLargest {
    public int print2largest(int arr[], int total) {
        int i, j, first;

        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] >arr[j]) {
                    first =arr[i];
                    arr[i] = arr[j];
                    arr[j] = first;
                }
            }
        }

        return arr[total-2];
    }

    public static void main(String[] args) {
        int arr[] = {10, 35, 70000, 10, 70008, 100000 , 0};
        SecondLargest sc = new SecondLargest();
        System.out.println(sc.print2largest(arr, arr.length));
    }
}
