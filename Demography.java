/*
Design and implement a set of classes that keep track of demo-
graphic information about a set of people, such as age, national-
ity, occupation, income, and so on. Design each class to focus
on a particular aspect of data collection. Create a driver class to
instantiate and exercise several of the classes.
*/
class Person {
    protected int age;
    protected String nationality;
    protected String occupation;
    protected double income;

    public Person(int age, String occupation, double income) {
        this.age = age;
        this.occupation = occupation;
        this.income = income;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void displayPerson(){
        System.out.println("age: "+age);
        System.out.println("income: "+income);
        System.out.println("occupation: "+occupation);
    }
}
class Nationality extends Person{
    private String country;

    public Nationality(int age, String occupation, double income, String country){
        super(age, occupation, income);
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void displayPerson(){
        super.displayPerson();
        System.out.println("country: "+ country);
    }
}

class Income extends Person {
    private int tax;

    public Income(int age, String occupation, double income, int tax) {
        super(age, occupation, income);
        this.tax = tax;
    }

    public int getTax() {
        return this.tax;
    }

    public void displayPerson() {
        super.displayPerson();
        System.out.println("Tax: "+ tax);
    }
}


public class Demography {
public static void main(String[] args) {
    Nationality nation = new Nationality(20,"Student",0,"India");
    nation.displayPerson();
}
}
