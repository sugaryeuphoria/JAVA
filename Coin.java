/*
Design and implement a class called MonetaryCoin that is derived
from the Coin class presented in Chapter 5. Store a value in the
monetary coin that represents its value, and add a method that
returns its value. Create a driver class to instantiate and computer
the sum of several MonetaryCoin objects. Demonstrate that a
monetary coin inherits its parent’s ability to be flipped.
*/
class Coin {
    private final int HEADS = 0;
    private int face; 

    public Coin() {
        flip();
    }

    public void flip() {
        face = (int)(Math.random() * 2); 
    }

    public boolean isHeads() {
        return (face == HEADS);
    }

    public String toString() {
        return (face == HEADS) ? "Heads" : "Tails";
    }
}

class MonetaryCoin extends Coin{
    private int value;

    public MonetaryCoin(int coinValue){
        value = coinValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


public class Coins {
    public static void main(String[] args) {
        MonetaryCoin obj1 = new MonetaryCoin(1);
        MonetaryCoin obj2 = new MonetaryCoin(2);
        MonetaryCoin obj3= new MonetaryCoin(5);
        int total = obj1.getValue() + obj2.getValue() + obj3.getValue();
        System.out.println("Sum of MonetaryCoins = "+ total);
        obj1.flip();
        obj2.flip();
        obj3.flip();
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
        
        
        
    }
}
