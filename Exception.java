public class Exception {
    public static void main(String[] args) {
        try {
          int[] myNumbers = {1, 2};
          System.out.println(myNumbers);
        } catch (Exception e) {
          System.out.println("Something went wrong.");
        } finally {
          System.out.println("The 'try catch' is finished.");
        }
      }
}