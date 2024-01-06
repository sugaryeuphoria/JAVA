/*
Write a java method to check whether the given String is a valid password or not.
Password rule at least 8 characters
Password only letters and digits
At least 2 digit contains. 
--POOJA VERMA
*/
import java.util.Scanner;
public class Password_check {
    public static boolean hasTwoDigits(String input) {
        int digitCount = 0;
        for(int i=0; i<input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
                digitCount++;
            }
            if(digitCount >= 2){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the password: ");
            String password = input.nextLine();
            if((password.length() >= 8) && (hasTwoDigits(password) == true)) {
                System.out.println("It's a valid password");
            } else {
                System.out.println("It's an invalid password. Try again");
            }
    }
}
 