// linear Search
// leetcode 1482 https://leetcode.com/problems/minimum-number-of-days-to-make-mbouquets/description/


 package BinarySearch.binarySeacrhonAnswers;
 
 public class minimumdaystomakeMbouquetes {
     

        // keypoints
        // 1. find the maximum and eliminate the search space accordingly.
        // 2. if we can make m bouquets in mid days then we can make m bouquets in mid - 1 days.
        // 3. if we cannot make m bouquets in mid days then we cannot make m bouquets in mid + 1 days.
        // 4. so we need to find the minimum no of days to make m bouquets.

    //     static boolean possible (int[] arr , int day , int m , int k) {
    //         int n = arr.length;
    //         int NoOfB = 0;
    //         int count = 0;

    //         for (int i = 0; i < n; i++) {
    //             if (day <= arr[i]) {
    //                 count++;
    //             }
    //             else {
    //                 NoOfB += (count / k);
    //                 count = 0;
    //             }
    //         }
    //         NoOfB += (count / k);
    //         return NoOfB >= m; // it correctly return the minimum value because we start from mini from maximum first return the minimum possible value; 
    //     }
    //     static int roseGarden (int[] arr, int k, int m) {
    //         int n = arr.length;
    //         int mini = Integer.MAX_VALUE , maxi = Integer.MIN_VALUE;
    //         if ((m*k) > n) return -1;
            
    //         for (int i = 0; i < n; i++) {
    //             if (arr[i] < mini) mini = arr[i];
    //             else {
    //                 maxi = arr[i];
    //             }
    //         }

    //         for (int i = mini; i <= maxi; i++) {
    //             if(possible(arr,i,m,k));
    //             return i;
    //         }
    //         return -1;          
    //     }
        
    // public static void main(String[] args) {
    //     int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
    //     int k = 3;
    //     int m = 2;
    //     int ans = roseGarden(arr, k, m);
    //     if (ans == -1)
    //         System.out.println("We cannot make m bouquets.");
    //     else
    //         System.out.println("We can make bouquets on day " + ans);
    // }


    // binary search
 }