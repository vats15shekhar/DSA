package Practice;

import java.util.*;

public class Practice {
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

    public List<List<String>> groupAnagrams(String[] s) {

        List<List<String>> res = new ArrayList<>();

        for(int i = 0; i < s.length; i++) {
            List<String> anagramgroup = new ArrayList<>();
            anagramgroup.add(s[i]);

            for(int j = i + 1; j < s.length; j++) {
                if(checkAnagram(s[i], s[j])){
                    anagramgroup.add(s[j]);
                }
            }

            res.add(anagramgroup);
           s[i] = null;
        }
        return res;
    }

}