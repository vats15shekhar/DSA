package StringProblems;

public class IfCharsInStrCanFormPalindrome {

    public boolean isPalindrome(String str) {

        int MaxNum = 256;

        int[] countChar = new int[MaxNum];
        int odd = 0;

        for(int i = 0 ; i < str.length() ; i++) {
            countChar[(int)str.charAt(i)]++;
        }

        for(int i = 0 ; i < str.length() ; i++) {
            if(countChar[(int)str.charAt(i)] % 2 == 1) {
                odd++;
            }
            if(odd > 1) {
                return false;
            }
        }

        return true;

    }

}
