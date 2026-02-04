package BinarySearch.binarySeacrhonAnswers;

public class FindsquarerootOfanumberinlogn {
    //linear search
    // use long to avoid overflow for example 46340*46340 = 2147395600 < 2147483647
    // public static int floorSqrt(int n) {
    //     int ans = 0;
    //     // linear search on the answer space
    //     for (long i = 1; i <= n; i++) {
    //         long val = i * i;
    //         if (val <= (long) n) {
    //             ans = (int) i;
    //         } else {
    //             break;
    //         }
    //     }
    //     return ans;
    // }

    //binary search
    public static int floorSqrt(int n) {
        int low = 1, high = n;
        //Binary search on the answers:
        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;

            if (val == n) {
                return (int) mid;
            }
            if (val <= (long)(n)) {
                //eliminate the left half:
                low = (int)(mid + 1);
            } else {
                //eliminate the right half:
                high = (int)(mid - 1);
            }
        }
        return high;// high is the floor of sqrt(n)
    }

    public static void main(String[] args) {
        int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }


}
