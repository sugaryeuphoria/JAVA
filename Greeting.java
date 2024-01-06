/*
Write a program that asks the user’s name, and then greets the user by name. Before
outputting the user’s name, convert it to upper case letters. For example, if the user’s
name is Fred, then the program should respond “Hello, FRED, nice to meet you!”.
*/
import java.util.Scanner;
public class Greeting{
    public static String greet(String name){
        return "Hello, "+ name.toUpperCase() +", nice to meet you!";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name =  input.nextLine();
        System.out.println(greet(name));
    }
}