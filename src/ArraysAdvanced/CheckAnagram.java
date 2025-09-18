package ArraysAdvanced;

import java.util.HashSet;

public class CheckAnagram {
    /**
     *
     * nums = [2,7,11,15], target = 9
     */

    public boolean checkAnagram(String a, String b) {

        HashSet<Character> set = new HashSet<>();
        if(a != null && b != null){
            for(int i = 0; i < a.length(); i++) {
                set.add(a.charAt(i));
            }

            for(int i = 0; i < b.length(); i++) {
                if(!set.contains(b.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
