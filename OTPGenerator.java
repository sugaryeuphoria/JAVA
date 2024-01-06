import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
        int length = 6;

        Random num = new Random();

        String otp = "";
        
        for(int i=0; i<length; i++) {
            otp += num.nextInt(10);
        }

        System.out.println("One-time password: "+ otp);
    }
}