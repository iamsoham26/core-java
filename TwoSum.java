import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int remainder = target - nums[i];
            if(numMap.containsKey(remainder)){
                return new int[]{i, numMap.get(remainder)};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args) {
        TwoSum objTwoSum = new TwoSum();

        int[] ans = objTwoSum.twoSum(new int[] {1, 2, 3, 4}, 7);
        for(int a: ans){
            System.out.println(a);
        }
    }
}
