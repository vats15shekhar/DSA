package ArraysAdvanced;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int t = target;
        Map<Integer, Integer> map = new HashMap<>();
        int s = 0;
        int e = 0;
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            // value, index
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(t - nums[i]) && map.get(t - nums[i]) != i) {
                s = i;
                e = map.get(t - nums[i]);
                break;
            }
        }

        res[0] = s;
        res[1] = e;
        return res;

    }
}