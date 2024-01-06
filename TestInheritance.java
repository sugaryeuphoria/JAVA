class Mammal {
    void eat() {
        System.out.println("eating...");
    }
}

class Cat extends Mammal {
    void breathe() {
        System.out.println("breathing...");
    }
}

class BabyCat extends Cat{
    void sleep(){
        System.out.println("Sleeping...");
    }
}

class TestInheritance {
    public static void main(String args[]) {
        BabyCat c = new BabyCat();
        c.breathe();
        c.eat();
        c.sleep();
    }
} 