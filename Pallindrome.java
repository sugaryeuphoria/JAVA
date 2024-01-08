public class Pallindrome {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int original = x;
    
    // Make a copy of the number in reverse
    while (x != 0) {
        reversed = reversed * 10 + x % 10;
        x /= 10;
    }
        // If the reversed number is the same as the original, it's a palindrome!
        return reversed == original;
    }
}
