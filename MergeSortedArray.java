import java.util.HashSet;
import java.util.Set;

public class MergeSortedArray {
    
    public int[] mergeArray(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m-1, j = n-1, k = m+n-1; j>=0 && k >= 0; k--){
            nums1[k] = (i < 0 || nums1[i] < nums2[j]) ? nums2[j--] : nums1[i--];
        }
        return nums1;
    }

    public int countingValleys(int steps, String path) {
        // Write your code here
        char[] pathArr = path.toCharArray();
        int noOfValley = 0;
        int level = 0;

        for(char p: pathArr) {
            if(p == 'U') {
                ++level;
            } else if(p == 'D') {
                --level;
            }

            if(level == 0 && p == 'D') {
                ++noOfValley;
            }
        }

        System.out.println(noOfValley);

        return noOfValley;
    }

    public int jumpingOnClouds(int[] c) {

        int noOfSteps = 0;

        for(int i = 0; i < c.length; i++, noOfSteps++) {
            if((i<c.length-2) && (c[i+2] != 0)) {
                i++;
            }
        }

        System.out.println("noOfSteps: " +noOfSteps);

        return noOfSteps;
    }


    public int sockMerchant(int n, int[] ar) {
        int pair = 0;

        Set<Integer> sockSet = new HashSet<Integer>();
        
        for(int i = 0; i < n; i++) {
            if(!sockSet.contains(ar[i])) {
                sockSet.add(ar[i]);
            } else {
                pair++;
                sockSet.remove(ar[i]);
            }
            
        }

        System.out.println(pair);

        return pair;
    }
}
