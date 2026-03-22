package BinarySearch.binarySeacrhonAnswers;
// keypoints 
/* 
 * the main formula if no of bananas/hour
 * we need to return the minimum no of hours to eat all the bananas.
 * for example if k = 3 and piles = [3,6,7,11] then the answer is 8.
 * because 3bananas/hour = 1 hour to eat this piles [3,6,7,11] take 
 * arr[o] = 3/3 = 1 hour , arr[1] = 6/3 = 2 hour, arr[2] = 7/3 = 3 hour, arr[3] = 11/3 = 4 hour.
 * so the total time is 1 + 2 + 3 + 4 = 10 hours.
 * next how to find the minimum hours i can tell the minimum no of bananas/hour is allways in the range of 1 to max(piles).
 * for more check the vedio https://www.youtube.com/watch?v=qyfekrNni90
 * 
 */     
public class kokoeatingbanana {
    // // linear search ..
    // static int maxelement(int[]v) {
    //     int n = v.length;
    //     int max = v[0];
    //     for (int i = 0; i < n; i++) {
    //         max = Math.max(v[i],max);
    //     }
    //     return max;
    // }
    // static int calculaterequiretime(int[]v, int hourly) {
    //     int time = 0;
    //     int n = v.length;

    //     for (int i = 0; i < n; i++) {
    //         time += Math.ceil((double)(v[i]) / (double)(hourly));
    //     }
    //     return time;
    // }
    // static int minimumRateToEatBananas(int[] v, int h) {
    //     int maxi = maxelement(v);

    //     for (int i = 1; i <= maxi; i++) {
    //         int requireTime = calculaterequiretime(v,i);
    //         if (requireTime <= h) return i;
    //     } 
    //     return -1; // Return -1 if no valid rate is found
    // }
    // public static void main(String[] args) {
    //     int[] v = {7, 15, 6, 3};
    //     int h = 8;
    //     int ans = minimumRateToEatBananas(v, h);
    //     System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    // }


    // binary Search  
    //keypoints
    //find maximum and eliminate the search space accordincly
    public static int minEatingSpeed (int[] piles, int h) {
        int maxi = calculateMax(piles);
        int low = 1 , high = maxi;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            long totalHour = calculateTotalHour(piles,mid);

            if (totalHour <= h) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;

    }

    static long calculateTotalHour (int [] piles , int hourly) {
        int n = piles.length;
        long totalHour = 0;

        for (int i = 0; i < n; i++) {
            totalHour += Math.ceil((double)(piles[i]) / (double)(hourly));
        }

        return totalHour;
    } 

    static int calculateMax (int []piles) {
        int n = piles.length;
        int ans = piles[0];

        for (int i = 0; i < n; i++) {
            if (piles[i] > ans) {
                ans = piles[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int piles[] = {3,6,7,11};
        int h = 8;
        int totalH = minEatingSpeed(piles,h);
        System.out.println("The minimum  bananas pr hour is " + totalH);
    }
}


