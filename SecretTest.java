class Circle{
    protected double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public String toString(){
        return "The area of circle " + "with radius "+ radius +" is "+area();
    }
}
class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area(){
        return 2 * Math.PI * radius * height + 2 * super.area() ;
    }

    public double volume(){
        return super.area()* height;
    }
// "The area of circle " + "with radius "+ radius +" is "+area();
    @Override
    public String toString(){
        return "Area of cylinder with radius "+radius+" and height  "+ height + "is "+ area();
    }
}

public class SecretTest {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(10, 20);
        System.out.println(obj.toString());
    }
}

