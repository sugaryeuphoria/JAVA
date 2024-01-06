/*create an instance of any data type (int i ,string s) create a constructor parametrised create a method*/
class Student {
    private int age;
    private String name;
    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber() {
        return age;
    }
    public void setNumber(int age) {
        this.age = age;
    }
    public String toString(){
        return "Name of the student is: "+ name+ " age is: "+age;
    }
}
class StudentInfo{
    public static void main(String[] args) {
        Student Obj = new Student("Pooja",17);
        Student prabhleen= new Student("Prabhleen",19);
        System.out.println(prabhleen);
        System.out.println(Obj);
    }
}
