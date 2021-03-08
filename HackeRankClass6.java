import java.io.*;
import java.util.*;

public class HackeRankClass6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n];
        
        for(int x = 0; x < n; x++) {
            s[x] = scan.next();
        }
        
        for(int i = 0; i < s.length; i++) {
            
            int l = s[i].length();
            char[] sChar = s[i].toCharArray();
            String even = "", odd ="";
            
            for(int j = 0; j < l; j++) {
                if(j%2 == 0){
                    even += sChar[j];
                } else {
                    odd += sChar[j];
                }
            }
            System.out.println(even+" "+odd);
        }
    }
}
