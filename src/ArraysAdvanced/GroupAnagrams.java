package ArraysAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class GroupAnagrams {

    public boolean findAnagram(String a, String b) {

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1, b1);
    }

    public List<List<String>> groupAnagrams(String[] a) {

        List<List<String>> result = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            set.add(a[i]);
        }

        for(String s : set){

            List<String> list = new ArrayList<>();
            list.add(s);

            for(String s1 : set){
                if(!s1.equals(s) && findAnagram(s, s1) && !list.contains(s1)){
                    list.add(s1);
                }
            }

            result.add(list);
        }
        return result;
    }

    /*
    // Simplified Solution
    // Map to store sorted string as key and list of anagrams as value
    Map<String, List<String>> map = new HashMap<>();

    // Iterate through each string
    for (String s : strs) {
        // Sort characters of the string to create key
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);

        // If key not in map, add new list; then add string to list
        List<String> list = map.get(key);
        if (list == null) {
            list = new ArrayList<>();
            map.put(key, list);
        }
        list.add(s);
    }

    // Return all lists of anagrams
    return new ArrayList<>(map.values());
     */

}
