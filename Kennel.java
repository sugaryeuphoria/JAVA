/*
Design and implement a class called Dog that contains instance
data that represent the dog’s name and age. Define the Dog con-
structor to accept and initialize instance data. Include getter and
setter methods for the name and age. Include a method to com-
pute and return the age of the dog in “person years” (seven times
the dog’s age). Include a toString method that returns a one-line
description of the dog. Create a driver class called Kennel, whose
main method instantiates and updates several Dog objects.
*/

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public int getAgeInPersonYears(){
        return age * 7;
    }
    public String toString(){
        return "Dog named "+ name + " is " + age + " years old ";
    }    
}
class Kennel{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Oreo" , 4);
        Dog dog2 = new Dog("Bolt" , 2);
        Dog dog3 = new Dog("Tannie" , 1);

        System.out.println("Dog1: "+ dog1);
        System.out.println("Dog2: "+ dog2);
        System.out.println("Dog3: "+ dog3);

        dog2.setName("Bam");
        dog2.setAge(5);
        System.out.println("Dog2: "+ dog2);
        
        System.out.println(dog1.getName() + " age in person years "+ dog1.getAgeInPersonYears());
        System.out.println(dog2.getName() + " age in person years "+ dog2.getAgeInPersonYears());
        System.out.println(dog3.getName() + " age in person years "+ dog3.getAgeInPersonYears());
    }
}