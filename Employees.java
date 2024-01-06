class Employee {
    private String name;
    private String jobTitle;

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

} 

class Doctor extends Employee {
    public Doctor(String name) {
        super(name, "Doctor");
    }

    public String work() {
        return getName() + ", " + getJobTitle() + " is seeing patients.";
    }
}
class Nurse extends Employee{
    public Nurse(String name){
        super(name,"Nurse");
    }
    public String work(){
        return getName()+","+getJobTitle()+" Is assisting Doctor";
    }
}

public class Employees {
    public static void main(String[] args) {
        Doctor kevin = new Doctor("Kevin");
        System.out.println(kevin.work());
        Nurse alex = new  Nurse("Alex");
        System.out.println(alex.work());
    }
        
    
    
}
