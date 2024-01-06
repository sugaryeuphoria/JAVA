/*
Design and implement a class called Sphere that contains in-
stance data that represent the sphere’s diameter. Define the
Sphere constructor to accept and initialize the diameter, and
include getter and setter methods for the diameter. Include meth-
ods that calculate and return the volume and surface area of the
sphere (see Programming Project 3.5 for the formulas). Include
a toString method that returns a one-line description of the
sphere. Create a driver class called MultiSphere, whose main
method instantiates and updates several Sphere objects.
*/

class Sphere {
    private double diameter; 

    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getVolume() {
        double radius = diameter / 2;
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        double radius = diameter / 2;
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Sphere with diameter: " + diameter;
    }
} 

class MultiSphere {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(20);
        Sphere sphere2 = new Sphere(30);
        Sphere sphere3 = new Sphere(40);

        System.out.println("Sphere 1: " +sphere1);
        System.out.println("Sphere 2: " +sphere2);
        System.out.println("Sphere 3: " +sphere3);

        sphere1.setDiameter(50);
        System.out.println("Sphere 1: " +sphere1);

        System.out.println("Sphere 1 volume: "+ sphere1.getVolume());
        System.out.println("Sphere 1 surface area: "+ sphere1.getSurfaceArea());

        System.out.println("Sphere 2 volume: "+ sphere2.getVolume());
        System.out.println("Sphere 2 surface area: "+ sphere2.getSurfaceArea());

        System.out.println("Sphere 3 volume: "+ sphere3.getVolume());
        System.out.println("Sphere 3 surface area: "+ sphere3.getSurfaceArea());

    }
}