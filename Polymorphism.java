abstract class Animal {
    protected String kind;

    public Animal() {}
    public abstract String speak();
    public String toString() {
        return "I am a "+ kind + " and I go " + speak();
    }
}

class Cat extends Animal {
    public Cat() {
        kind = "cat";
    }

    @Override
    public String speak() {
        return "Meow";
    }
}

class Cow extends Animal {
    public Cow() {
        kind = "cow";
    }
    @Override
    public String speak() {
        return "Moo";
    }
}

public class Polymorphism {
    public static void main(String[] args) { 
        Animal cat = new Cat();
        Animal cow = new Cow();
        System.out.println(cat.speak());
        System.out.println(cow.speak());
        
        

    }
    
}
 