package ArraysAdvanced;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstrNoRepChars {
    public int longstRepeatSubsNoRepChars(String str)
    {
        int left = 0;
        int maxLen = 0;

        Map<String, Integer> map = new HashMap<>();

        for(int right = 0 ; right < str.length() ; right++)
        {

            // map.get(s.charAt(right)) < left -
            // The above condition checks if the index of the current element in map
            //  is less than left. This would mean, that we have already moved the left
            // towards the right
            //And hence the existence of that element in the map will not make any difference to
            // the substring length. So we can simply consider the new element's index
            // and contribute
            // it to the maxlen
            if(!map.containsKey(String.valueOf(str.charAt(right))) || map.get(String.valueOf(str.charAt(right))) < left)
            {
                map.put(String.valueOf(str.charAt(right)), right);
                maxLen = Math.max(maxLen, right - left + 1);

            }

            else
            {
                left = map.get(String.valueOf(str.charAt(right))) + 1;
                map.put(String.valueOf(str.charAt(right)), right);
            }
        }

        return maxLen;

    }
}
