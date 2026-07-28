class Solution {
    public boolean isPalindrome(int x) {
             if (x < 0) {
            return false;
        }
        int rev = 0;
        int y = x;
        while (y > 0) {
            int digit = y % 10;
            if (rev > (Integer.MAX_VALUE - digit) / 10) {
                return false; 
            }
            rev = rev * 10 + digit;
            y /= 10;
        }
        return rev == x;
    }
}
