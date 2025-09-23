package recursion;

import java.util.ArrayList;

public class subsequence {
    static void findSequence(int index, ArrayList<Integer> ds, int sum, int[] arr, int s, int n) {
        // Example implementation (prints subsequences with sum == s)
        if (index == n) {
            if (sum == s) {
                for (Integer it : ds) {
                    System.out.print(it + " ");
                }
            }
            return;
        }

        ds.add(arr[index]);
        sum += arr[index];
        findSequence(index + 1, ds, sum, arr, s, n); // take part

        ds.remove(ds.size() - 1);
        sum -= arr[index];
        findSequence(index + 1, ds, sum, arr, s, n); // not take part
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        int s = 2;
        findSequence(0, ds, 0, arr, s, n);
    }
}
