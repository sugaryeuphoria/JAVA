/*
If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. (This is
essentially the definition of the / and % operators for integers.) Write a program that asks
the user how many eggs she has and then tells the user how many dozen eggs she has and
how many extra eggs are left over.

A gross of eggs is equal to 144 eggs. Extend your program so that it will tell the user
how many gross, how many dozen, and how many left over eggs she has. For example, if
the user says that she has 1342 eggs, then your program would respond with(solution)

Your number of eggs is 9 gross, 3 dozen, and 1069

since 1342 is equal to 9*144 + 3*12 + 10.


*/
import java.util.Scanner;
class Eggs {
    public static void main(String[] args) {
        int eggs; 
        int gross; 
        int aboveGross;
        int dozens; 
        int extras; 

        Scanner input = new Scanner(System.in);

        System.out.println("How many eggs do you have?");
        eggs = input.nextInt();

        gross = eggs / 144;
        System.out.println("The gross eggs are "+ gross); // 9 * 144 = 1296 // 1342 - 1296
        aboveGross = eggs % 144;
        System.out.println("The extra remaining after the gross are "+ aboveGross);

        dozens = aboveGross / 12;
        System.out.println("The eggs in the form of dozen are "+dozens);
        extras = aboveGross % 12;
        System.out.println("The eggs remaning after the dozens are "+ extras);

        // System.out.println("Your number of eggs is "+gross+" gross, "+dozens+" dozen and "+ extras);
    }
}