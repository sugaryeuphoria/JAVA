/*
Write a program to create a Class named Lamp.It should have a variable isON and 2 methods
Turn on and turn off Inside the main class create 2 objects
LED and halogen of the lamp class and then using object call the methods of the class.

*/
class Lamp {
    private boolean isOn;

    public String turnOn(String device) {
        isOn = true;
        return device+" is turned on";
    }

    public String turnOff(String device) {
        isOn = false;
        return device+" is turned off";
    }

    public static void main(String[] args) {
        Lamp LED = new Lamp();
        Lamp halogen = new Lamp();

        System.out.println(LED.turnOn("led"));
        System.out.println(halogen.turnOn("halogen"));

        System.out.println(LED.turnOff("led"));
        System.out.println(halogen.turnOff("halogen"));
    }
}