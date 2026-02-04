package BinarySearch.binarySeacrhonAnswers;
// linear search
    /* public class Main {
    public static int findNthRoot(int N, int M) {
        for (int i = 1; i <= M; i++) {
            long power = 1;
            for (int j = 1; j <= N; j++) {
                power *= i;
                if (power > M) break; // optimization: stop early
            }
            if (power == M) return i;
        }
        return -1; // no integer root found
    }

    public static void main(String[] args) {
        int N = 3;
        int M = 27;

        int root = findNthRoot(N, M);
        System.out.println("Nth root of " + M + " is: " + root);
    }
}
     * 
     * 
     * 
     * 
     * 
    */
public class findnthroot {
        //binary search
    //keypooints    
    //overflow case is main concern in this problem.
    //Return 1 if mid == m
    //Return 0 if mid < m
    //Return 2 if mid > m
    public static int func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;//reduce the search space to the left half 
            
        }
        if (ans == m) return 1;
        if (ans < m) return 0;
        return -1; // This case should not happen we should return dummmy statement for the int function.

    }

    public static int NthRoot(int n, int m) {
        // Use binary search on the answer space:
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midN = func(mid, n, m);
            if (midN == 1) {
                return mid;
            } else if (midN == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3, m = 27;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }
       
    
}
