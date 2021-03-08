import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankMArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int sum = 0;
        int maxSum = 0;
        
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        for (int k = 0; k < 4; k++) {
            for (int m = 0; m < 4; m++) {
                sum = arr[k][m] + arr[k][m+1] + arr[k][m+2] + 
                        arr[k+1][m+1] + arr[k+2][m] + arr[k+2][m+1] + arr[k+2][m+2];
                //System.out.println(sum);
                if(maxSum < sum && (m>=0 || k>=0)) {
                    maxSum = sum;
                }
            }
        }
        
        System.out.println(maxSum);

        scanner.close();
    }
}
