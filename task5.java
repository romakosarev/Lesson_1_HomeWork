class Solution {
    public boolean isPalindrome(String s) {
        int a = 0;
        int b = s.length() - 1;
        while (a < b) {
            char chara = s.charAt(a);
            char charb = s.charAt(b);
            if (!Character.isLetterOrDigit(chara))
                a++;
            else if (!Character.isLetterOrDigit(charb))
                b--;
            else {
                if (Character.toLowerCase(chara) != Character.toLowerCase(charb))
                    return false;
                a++;
                b--;
            }
        }
        return true;

    }
}