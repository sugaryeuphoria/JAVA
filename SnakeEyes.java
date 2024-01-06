/*
How many times do you have to roll a pair of dice before they come up snake eyes? You
could do the experiment by rolling the dice by hand. Write a computer program that
simulates the experiment. The program should report the number of rolls that it makes
before the dice come up snake eyes. (Note: “Snake eyes” means that both dice show a
value of 1.) 
u need to help 2 die 1,die2 =1
*/
import java.util.Random;
class SnakeEyes{
    public static void main(String[] args) {
        Random rand = new Random();
        int die1 =0;
        int die2 =0;
        int count = 0;
        while (true){
            if(die1 == 1 && die2 ==1){
                break;
            }else{
                die1 = rand.nextInt(1,6);
                die2 = rand.nextInt(1,6);
                count++;
            }
        }
        System.out.println("It took "+count+" rolls to get a snake's eye");
    }
}