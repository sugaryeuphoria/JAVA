/*
Write a program that simulates rolling a pair of dice. You can simulate rolling one die by
choosing one of the integers 1, 2, 3, 4, 5, or 6 at random. The number you pick represents
the number on the die after it is rolled. 

(int)(Math.random()*6) + 1

does the computation to select a random integer between 1 and 6. You can assign this
value to a variable to represent one of the dice that are being rolled. Do this twice and
add the results together to get the total roll. Your program should report the number
showing on each die as well as the total roll. For example:

The first die comes up 3
The second die comes up 5
Your total roll is 8

*/
import java.util.Random;
public class Dice{
    public static void main(String[] args) {
        Random rand = new Random();
        int die1 = rand.nextInt(1,6);
        int die2 = rand.nextInt(1,6);
        int total = die1 + die2;
        System.out.println( "The first die comes up with "+die1);
        System.out.println("The second die comes up with "+die2);
        System.out.println("The sum of both the dice is: "+total);
    }
}