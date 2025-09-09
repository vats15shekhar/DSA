package StringProblems;

public class RemoveCharToMakePalindrome {

    public int removeChar(String s) {

        int p1 = 0;
        int p2 = s.length() - 1;
        int count = 0;

        while (p1 <= p2) {
            if (s.charAt(p1) == s.charAt(p2)) {
            } else if (s.charAt(p1) != s.charAt(p2)) {
                count++;
                p1++;
                p2--;

            }
            if (count > 1) {
                return -1;
            }
        }

        return 1;
    }
}
