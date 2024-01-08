public class Reverse {
    public int reverse(int x) {
        int reversed = 0;
        int remainder = 0; // Like, the leftover when you divide
        
        // Keep playing with the number until it's all used up
        while (x != 0) {
            remainder = x % 10; // Get the last digit
            reversed = reversed * 10 + remainder; // Stick it on the end
            x /= 10; // Get rid of the last digit
        }
    
        return reversed;
    }
}
