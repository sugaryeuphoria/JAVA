import java.util.Arrays;

public class Exception {
  public static void main(String[] args) {
     try {
      int[] myNumbers = {1, 2};
      // Use Arrays.toString() to print the array contents correctly:
      System.out.println(Arrays.toString(myNumbers));
    } catch (Exception e) {  // Keep the general catch block for unexpected errors
      System.out.println("Something went wrong.");
    
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}